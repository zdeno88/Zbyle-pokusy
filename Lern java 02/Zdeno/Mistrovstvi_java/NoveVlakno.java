package Mistrovstvi_java;

public class NoveVlakno implements Runnable{
    Thread t;

    NoveVlakno() {
        t =new Thread(this,"vlakno2");
        System.out.println("Druhe vlakno"+t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("Druhe vlakno"+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Druhe vlakno preruseno");
        }
        System.out.println("Konec druheho vlakna");
    }
}
class VlaknoNove{
    public static void main(String[] args) {
        new NoveVlakno();

            try {
                for (int i=5;i>0;i--){
                    System.out.println("Prvni vlakno"+i);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e){
                System.out.println("Prvni vlakno preruseno");
            }
            System.out.println("Konec prvniho vlakna");
        }
    }

