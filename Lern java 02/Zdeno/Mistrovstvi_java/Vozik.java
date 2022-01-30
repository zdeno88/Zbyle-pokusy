package Mistrovstvi_java;

public class Vozik implements Runnable {

    public Vozik() {
        Thread t=new Thread(this,"Moje vlakno 1");
        System.out.println("vlakno 1"+t);
        t.start();
    }
    @Override
    public void run() {
        for (int i=5;i>0;i--){
            System.out.println("Vlakno jedna: "+i);
        }
        System.out.println("Beh vlakna 1 ukoncen");
    }
}
class Vozik1{
    public static void main(String[] args) {
        new Vozik();
        for (int i=5;i>0;i--){
            System.out.println("Vlakno hlavni: "+i);
        }
        System.out.println("Beh vlakna hlavni ukoncen");

            }
        }

