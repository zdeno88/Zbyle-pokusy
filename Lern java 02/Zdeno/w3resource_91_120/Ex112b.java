package w3resource_91_120;
import java.util.Scanner;
public class Ex112b {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        int num= Obj.nextInt();
        int num1=num;
        long ctr=0;
        while(num!=0){
            ctr+=num/5;
            num/=5;
        }
        System.out.printf("Cislo na faktorial je %d pocet nul je %d",num1,ctr);
    }
}
