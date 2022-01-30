package w3resource_1_30;
import java.util.Scanner;
public class Ex30 {
    public static int hex_to_dec(String s){
        int val=0;
        String digit="0123456789ABCDEF";
        String s1=s.toUpperCase();
        for (int i=0;i<s1.length();i++){
            char a=s1.charAt(i);
            int b=digit.indexOf(a);
            val=val*16+b;
        }
        return val;
    }
    public static void main(String[] args) {
        int dec,i=1,j;
        int oct[]=new int[100];
        Scanner Obj= new Scanner(System.in);
        System.out.println("Zadej hex cislo:");
        String hex= Obj.nextLine();
        dec=hex_to_dec(hex);
//        System.out.println("Dec cislo je:"+dec);
        while (dec!=0){
            oct[i++]=dec%8;
            dec=dec/8;
        }
        System.out.println("Oct cislo je:");
        for (j=i-1;j>0;j--){
            System.out.print(oct[j]);
        }
    }
}
