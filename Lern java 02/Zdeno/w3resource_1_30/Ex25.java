package w3resource_1_30;

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {

        long oct_cislo, dec_cislo=0,i=0;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej oct cislo:");
        oct_cislo= Obj.nextLong();

        while (oct_cislo>0){

            dec_cislo= (long)(dec_cislo+(oct_cislo%10)*Math.pow(8,i++));
            oct_cislo=oct_cislo/10;

        }
        System.out.println("Dec cislo je:"+dec_cislo);

    }

}
