package sk.jaro.learnjava;

import java.util.Scanner;
public class Priklad1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Vloz cislo 1-4:");
        String cislo=scanner.next();
//        System.out.println("Vlozene cislo: " +cislo);
switch(cislo){
    case "1":
        System.out.println("Vlozene cislo: " +cislo);
        break;
    case "2":
        System.out.println("Vlozene cislo: " +cislo);
        break;
    case "3":
        System.out.println("Vlozene cislo: " +cislo);
        break;
    case "4":
        System.out.println("Vlozene cislo: " +cislo);
        break;
    default:
        System.out.println("Vlozene cislo neni mezi 1-5 ");
}


    }
}
