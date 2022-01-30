package Mistrovstvi_java;

public class Mam1 {
    synchronized void volam(String zprava){
        try {
            System.out.print("["+zprava);
            Thread.sleep(500);
        }
        catch (Exception e){
        }
        System.out.println("]");
    }
}
class Mam2 implements Runnable{
    Thread t;
    Mam1 zprava;
    String cil;
    public Mam2(Mam1 call, String name) {
        t=new Thread(this);
        this.zprava = call;
        this.cil=name;
        t.start();
    }
    @Override
    public void run() {
        zprava.volam(cil);
    }
}
class Mam3{
    public static void main(String[] args) {
        Mam1 cil=new Mam1();
        new Mam2(cil, "Ahoj");
        new Mam2(cil, "svete");
        new Mam2(cil, "cau");
    }
}
