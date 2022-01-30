package w3resource_31_60;
import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej zemepisnou sirku1");
        double sir1= Obj.nextDouble();
        System.out.println("Zadej zemepisnou delku1");
        double del1= Obj.nextDouble();
        System.out.println("Zadej zemepisnou sirku2");
        double sir2= Obj.nextDouble();
        System.out.println("Zadej zemepisnou delku2");
        double del2= Obj.nextDouble();
        System.out.println("Vzdalenost bodu je:" +vyp_vzd(sir1,del1,sir2,del2));
    }
    public static double vyp_vzd(double sir1, double del1, double sir2,double del2){

        double radius=6371.01;
        sir1=Math.toRadians(sir1);
        sir2=Math.toRadians(sir2);
        del1=Math.toRadians(del1);
        del2=Math.toRadians(del2);
        return radius*Math.acos(Math.sin(sir1)*Math.sin(sir2)+Math.cos(sir1)*Math.cos(sir2)* Math.cos(del1 - del2));

    }

}
