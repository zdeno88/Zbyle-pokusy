package Mistrovstvi_java;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo mesice: ");
        int mesic= Obj.nextInt();
        String season = "";
        String pole[]={"leden","unor","brezen","duben","kveten","cerven","cervenec","srpen","zari","rijen","listoped","prosinec"};
        if (mesic==1||mesic==2||mesic==12)
            season = "zima";
            else if (mesic < 6 && mesic > 2)
                season = "jaro";
            else if (mesic < 9 && mesic > 5)
                season = "leto";
            else if (mesic < 12 && mesic > 8)
                season = "podzim";
        else
            System.out.println("podivny mesic");

        System.out.println(pole[mesic-1]+" je soucasti rocniho obedobi "+season);

    }
}
