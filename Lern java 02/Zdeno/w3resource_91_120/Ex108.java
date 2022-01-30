package w3resource_91_120;
import java.util.Scanner;
public class Ex108 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int cislo= Obj.nextInt();
        if (cislo>0){
            System.out.println("Vysledek="+(cislo==0? 0:cislo%9==0?0:(cislo%9)));
        }
    }
}
