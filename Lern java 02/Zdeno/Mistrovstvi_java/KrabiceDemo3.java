package Mistrovstvi_java;

public class KrabiceDemo3 {
    public static void main(String[] args) {
        Krabice mojekrabice1=new Krabice(10,20,15);
        Krabice mojekrabice2=new Krabice(3,6,9);

//        mojekrabice1.hloubka=10;
//        mojekrabice1.vyska=20;
//        mojekrabice1.sirka=15;
//
//        mojekrabice2.sirka=3;
//        mojekrabice2.vyska=6;
//        mojekrabice2.hloubka=9;

        mojekrabice1.objem();
        mojekrabice2.objem();

    }
}
