package w3resource_91_120;
import java.util.Scanner;
public class Ex109 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int num= Obj.nextInt();
        if (num>0)
            System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)num + 1) - 1) / 2)));

    }
}
