package Mistrovstvi_java;
class NewThread3 implements Runnable{
    String name;
    Thread t;

    public NewThread3(String name) {
        this.name = name;
        t=new Thread(this,name);
        System.out.println("Nove vlakno"+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Beh vlakna "+name+" prerusen");
        }
        System.out.println("Beh vlakna "+name+" ukoncen");

    }
}


public class MutliThreadDemo {
    public static void main(String[] args) {
        new NewThread3("Jedna");
        new NewThread3("dve");
        new NewThread3("tri");
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println("Beh hlavniho vlakna prerusen");
        }
        System.out.println("Beh hlavniho vlakna ukoncen");

    }
}
