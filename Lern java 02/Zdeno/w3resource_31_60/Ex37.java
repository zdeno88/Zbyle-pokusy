package w3resource_31_60;
import java.util.Scanner;
public class Ex37 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu:");
        char[]pole=Obj.nextLine().toCharArray();
        System.out.println("Obracena veta:");
        for (int i= pole.length-1;i>=0;i--){
            System.out.print(pole[i]);
        }
    }

}