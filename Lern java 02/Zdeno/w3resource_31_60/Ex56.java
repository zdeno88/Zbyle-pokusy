package w3resource_31_60;
import java.util.Scanner;
public class Ex56 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1= Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2= Obj.nextInt();
        System.out.println("Zadej delitel:");
        int del= Obj.nextInt();
        System.out.println("Pocet delitelnych cisel je:"+vyp(num1,num2,del));
    }
    public static int vyp(int a, int b,int c){

        if (a<b) {
            return (b / c - a / c);}
          else  return (a / c - b / c);

    }
}
