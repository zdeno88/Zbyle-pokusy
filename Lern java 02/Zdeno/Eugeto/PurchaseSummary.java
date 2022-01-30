package Eugeto;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class PurchaseSummary {
    ArrayList<Purchase> purchases =new ArrayList<>();

    void addToPurchaselist(Purchase nakup){
        purchases.add(nakup);
    }
    void removeFromPurchaselist(int cisloNakupu){
        purchases.remove(cisloNakupu);
    }

    String getPurchaselist(){
        StringBuilder result=new StringBuilder();
        for (Purchase purchase:purchases) {
             result.append(purchase.getPurchase());
        }
        return result.toString();
    }

    String getPurchaseAfterDate(){
        StringBuilder result=new StringBuilder();
        for (Purchase purchase:purchases) {
            try {
                if (LocalDate.of(2021,7,31).isBefore(purchase.getPurchaseDate()))
                    result.append(purchase.getPurchase());
            }
            catch (NullPointerException e){
                System.out.println("Nespravny format data metoda");
            }

        }
        return result.toString();
    }

    void checkingRightPrice()throws Exception{
        for(Purchase purchase:purchases){
            if (purchase.getPrice()<0)
                throw new Exception("Zaporne cislo!!!");
        }
    }

    int getSize(){
        return purchases.size();
    }

    double getTotalAmount(){
        double sum=0;
        for (Purchase purchase:purchases) {
            sum+=purchase.getPrice();
        }
        return sum;
    }
    double AvrPrice(){
        double avrPrice=getTotalAmount()/getSize();
        return (double) Math.round(avrPrice*10)/10;
    }

}
