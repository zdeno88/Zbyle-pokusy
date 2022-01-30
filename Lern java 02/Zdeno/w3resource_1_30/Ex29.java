package w3resource_1_30;
import java.util.Scanner;
public class Ex29 {
    public static int hex_to_dec(String s){

        String digit="0123456789ABCDEF";
        s=s.toUpperCase();
        int val=0;
        for(int i=0;i<s.length();i++){

            char a=s.charAt(i);
            int b=digit.indexOf(a);
            val=val*16+b;

        }
        return val;

    }

    public static void main(String[] args) {

        int dec_num,i=1,j;
        int pole[]=new int[100];
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej hex cislo:");
        String hex=Obj.nextLine();
        dec_num=hex_to_dec(hex);
        System.out.println("dec cislo je:\n"+dec_num);

        while (dec_num!=0){
           pole[i++] = dec_num%2;
           dec_num=dec_num/2;

        }
        for (j=i-1;j>0;j--) {
            System.out.print(pole[j]);
        }

    }
}
