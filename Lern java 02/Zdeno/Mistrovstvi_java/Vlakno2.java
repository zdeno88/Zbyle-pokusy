package Mistrovstvi_java;

public class Vlakno2 implements Runnable{
    Thread t;
    String name;

    public Vlakno2(String jmeno) {
        name = jmeno;
        t = new Thread(this,name);
        System.out.println("Nove vlakno"+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("vlakno "+name+" "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("vlakno preruseno");
        }
        System.out.println("Beh vlakna "+name+" ukoncen");
    }
}
class VlaknoMoje1{
    public static void main(String[] args) {
        new Vlakno2("jedna");
        new Vlakno2("dva");
        new Vlakno2("tri");
        try {
            Thread.sleep(5000);
            System.out.println("Hlavni vlakno ukonceno");
        }
        catch (InterruptedException e){

        }

    }
}
