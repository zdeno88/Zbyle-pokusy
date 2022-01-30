package sk.jaro.learnjava;
import java.util.Scanner;

public class DnyVtydnu2 {
    public static void main(String[] args) {
        Scanner dny=new Scanner(System.in);
        int cislo;

        do {
            System.out.println("Zadej cislo dne v rozmezi 1-7: ");
            cislo= dny.nextInt();
        }
        while (cislo<1||cislo>7);{
//            Dny den=new Dny(cislo);
            switch (cislo){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:{
                    System.out.println("Vsedni den");
                    break;}
                case 6:
                case 7:{
                    System.out.println("Vikend");
                    break;}
                default:
            }

        }

    }
}
