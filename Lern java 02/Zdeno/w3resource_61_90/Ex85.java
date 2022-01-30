package w3resource_61_90;
import java.util.Scanner;
public class Ex85 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej string: ");
        String str= Obj.nextLine();
        System.out.println(str.startsWith("Hello"));
    }
}
