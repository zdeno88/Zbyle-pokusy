package w3resource_31_60;
import java.util.Scanner;
public class Ex35 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej pocet stran:");
        int a= Obj.nextInt();
        System.out.println("Zadej delku strany:");
        double b= Obj.nextDouble();
        System.out.print("plocha je:"+ area_poly(a,b));
    }
    public static double area_poly (int a, double b){
        return  ((a*b*b)/(4*Math.tan(Math.PI/a)));
    }
}
