package w3resource_1_30;

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni cislo");
        int num1 = Obj.nextInt();
        System.out.println("Zadej druhe cislo");
        int num2 = Obj.nextInt();
        int res= num1*num2;
        System.out.println(num1+"x"+num2+"="+res);
    }
}
