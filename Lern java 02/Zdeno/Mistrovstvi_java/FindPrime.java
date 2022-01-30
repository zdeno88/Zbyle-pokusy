package Mistrovstvi_java;
import java.util.Scanner;
public class FindPrime {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int num= Obj.nextInt();
        boolean isPrime;

        if (num<2)
            isPrime=false;
        else
            isPrime=true;
        for (int i=2;i<=num/i;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num+" neni prvocislo");
        else
            System.out.println(num+" jeni prvocislo");
    }
}
