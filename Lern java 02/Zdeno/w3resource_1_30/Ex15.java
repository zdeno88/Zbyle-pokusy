package w3resource_1_30;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1=Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2=Obj.nextInt();
        System.out.println("cisla pred vymenou\nnum1="+num1+"\nnum2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("cisla po vymene\nnum1="+num1+"\nnum2="+num2);


    }
}
