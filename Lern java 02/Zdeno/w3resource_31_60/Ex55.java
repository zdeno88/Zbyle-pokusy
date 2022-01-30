package w3resource_31_60;
import java.util.Scanner;
public class Ex55 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej pocet sekund");
        int sec1= Obj.nextInt();
        int sec=sec1%60;
        int min=(sec1/60)%60;
        int hod=sec1/3600;
        System.out.printf("%d:%d:%d",hod,min,sec);
    }
}
