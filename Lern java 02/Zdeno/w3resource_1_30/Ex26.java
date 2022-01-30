package w3resource_1_30;
import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        int[] pole ={0,1,10,11,100,101,110,111};
        long oct_cislo, bin_cislo=0;
        int j=1,mez;

        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej oct cislo:");
        oct_cislo= Obj.nextLong();

        while (oct_cislo>0){

            mez=(int)(oct_cislo%10);
            bin_cislo=(pole[mez]*j + bin_cislo);
            oct_cislo=oct_cislo/10;
            j*=1000;

        }
        System.out.println("Bin cislo je:"+bin_cislo);
    }
}
