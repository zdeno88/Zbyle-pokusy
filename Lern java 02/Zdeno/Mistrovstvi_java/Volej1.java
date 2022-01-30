package Mistrovstvi_java;

public class Volej1 {
    synchronized void volej(String zprava){
        System.out.print("["+zprava);
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
        }
        System.out.println("]");
    }
}
class Volajici1 implements Runnable{
    Thread t;
    Volej1 cil;
    String zpr;

    public Volajici1(String s,Volej1 targ){
        cil=targ;
        zpr=s;
        t=new Thread(this);
        t.start();
    }
    public void run() {
        cil.volej(zpr);
    }
}
class Synchon{
    public static void main(String[] args) {
        Volej1 cil=new Volej1();
        Volajici1 ob1=new Volajici1("Ahoj",cil);
        Volajici1 ob2=new Volajici1("svete",cil);
        Volajici1 ob3=new Volajici1("synchronized",cil);
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e){

        }
    }
}
