package Mistrovstvi_java;

public class HruskyTrida {
    public static void main(String[] args) {
        Hrusky hru;
        System.out.print("Cena hrusky bile je: ");
        System.out.println(Hrusky.bila.getCena()+" Kc");
        for (Hrusky a :Hrusky.values()) {
            System.out.println("Hruska "+a+" stoji "+a.getCena()+" Kc");
        }
        }
    }


