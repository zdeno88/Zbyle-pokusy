package Mistrovstvi_java;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Aktualni vlakno "+t);
        t.setName("Moje vlakno");
        System.out.println("Po zmene nazvu vlakna "+t);

        try {
            for (int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Hlavni vlakno preruseno");
        }
    }
}
