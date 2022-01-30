package Mistrovstvi_java;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Jake cislo chcete hledat:");
        int cislo= Obj.nextInt();
        int pole[]={6,8,10,15,25,7,2,3};
        boolean vyh=false;

        for (int x:pole){
            if (x==cislo) {
                vyh = true;
                break;
            }
        }
        if (vyh)
            System.out.println("Hodnota nalezena!!!");
        else
            System.out.println("Hodnota nenalezena");
    }
}
