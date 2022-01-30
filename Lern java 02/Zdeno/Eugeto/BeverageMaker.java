package Eugeto;

import java.util.ArrayList;
import java.util.List;

public class BeverageMaker{
    List<Preparable> beverageList=new ArrayList<>();
    String cupSize;
    public void addBeverage(Preparable beverage){
       beverageList.add(beverage);
    }
    public void prepare(int cislo){
        StringBuilder result=new StringBuilder();
        if(cislo>= beverageList.size())
            System.out.println("This beverage is not available!");
        else {
            Preparable preparable = beverageList.get(cislo);
            result.append("Preparing ").append(cupSize).append(" cup of ").
                    append(preparable.getName()).append(" from ").append(preparable.getIngredients());
            System.out.println(result);
        }
    }
    public void setCupSize(CupSize cupSize){
        this.cupSize= cupSize.getVelikost();
    }

    public static void main(String[] args) {
        BeverageMaker beverageMaker=new BeverageMaker();
        beverageMaker.addBeverage(new Tea());
        beverageMaker.addBeverage(new Coffee());
        beverageMaker.addBeverage(new ChineseSoup());
        beverageMaker.setCupSize(CupSize.BIG);
        beverageMaker.prepare(0);
        beverageMaker.setCupSize(CupSize.SMALL);
        beverageMaker.prepare(1);
        beverageMaker.prepare(3);
    }
}
