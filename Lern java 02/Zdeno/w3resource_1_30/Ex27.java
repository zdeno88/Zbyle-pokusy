package w3resource_1_30;
import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {

        String oct,hex;
        int dec;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej oct num");
        oct= Obj.nextLine();

        dec=Integer.parseInt(oct,8);
//        System.out.println(dec);
        hex=Integer.toHexString(dec);
        System.out.println("Hex num je:"+hex.toUpperCase());

    }
}
