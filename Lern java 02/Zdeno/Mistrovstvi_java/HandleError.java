package Mistrovstvi_java;
import java.util.Random;
public class HandleError {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r=new Random();

        try {
            for (int i = 0; i < 32000; i++) {
                b=r.nextInt();
                c=r.nextInt();
                System.out.println(b+" a "+c);
                a = 12345 / (b / c);
                System.out.println(a);
            }
        }
        catch (ArithmeticException e){
//            System.out.println("Deleni nulou");
            System.out.println("Vyjimka: "+e);
            a=0;
        }
        System.out.println("Hodnota a="+a );
    }
}
