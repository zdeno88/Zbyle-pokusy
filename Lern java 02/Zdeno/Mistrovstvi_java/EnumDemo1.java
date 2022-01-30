package Mistrovstvi_java;

public class EnumDemo1 {
    public static void main(String[] args) {
        Jablko jab;
        System.out.println("Vycet hodnot enum jablko");
        Jablko allapples[]=Jablko.values();
        for (Jablko a:allapples) {
            System.out.println(a);
        }
        jab=Jablko.valueOf("Golden");
        System.out.println("Hodnota promene jab je: "+jab);
    }
}
