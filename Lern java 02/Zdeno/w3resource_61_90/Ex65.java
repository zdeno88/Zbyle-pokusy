package w3resource_61_90;

import java.util.Scanner;
public class Ex65 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int num1 = Obj.nextInt();
        System.out.println("Zadej druhe cislo:");
        int num2 = Obj.nextInt();
        int pom= num1/num2;
        int vys = num1-(pom*num2);
        System.out.println("Vysledek je: "+vys);

    }
}

