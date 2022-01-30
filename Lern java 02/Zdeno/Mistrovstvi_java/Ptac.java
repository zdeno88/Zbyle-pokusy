package Mistrovstvi_java;
public class Ptac {
    public static void main(String[] args) {
        Odpovidac ob=new Odpovidac();
        while (true){
                try {
                    Thread.sleep(500);

                }
                catch (Exception e){
                    System.out.println("Vyjimka1");
                }

                System.out.println("Vlozena hodnota:"+ob.vlozHod);

            }
        }
    }
class Odpovidac implements Runnable {
    Thread t;
    int vlozHod=0;
        {
        t = new Thread(this);
        t.start();
    }
    @Override
    synchronized public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Vyjimka2");
            }
            System.out.println("Predana hodnota:"+vlozHod);
            vlozHod++;
            Thread.yield();

        }
    }
}



