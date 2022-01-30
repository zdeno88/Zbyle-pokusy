package Mistrovstvi_java;

public class VlaknoMoje implements Runnable{
    Thread t;
    String name;

    public VlaknoMoje(String name) {
        t=new Thread(this,name);
        this.name=name;
        t.start();
    }


    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++){
                System.out.println(name+": "+i);
                Thread.sleep(500);
        }
        }
        catch (Exception e){
            System.out.println("Vyjimka");
        }
    }
}

class RunVlak{
    public static void main(String[] args) {
        new VlaknoMoje("Jedna");
        new VlaknoMoje("Dve");
        new VlaknoMoje("Tri");
        try {
            for (int i=0;i<5;i++){
                System.out.println("Hlavni vlakno: "+i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println("Vyjimka");
        }
//        vm1.run();
    }
}