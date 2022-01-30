package Mistrovstvi_java;

public class Ternary {
    public static void main(String[] args) {
       int k,i=10;

       k=i<0 ? -i:i;
        System.out.println("Absolutni hodnota " +i+ " je "+k);
        i=-10;
        k=i<0 ? -i:i;
        System.out.println("Absolutni hodnota " +i+ " je "+k);

    }
}
