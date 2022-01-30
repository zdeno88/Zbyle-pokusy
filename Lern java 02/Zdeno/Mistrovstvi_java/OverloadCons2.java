package Mistrovstvi_java;

public class OverloadCons2 {
    public static void main(String[] args) {
        Krabice mojeKrabice1=new Krabice(10,20,15);
        Krabice mojeKrabice2=new Krabice();
        Krabice mojeKrabice3=new Krabice(7);
        Krabice mujKlon=new Krabice(mojeKrabice1);
        double obj;

        obj=mojeKrabice1.objem();
        System.out.println("Objem krabice 1 je: "+obj);

        obj=mojeKrabice2.objem();
        System.out.println("Objem krabice 2 je: "+obj);

        obj=mojeKrabice3.objem();
        System.out.println("Objem krabice 3 je: "+obj);

        obj=mujKlon.objem();
        System.out.println("Objem krabice mujKlon je: "+obj);

    }
}
