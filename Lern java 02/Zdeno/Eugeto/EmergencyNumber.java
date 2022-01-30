package Eugeto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmergencyNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number;
        System.out.println("Aplikace se zavre close");
        do {
            System.out.println("Zadej cislo zachraneho sboru: ");
            number=scanner.nextLine();
            if (number.length()!=3&&!number.equalsIgnoreCase("close"))
                System.out.println("Spatne zadane cislo");
            if (Pattern.matches("\\d\\d\\d", number)) {
                switch (number) {
                    case "150":
                        System.out.println("Hasici");
                        break;
                    case "155":
                        System.out.println("Zachranka");
                        break;
                    case "158":
                        System.out.println("Policie");
                        break;
                    default:
                        System.out.println("Spatne cislo zachraneho sboru");
                }
            }
        }
        while (!number.equalsIgnoreCase("close"));

    }
}
