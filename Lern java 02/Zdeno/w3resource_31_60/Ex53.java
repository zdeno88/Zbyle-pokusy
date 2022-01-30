package w3resource_31_60;
import java.util.Scanner;
public class Ex53 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1= Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2= Obj.nextInt();
        System.out.println("Zadej treti cislo:");
        int num3= Obj.nextInt();
        System.out.println("Vysledek je:" +porovnani(num1,num2,num3,true));
    }
    public static boolean porovnani(int a, int b, int c, boolean abc){

        if (abc)
        return (a<b);
        return (a<b &&b<c);


    }
}
