package w3resource_91_120;
import java.util.Scanner;
public class Ex112 {
    public static void main(String[] arg) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int pocet_nul=0;
        int num = Obj.nextInt();
        long factorial=factorial_poc(num);
        System.out.printf("Faktorial cisla %d je %d",num,factorial);
        while (factorial>0){
            if (factorial%10==0){
                pocet_nul++;}
            else
                break;

            factorial=factorial/10;
        }
        System.out.println("\nPocet nul je: "+pocet_nul);


    }


    public static long factorial_poc(int a) {
        long vys=1;
        for (int i=1;i<=a;i++){
            vys*=i;
        }
        return vys;
    }

}



