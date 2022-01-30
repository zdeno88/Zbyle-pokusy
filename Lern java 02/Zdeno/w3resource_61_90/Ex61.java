package w3resource_61_90;
import java.util.Scanner;
public class Ex61 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu nebo slovo:");
        String veta= Obj.nextLine();
        veta=veta.trim();
//        System.out.println(veta.length());
        char[] pole=veta.toCharArray();
        String result="";
        for (int i=pole.length-1;i>=0;i--){
            result +=pole[i];
        }
        System.out.println(result);
    }
}
