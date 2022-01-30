package w3resource_31_60;
import java.util.Scanner;
public class Ex59 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu:");
        String veta= Obj.nextLine();
        veta=veta.toLowerCase();
        System.out.println("Veta s malymi pismeny je:\n"+veta);
    }
}
