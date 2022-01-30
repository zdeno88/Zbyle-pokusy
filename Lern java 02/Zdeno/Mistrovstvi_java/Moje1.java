package Mistrovstvi_java;

public class Moje1<T extends Number> {
    T a[];
    String b;
    public Moje1(T[] a, String b) {
        this.a = a;
        this.b=b;
    }
    double prumer(){
        double sum = 0;
//        System.out.print("Prumer pole "+b+" je: ");
        for (int i=0;i<a.length;i++){
            sum = sum + a[i].doubleValue();
        }
        return sum/a.length;
    }
    boolean porovnaniPrumeru(Moje1<?>ob){
     if(prumer()> ob.prumer())
         return true;
     else
         return false;

    }
}
class Moje1test{
    public static void main(String[] args) {
        Integer []a={1,2,3,4,5,6};
        Double []b={1.1,2.2,3.3,4.4,5.5};
        Moje1<Integer> mojea=new Moje1<Integer>(a,"jedna");
        Moje1<Double> mojeb=new Moje1<Double>(b,"dve");
        System.out.print("Prumer pole "+mojea.b+" je: ");
        System.out.println(mojea.prumer());
        System.out.print("Prumer pole "+mojeb.b+" je: ");
        System.out.println(mojeb.prumer());

        if(mojea.porovnaniPrumeru(mojeb))
        System.out.println("Pole "+mojea.b+" je > nez pole "+mojeb.b);
        else
            System.out.println("Pole "+mojea.b+" je < nez pole "+mojeb.b);
    }
}
