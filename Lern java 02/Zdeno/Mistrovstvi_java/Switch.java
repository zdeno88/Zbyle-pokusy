package Mistrovstvi_java;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej mesic: ");
        int mesic= Obj.nextInt();
        String pole[]={"leden","unor","brezen","duben","kveten","cerven","cervenec","srpen","zari","rijen","listoped","prosinec"};
        String season="";
        switch (mesic){
            case 12:
            case 1:
            case 2:
                season="zima";
                break;
            case 3:
            case 4:
            case 5:
                season="jaro";
                break;
            case 6:
            case 7:
            case 8:
                season="leto";
                break;
            case 9:
            case 10:
            case 11:
                season="podzim";
                break;

            default:
                season="podivny mesic";
                System.out.println(season);


        }
        System.out.println(pole[mesic-1]+" je soucasti rocniho obdobi " +season);

    }
}
