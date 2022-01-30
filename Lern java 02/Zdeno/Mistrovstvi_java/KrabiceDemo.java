package Mistrovstvi_java;
class Krabice{
    double sirka;
    double vyska;
    double hloubka;

    double objem(){
        return sirka*hloubka*vyska;
    }
    Krabice(Krabice ob){
        sirka=ob.sirka;
        vyska=ob.vyska;
        hloubka=ob.hloubka;
    }

     Krabice(double sirka, double hloubka, double vyska){
         this.sirka=sirka;
         this.vyska=vyska;
         this.hloubka=hloubka;
    }

    Krabice(double stranaKrychle) {
        sirka=vyska=hloubka=stranaKrychle;

    }

    public Krabice() {
        sirka=-1;
        hloubka=-1;
        vyska=-1;
    }
    //    void nastavRozmery(double x, double y, double z){
//        sirka=x;
//        vyska=y;
//        hloubka=z;
    static class KrabiceHmotnost extends Krabice{
        double hmotnost;
        KrabiceHmotnost(int hloubka,int sirka, int vyska,double hmotnost){
            this.hloubka=hloubka;
            this.sirka=sirka;
            this.vyska=vyska;
            this.hmotnost=hmotnost;


        }


        }
    }


public class KrabiceDemo {
    public static void main(String[] args) {
        Krabice mojekrabice= new Krabice(10,20,15);
        double objem;
//        mojekrabice.hloubka=10;
//        mojekrabice.sirka=20;
//        mojekrabice.vyska=15;

        objem= mojekrabice.hloubka* mojekrabice.sirka* mojekrabice.vyska;
        System.out.println("Objem je: "+objem);
    }
}
