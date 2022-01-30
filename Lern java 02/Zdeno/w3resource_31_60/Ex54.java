package w3resource_31_60;
import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1= Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2= Obj.nextInt();
        System.out.println("Zadej treti cislo:");
        int num3= Obj.nextInt();
        System.out.println("Vysledek je:"+exe(num1,num2,num3));
    }
    public static boolean exe(int a, int b, int c){

        return (a%10==b%10||a%10==c%10||c%10==b%10);

    }
}
