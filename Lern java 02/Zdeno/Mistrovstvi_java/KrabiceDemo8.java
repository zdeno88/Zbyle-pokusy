package Mistrovstvi_java;

public class KrabiceDemo8 {
    public static void main(String[] args) {
        Krabice.KrabiceHmotnost ob1=new Krabice.KrabiceHmotnost(10,20,15,34.3);
        Krabice.KrabiceHmotnost ob2=new Krabice.KrabiceHmotnost(2,3,4,0.076);

        System.out.println("Objem krabice 1 je: "+ob1.objem());
        System.out.println("Hmotnost krabice 1 je: "+ob1.hmotnost );
        System.out.println("Objem krabice 2 je: "+ob2.objem());
        System.out.println("Hmotnost krabice 2 je: "+ob2.hmotnost );
    }
}
