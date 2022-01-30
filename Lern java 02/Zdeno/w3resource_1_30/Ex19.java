package w3resource_1_30;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        int i=1,j;
        int bin_num[]=new int[100];
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej decimalni cislo");
        int dec_num1= Obj.nextInt();

        while(dec_num1!=0){
            bin_num[i++]=dec_num1%2;
            dec_num1=dec_num1/2;
        }
        System.out.println("Binary number is:");
        for (j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }

    }
}
