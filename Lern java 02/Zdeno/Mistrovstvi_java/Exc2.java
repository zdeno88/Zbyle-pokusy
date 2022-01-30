package Mistrovstvi_java;

public class Exc2 {
    public static void main(String[] args) {
        int d=0,a=42;

        try {
            int vys;
            vys=a/d;
            System.out.println("Tento text se nezobrazi");
        }
        catch (ArithmeticException e){
            System.out.println("Deleni nulou");
        }
    }
}
