package w3resource_61_90;
import java.util.Scanner;
public class Ex86 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        int num= Obj.nextInt();
        int vys=0;
        while (num!=1){
            System.out.println(num);
            if (num%2==0){
                num=num/2;
                vys+=1;
            }
            else
                num=(num*3+1)/2;
                vys+=1;
        }
        System.out.println(vys);
        Obj.close();
    }
}
