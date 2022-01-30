package Mistrovstvi_java;
class NewThread2 extends Thread{
    public NewThread2() {
        super("Ukazkove vlakno");
        System.out.println("Vlakno potomka(druhe vlakno): "+this);
        start();
    }
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("Vlakno potomka(druhe vlakno): "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Vlakno potomka(druhe vlakno) preruseno");
        }
        System.out.println("Ukonceni behu Vlakno potomka(druhe vlakno)");
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i=5;i>0;i--){
                System.out.println("Hlavni(rodicovske) vlakno: "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Hlavni(rodicovske) vlakno preruseno");
        }
        System.out.println("Ukonceni behu Hlavni(rodicovske) vlakno");

    }
}
