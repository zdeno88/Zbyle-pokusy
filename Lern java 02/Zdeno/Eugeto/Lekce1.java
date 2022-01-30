package Eugeto;

import java.time.LocalDate;

public class Lekce1 {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        int numberOfPieces;
        numberOfPieces=5;
        String itemName="klavesnice";
        System.out.println("Nakupuji: "+ itemName+" "+numberOfPieces+" ks");
        LocalDate dateOfIssue =LocalDate.of(2021,10,4);
        boolean isDiscounted=true;
        LocalDate today=LocalDate.now();
        System.out.println(today.isBefore(LocalDate.of(2022,1,1)));
        System.out.println(today.compareTo(dateOfIssue));

    }
}
