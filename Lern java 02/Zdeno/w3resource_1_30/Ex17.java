package w3resource_1_30;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        int i=0,zbytek=0;
        int[] sum=new int[10];
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni binarni cislo");
        long binar1= Obj.nextLong();
        System.out.println("Zadej druhe binarni cislo");
        long binar2= Obj.nextLong();

        while (binar1 >0 || binar2 >0){
            sum[i++]=(int)((binar1%10 + binar2%10+zbytek)%2);
            zbytek=(int)((binar1%10 + binar2%10+zbytek)/2);
            binar1=binar1/10;
            binar2=binar2/10;
        }
        if (zbytek>0){
            sum[i++]=zbytek;
        }
        --i;
        System.out.println("Vysledek sum:");
        while(i>=0) {
            System.out.print(sum[i--]);
        }

    }
}

