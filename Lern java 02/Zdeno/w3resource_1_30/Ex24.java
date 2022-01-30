package w3resource_1_30;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {

        int pole[]=new int[100];
        long bin1,zbyt,dec1=0,j=1;
        int i=1,k;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej bin cislo:");
        bin1= Obj.nextLong();

        while (bin1>0){
            zbyt=bin1%10;
            dec1=dec1+zbyt*j;
            j=j*2;
            bin1=bin1/10;
        }
        while (dec1>0){

            pole[i++]=(int)dec1%8;
            dec1=dec1/8;
        }
        System.out.print("Vysledek je:");
        for (k=i-1;k>0;k--){
            System.out.print(pole[k]);

        }

    }
}
