package w3resource_61_90;
import java.util.Scanner;
public class Ex72 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej String:");
        String str1= Obj.nextLine();
        int num1=str1.length();
        if (num1>=3)
            System.out.println(str1.substring(0,3));
            else if (num1==1)
                System.out.println(str1+"##");
            else
            System.out.println("###");

    }
}
