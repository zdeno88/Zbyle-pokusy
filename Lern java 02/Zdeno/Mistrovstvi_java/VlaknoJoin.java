package Mistrovstvi_java;

public class VlaknoJoin implements Runnable{
    String name;
    Thread t;
    VlaknoJoin(String jmeno){
        name=jmeno;
        t=new Thread(this,name);
        t.start();

    }
    public void run() {
        try {
            for (int i=5;i>0;i--) {
                System.out.println("vlakno "+name+" "+i);
//                Thread.sleep(1);
            }
        }
        catch (Exception e){
            System.out.println("Vlakno preruseno");
        }
        System.out.println("Beh vlakna "+name+" ukoncen");
    }
}
class VlaknoJoin2{
    public static void main(String[] args) {
        VlaknoJoin ob1=new VlaknoJoin("jedna");
        VlaknoJoin ob2=new VlaknoJoin("dva");
        VlaknoJoin ob3=new VlaknoJoin("tri");
        System.out.println("Je vlakno 1 nazivu:"+ob1.t.isAlive());
        System.out.println("Je vlakno 2 nazivu:"+ob2.t.isAlive());
        System.out.println("Je vlakno 3 nazivu:"+ob3.t.isAlive());
        ob1.t.setPriority(1);
        ob2.t.setPriority(6);
        ob3.t.setPriority(10);
        try {
            System.out.println("Cekani na ukonceni vsech vlaken");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Vlakno preruseno");
        }
        System.out.println("Je vlakno 1 nazivu:"+ob1.t.isAlive());
        System.out.println("Je vlakno 2 nazivu:"+ob2.t.isAlive());
        System.out.println("Je vlakno 3 nazivu:"+ob3.t.isAlive());
        System.out.println("Beh hlavniho vlakna ukoncen");
    }
}
