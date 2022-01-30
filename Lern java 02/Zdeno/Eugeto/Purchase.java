package Eugeto;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Purchase {
    private String description;
    private Category categoryOfGoods;
    private double price;
    private LocalDate purchaseDate;

    public Purchase(String description,String categoryOfGoods, String price, String purchaseDate) {
        this.description = description;
        try {
            this.categoryOfGoods=Category.valueOf(categoryOfGoods);
        }
        catch (IllegalArgumentException e){
            System.out.println("Nespravny format category");
        }
        try {
            this.price = Double.parseDouble(price);
        }
        catch (NumberFormatException e){
            System.out.println("Nespravny format ceny");
        }
        try {
            this.purchaseDate = LocalDate.parse(purchaseDate);
        }
        catch (DateTimeParseException e){
            System.out.println("Nespravny format data");
        }

    }

    public Purchase(String description,Category categoryOfGoods, double price, LocalDate purchaseDate) {
        this.description = description;
        this.categoryOfGoods=categoryOfGoods;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }
    public Purchase(String description,double price, LocalDate purchaseDate){
        this(description,Category.OTHERS, price,purchaseDate);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryOfGoods() {
        return categoryOfGoods.getTyp();
    }
    public void setCategoryOfGoods(Category categoryOfGoods) {
        this.categoryOfGoods = categoryOfGoods;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    String getPurchase(){
        return "\nPopis nakupu: "+getDescription()+"\nKategorie zbozi: "+getCategoryOfGoods()+
                "\nCastka za nakup: "+getPrice()+"Kc\nDatum nakupu: "+getPurchaseDate()+"\n";
    }
}
