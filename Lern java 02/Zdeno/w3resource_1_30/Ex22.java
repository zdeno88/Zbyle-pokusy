package w3resource_1_30;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {

        long mezi, vysl=0,j=1;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej decimal:");
        long bin1= Obj.nextLong();

        while (bin1>0){

            mezi=bin1%10;
            vysl=vysl + mezi*j;
            j=j*2;
            bin1=bin1/10;

        }
        System.out.println("Des cislo je:\n"+ vysl);

    }
}
