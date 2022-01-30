package w3resource_61_90;
import java.util.Scanner;
public class Ex84 {
    public static void main(String[] args) {
        Scanner Objekt= new Scanner(System.in);
        System.out.println("Zadej string:");
        String str= Objekt.nextLine();
        if (str.length()<3){
            System.out.println("Kratke slovo!!!");
        }
        else {
            String str1 = str.substring(str.length() - 3);
            System.out.println(str1 + str + str1);
        }
    }
}
