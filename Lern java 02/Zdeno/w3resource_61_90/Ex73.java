package w3resource_61_90;
import java.util.Scanner;
public class Ex73 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni string:");
        String str1= Obj.nextLine();
        System.out.println("Zadej druhy string:");
        String str2= Obj.nextLine();
        int delka=str2.length();
        String result = "";
        result+=(str1.length()>0)? str1.charAt(0):'#';
        result+=(delka>0)? str2.charAt(delka-1):'#';
        System.out.println(result);

    }
}
