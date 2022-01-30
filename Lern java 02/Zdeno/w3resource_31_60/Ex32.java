package w3resource_31_60;
import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo");
        int num1= Obj.nextInt();
        System.out.println("Zadej druhe cislo");
        int num2= Obj.nextInt();

        if (num1<num2)
            System.out.printf("%d<%d\n",num1,num2);
        if (num1>num2)
            System.out.printf("%d>%d\n",num1,num2);
        if (num1==num2)
            System.out.printf("%d==%d\n",num1,num2);
        if (num1<=num2)
            System.out.printf("%d<=%d\n",num1,num2);
        if (num1>=num2)
            System.out.printf("%d>=%d\n",num1,num2);
        if (num1!=num2)
            System.out.printf("%d!=%d\n",num1,num2);

    }
}