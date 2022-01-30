package w3resource_61_90;
import java.util.Scanner;
public class Ex64 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1 = Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2 = Obj.nextInt();
        System.out.println("Vysledek je: "+vyp(num1,num2));
    }
    public static boolean vyp(int a, int b){
        if (a<25||a>75||b<25||b>75)
            return false;
        int x=a%10;
        int y=b%10;
        a/=10;
        b/=10;
        return (a==b||a==y||y==x||y==b);
    }
}