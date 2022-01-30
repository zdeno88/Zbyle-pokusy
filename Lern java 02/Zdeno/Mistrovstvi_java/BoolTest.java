package Mistrovstvi_java;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("Hodnota b je: "+b);
        b=true;
        System.out.println("Hodnota b je: "+b);
        if (b)
            System.out.println("Tento prikaz bude proveden");
        b=false;
        if (b)
            System.out.println("Tento prikaz nebude proveden");
        System.out.println("10>9 je "+(10>9));
    }
}
