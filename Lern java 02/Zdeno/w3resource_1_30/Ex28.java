package w3resource_1_30;
import java.util.Scanner;
public class Ex28 {
   public static int hex_to_dec(String s){

       String hex="0123456789ABCDEF";
       int val=0;
       s=s.toUpperCase();
       for (int i=0;i<s.length();i++){
           char c=s.charAt(i);
           int d=hex.indexOf(c);
           val=val*16+d;
       }
   return val;
   }
    public static void main(String[] args) {

       String hex_num;
       int vysl;
       Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej hex num:");
       hex_num= Obj.nextLine();
       vysl=hex_to_dec(hex_num);
        System.out.println(vysl);
    }
}
