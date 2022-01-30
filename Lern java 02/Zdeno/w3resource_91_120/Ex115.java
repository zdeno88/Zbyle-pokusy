package w3resource_91_120;
import java.util.Scanner;
public class Ex115 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int num= Obj.nextInt();
        System.out.printf("Zadane cislo %d je palidrome?",num);
        System.out.println(vys(num));
    }
    public static boolean vys(int a){
        String veta=String.valueOf(a);
        int b=0;
        int c=veta.length()-1;
        while (b<c){
            if (veta.charAt(b++)!=veta.charAt(c--))
                return false;

        }
        return true;
    }
}
