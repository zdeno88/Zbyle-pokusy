package Mistrovstvi_java;

public class IfSample {
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=20;
        if (x<y)
            System.out.println("Hodnota x je mensi jak y");
        x=x*2;
        if (x==y)
            System.out.println("Hodnota x je nyni rovna y");
        x=x*2;
        if (x>y)
            System.out.println("Hodnota x je nyni vetsi jak y");
        if (x==y)
            System.out.println("Toto nyni neuvidite");
    }
}
