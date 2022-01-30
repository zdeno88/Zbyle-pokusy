package Mistrovstvi_java;

import java.util.Scanner;

public class SumAvr {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        double sum = 0,avr = 0;
        System.out.println("Zadej cisla a ukonci konec");
        while (scr.hasNext()){
            if (scr.hasNextDouble()){
               sum+=scr.nextDouble();
               avr++;
            }
            else {
                String str=scr.next();
                if (str.equals("konec")) {
                    System.out.println("Prumer cisel je: " + sum / avr);
                    break;
                }
                else
                    System.out.println("Nespravny datovy typ");
                break;

            }


        }

    }
}
