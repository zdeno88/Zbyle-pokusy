package w3resource_31_60;
import java.util.Scanner;
public class Ex60 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu:");
        String veta=Obj.nextLine();
        String [] slovo=veta.split("[ ]+");
        System.out.println("Predposledni slovo je:\n"+slovo[slovo.length-2]);
    }
}
