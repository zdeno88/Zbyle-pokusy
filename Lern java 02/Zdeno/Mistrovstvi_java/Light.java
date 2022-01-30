package Mistrovstvi_java;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long second;
        long distance;
        lightspeed= 299792;
        days=1000;
        second=days*24*60*60;
        distance=lightspeed*second;
        System.out.print("Za "+days);
        System.out.print(" dnu svetlo urazi zhruba ");
        System.out.println(distance+" kilometru");
    }
}
