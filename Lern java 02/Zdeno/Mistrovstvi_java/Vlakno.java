package Mistrovstvi_java;

public class Vlakno {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Nazev vlakna je: "+t);
        t.setName("Moje vlakno");
        System.out.println("Nazev vlakna po zmene je: "+t);
       try {
           for (int i=5;i>0;i--){
               System.out.println(i);
               Thread.sleep(1000);
           }
       }
       catch (InterruptedException e){
           System.out.println("vlakno preruseno");
       }

    }
}
