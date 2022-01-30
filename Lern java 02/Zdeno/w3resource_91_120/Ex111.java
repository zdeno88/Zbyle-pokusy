package w3resource_91_120;
import java.util.Scanner;
public class Ex111 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni cislo");
        int x= Obj.nextInt();
        System.out.println("Zadej druhe cislo");
        int y= Obj.nextInt();
        while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x);

    }
}
