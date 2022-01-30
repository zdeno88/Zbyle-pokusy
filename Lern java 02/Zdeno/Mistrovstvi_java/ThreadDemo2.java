package Mistrovstvi_java;

class NewThreed3 implements Runnable{
    String name;
    Thread t;

    public NewThreed3(String name) {
        this.name = name;
        t= new Thread(this,name);
        System.out.println("Nove vlakno"+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println("Beh vlakna "+name+" prerusen");

        }
        System.out.println("Beh vlakna "+name+" ukoncen");

    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        NewThreed3 ob1=new NewThreed3("prvni");
        NewThreed3 ob2=new NewThreed3("druhe");
        NewThreed3 ob3=new NewThreed3("treti");

        System.out.println("Prvni vlakno stale bezi "+ob1.t.isAlive());
        System.out.println("Druhe vlakno stale bezi "+ob2.t.isAlive());
        System.out.println("Treti vlakno stale bezi "+ob3.t.isAlive());

        try {
            System.out.println("Cekani na ukonceni ostatnich vlaken vlaken");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        }
        catch (InterruptedException e){
            System.out.println("Beh hlavniho vlakna prerusen");
        }
        System.out.println("Prvni vlakno stale bezi "+ob1.t.isAlive());
        System.out.println("Druhe vlakno stale bezi "+ob2.t.isAlive());
        System.out.println("Treti vlakno stale bezi "+ob3.t.isAlive());
        System.out.println("Beh hlavniho vlakna ukoncen");
    }
}
