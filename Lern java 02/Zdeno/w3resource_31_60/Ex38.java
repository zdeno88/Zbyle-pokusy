package w3resource_31_60;
import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej vetu:");
        String s= Obj.nextLine();
        vypocet(s);

    }
    public static void vypocet (String x){
        char[]pole=x.toCharArray();
        int pismena=0;
        int cislice=0;
        int mezer=0;
        int ostatni=0;
        for (int i=0; pole.length>i;i++){
            if(Character.isLetter(pole[i])) {
                pismena++;
            }
            else if(Character.isDigit(pole[i])) {
                cislice++;
            }
            else if(Character.isSpaceChar(pole[i]))
            {
                mezer++;
            }
            else{
                ostatni++;
            }
        }
        System.out.println("pocet pismen"+pismena);
        System.out.println("pocet cisel"+cislice);
        System.out.println("pocet mezer"+mezer);
        System.out.println("ostatni"+ostatni);
    }
}
