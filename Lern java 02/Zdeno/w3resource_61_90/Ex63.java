package w3resource_61_90;
import java.util.Scanner;
public class Ex63 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1 = Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2 = Obj.nextInt();
        System.out.println("Vysledek je: " + vyp(num1,num2));
    }
    public static int vyp(int a,int b){
        if (a==b)
            return 0;
            if (a%6==b%6)
                return (a<b)?a:b;
            return (a>b)?a:b;

    }
}
