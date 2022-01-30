package w3resource_31_60;
import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int num1= Obj.nextInt();
        int sum=sum_num(num1);
        System.out.println("Soucet cislic je:"+sum);
    }
    public static int sum_num(int a) {
        int b = 0, c;
        while (a > 0) {
            c = a % 10;
            a = a / 10;
            b = b + c;
        }
        return b;
    }
}
