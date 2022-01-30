package Mistrovstvi_java;

public class UserStatic {
    static int a=3;
    static int b;
    static void metr(int x){
        System.out.println("x= "+x);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    static {
        System.out.println("Staticky blok inicializovan:");
        b=a*4;
    }
    public static void main(String[] args) {
        metr(42);
    }
}