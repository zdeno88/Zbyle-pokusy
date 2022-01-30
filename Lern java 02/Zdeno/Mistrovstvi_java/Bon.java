package Mistrovstvi_java;

public class Bon <T extends Number>{
    T a[];
    T v;
    public Bon(T[] a,T v) {
        this.a = a;
        this.v= v;
    }
    void ubon(){
        System.out.print("Hodnota pole a je: { ");
//        System.out.println(v);
        for (int i=0;i<a.length;i++){
            if (i!=((int)v-1))
                System.out.print(a[i]+", ");
            else
                System.out.print(a[i]);
            }
        System.out.println("}");
        }

        double pbon(){
        double sum = 0;
        for (int i=0;i<a.length;i++){
            sum+=a[i].doubleValue();
        }
        return sum/a.length;
        }
    }

class Bom{
    public static void main(String[] args) {
        Integer pol[]={1,2,3,4,5};
        Bon<Integer> aa=new Bon<Integer>(pol, pol.length);
        aa.ubon();
        System.out.println("Hodnota prumeru pople je: "+aa.pbon());

        Double dpol[]={1.1,2.2,3.3,4.4,5.5};
        Bon<Double> bb=new Bon<Double>(dpol, (double) dpol.length);
        bb.ubon();
        System.out.println("Hodnota prumeru pople je: "+bb.pbon());

    }
}
