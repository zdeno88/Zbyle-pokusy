package w3resource_61_90;
import java.util.Scanner;
public class Ex62 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1= Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2= Obj.nextInt();
        System.out.println("Zadej treti cislo:");
        int num3= Obj.nextInt();
        System.out.println(Math.abs(num1-num2)>=20||Math.abs(num2-num3)>=20||Math.abs(num3-num1)>=20);
    }
}
