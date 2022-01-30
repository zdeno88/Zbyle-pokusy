package w3resource_31_60;
import java.util.Scanner;
public class Ex34 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej stranu sestiuhelniku:");
        double a= Obj.nextDouble();
        System.out.println("Obsah sestiuhelniku je:"+hex_area(a));
    }
    public static double hex_area(double a){
        return (6*a*a)/(4*Math.tan(Math.PI/6));
    }
}
