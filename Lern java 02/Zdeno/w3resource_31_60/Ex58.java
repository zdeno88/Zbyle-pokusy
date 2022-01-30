package w3resource_31_60;
import java.util.Scanner;
public class Ex58 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu:");
        String veta= Obj.nextLine();
        String veta_velka="";
        Scanner veta_scan=new Scanner(veta);
//        System.out.println(veta_velka);
        while (veta_scan.hasNext()){
            String slovo=veta_scan.next();
            veta_velka+=Character.toUpperCase(slovo.charAt(0))+slovo.substring(1)+" ";

        }
        System.out.println(veta_velka.trim());
    }
}
