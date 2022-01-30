package w3resource_1_30;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni:");
        int num1 = Obj.nextInt();
        for (int a=0;a<=10;a++){
            int res= num1*a;
            System.out.println(num1+"x"+a+"="+res);
        }
    }
}
