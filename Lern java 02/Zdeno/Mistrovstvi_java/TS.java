package Mistrovstvi_java;
class Q{
    int n;
    boolean valueset=false;
    synchronized int get(){
        while (!valueset)
        try {
            wait();
        }
        catch (InterruptedException e){
            System.out.println("Zachyceni");
        }
        System.out.println("Predana hodnota je: "+n);
        valueset=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (valueset)
            try {
                wait();
            }
            catch (InterruptedException e){
                System.out.println("Zachyceni");
            }
        this.n=n;
            valueset=true;
            notify();
        System.out.println("Vlozena hodnota je: "+n);
    }
}
class Tvurce implements Runnable{
    Q q;

    Tvurce(Q q) {
        this.q = q;
        new Thread(this,"Tvurce").start();
    }

    public void run() {
        int i=0;
        try {
            while (true){
                q.put(i++);
                Thread.sleep(100);
            }
        }
        catch (Exception e){
            System.out.println("Beh vlakna prerusen");
        }

    }
}
class Spotrebitel implements Runnable{
    Q q;
    Spotrebitel(Q q) {
        this.q = q;
        new Thread(this,"Spotrebitel").start();
    }
    public void run() {
        try {
            while (true){
                q.get();
                Thread.sleep(100);
            }
        }
        catch (Exception e){
            System.out.println("Beh vlakna prerusen");
        }
    }
}
public class TS {
    public static void main(String[] args) {
        Q q=new Q();
        new Tvurce(q);
        new Spotrebitel(q);
        System.out.println("Program ukoncite CTRL + F2");

    }
}
