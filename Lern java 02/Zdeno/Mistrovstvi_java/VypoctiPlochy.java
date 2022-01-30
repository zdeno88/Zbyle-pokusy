package Mistrovstvi_java;
abstract class Utvar {
    double dim1;
    double din2;

    public Utvar(double dim1, double din2) {
        this.dim1 = dim1;
        this.din2 = din2;
    }
    abstract double plocha();
}
    class Trojuhelni extends Utvar{
        Trojuhelni(double dim1, double din2) {
            super(dim1, din2);
        }
        double plocha(){
            System.out.println("Plocha trojuhelniku je:");
            return dim1*din2/2;
        }
    }
    class Pravouhelnik extends Utvar{
        public Pravouhelnik(double dim1, double din2) {
            super(dim1, din2);
        }
        double plocha(){
            System.out.println("Plocha pravouhelniku je:");
            return dim1*din2;
        }
    }
public class VypoctiPlochy {
    public static void main(String[] args) {
//        Utvar f=new Utvar(10,10);
        Pravouhelnik r=new Pravouhelnik(9,5);
        Trojuhelni t=new Trojuhelni(10,8);
        Utvar figref;
        figref=r;
        System.out.println("Plocha je:"+figref.plocha());
        figref=t;
        System.out.println("Plocha je:"+figref.plocha());

    }
}
