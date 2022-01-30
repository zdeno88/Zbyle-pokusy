package Mistrovstvi_java;

public class CenaHrusky {
    public static void main(String[] args) {
        Hruska ab=Hruska.bila;
        System.out.println("Hruska "+ab+" stoji "+ab.getCenaHruska());
        System.out.println();
        for (Hruska a:Hruska.values()) {
            System.out.println(a+" ma poradi "+a.ordinal());
        }
    }
}
