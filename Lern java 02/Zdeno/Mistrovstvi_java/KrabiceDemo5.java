package Mistrovstvi_java;

public class KrabiceDemo5 {
    public static void main(String[] args) {
        Krabice mojekrabice1=new Krabice(10,20,15);
        Krabice mojekrabice2=new Krabice(3,6,9);

//        mojekrabice1.nastavRozmery(10,20,15);
//        mojekrabice2.nastavRozmery(3,6,9);

        System.out.println("Objem krabice 1 je: " +mojekrabice1.objem());
        System.out.println("Objem krabice 2 je: " +mojekrabice2.objem());

    }
}
