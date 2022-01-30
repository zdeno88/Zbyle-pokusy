package w3resource_1_30;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        int i=1,j,mezi;
        int pole[]=new int[20];
        Scanner Obj= new Scanner(System.in);
        System.out.println("Vloz decimal cislo:");
        int num1= Obj.nextInt();

        while (num1>0){
            pole[i++]=num1%8;
            num1=num1/8;
        }
        System.out.println("Vysledek se rovna:");

        for (j=i-1;j>0;j--){
            System.out.print(pole[j]);
        }
    }
}
