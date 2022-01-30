package w3resource_31_60;
import java.util.Scanner;
public class Ex51 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo(String):");
        String num= Obj.nextLine();
        int num1=Integer.parseInt(num);
        System.out.printf("Integrovane cislo je: %d",num1);
    }
}
