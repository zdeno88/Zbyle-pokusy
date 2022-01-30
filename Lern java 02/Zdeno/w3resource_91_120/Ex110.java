package w3resource_91_120;
import java.util.Scanner;
public class Ex110 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        double num = Obj.nextInt();
        int vys=0;

        for (int i=0;i<10;i++){
            if (num==Math.pow(4,i))
                vys++;
        }
        System.out.println(vys==1);
    }
}
