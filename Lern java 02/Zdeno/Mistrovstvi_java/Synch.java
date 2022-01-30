package Mistrovstvi_java;
class Volejme{
    synchronized void volej(String zprava){
        System.out.print("["+zprava);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Beh vlakna prerusen");
        }
        System.out.println("]");
    }
}
class Volajici implements Runnable{
    String zprava;
    Volejme cil;
    Thread t;
    public Volajici(Volejme targ, String s) {
        this.zprava = s;
        this.cil = targ;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        cil.volej(zprava);
    }
}
public class Synch {
    public static void main(String[] args) {
        Volejme cil=new Volejme();
        Volajici ob1=new Volajici(cil, "Ahoj");
        Volajici ob2=new Volajici(cil, "synchronized");
        Volajici ob3=new Volajici(cil, "svete");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException ex){
            System.out.println("Beh vlakna prerusen");
        }

    }
}
