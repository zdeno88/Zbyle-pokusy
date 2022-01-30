package w3resource_1_30;

import java.util.Scanner;
public class Ex20{
    public static void main(String[] args) {
        int rem;
        String hex_cislo="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej dec cislo:");
        int dec1= Obj.nextInt();

        while (dec1>0){
            rem=dec1%16;
            hex_cislo=hex[rem] + hex_cislo;
            dec1=dec1/16;
        }
        System.out.println("Hex cislo je:"+ hex_cislo);

    }
}
