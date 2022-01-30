package Eugeto;

import java.time.LocalDate;
import java.time.Period;

public class FiremniVozidla {
    private String brand;
    private String type;
    private String regNum;
    private int seat;
    private double power;
    private LocalDate nextCheckDate;

    public FiremniVozidla(String brand, String type, String regNum, int seat, double power, LocalDate nextCheckDate) {
        this.brand = brand;
        this.type = type;
        this.regNum = regNum;
        this.seat = seat;
        this.power = power;
        this.nextCheckDate = nextCheckDate;
    }
    public FiremniVozidla(String brand, String type, String regNum, double power, LocalDate nextCheckDate) {
        this(brand, type, regNum, 5, power, nextCheckDate);
    }

    public FiremniVozidla(String type, String regNum, double power, LocalDate nextCheckDate) {
        this("Audi", type, regNum, power, nextCheckDate);
    }
    public void testCheckdate(){
        if (Period.between(LocalDate.now(),nextCheckDate).getYears()>1||Period.between(LocalDate.now(),nextCheckDate).getMonths()>1) {
            System.out.println("Platna technicka "+Period.between(LocalDate.now(), nextCheckDate));
        }
        else {
            if (Period.between(LocalDate.now(), nextCheckDate).getDays() < 0)
                System.out.println("Prosla technicka "+Period.between(LocalDate.now(), nextCheckDate));
            else
                System.out.println("Poslat na technickou "+Period.between(LocalDate.now(), nextCheckDate));

        }
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getRegNum() {
        return regNum;
    }
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public LocalDate getNextCheckDate() {
        return nextCheckDate;
    }
    public void setNextCheckDate(LocalDate nextCheckDate) {
        this.nextCheckDate = nextCheckDate;
    }

    public void basicInfo(){
        System.out.println("Znacka auta: "+brand+"\nTyp auta: "+type+"\nRegistracni znacka: "+regNum+"\nVykon: "+power+"\nDatum technicke: "+nextCheckDate+"\n");
    }
    public String basicInfoText(){
        return "Znacka auta: "+brand+"\nTyp auta: "+type+"\nRegistracni znacka: "+regNum+"\nVykon: "+power+"\nDatum technicke: "+nextCheckDate+"\n";
    }

    public static void main(String[] args) {
        FiremniVozidla auto1=new FiremniVozidla("Audi","A5","4E9 4528",5,LocalDate.of(2021,10,26));
        FiremniVozidla auto2=new FiremniVozidla("Q5","5A4 4589",4,LocalDate.of(2021,10,1));
        FiremniVozidla auto3=new FiremniVozidla("Skoda","Octavia","9P4 1221",5.3,LocalDate.of(2022,10,13));
        auto1.setBrand("Mercedes");
//        System.out.println(auto1.getBrand());
//        auto1.basicInfo();
//        System.out.println(auto2.basicInfoText());
//        System.out.println(Period.between(auto1.getNextCheckDate(),LocalDate.now()).getDays());
//        System.out.println(auto1.getBrand()+" ma konec technicke "+auto1.getNextCheckDate());
//        System.out.println(auto2.getBrand()+" ma konec technicke "+auto2.getNextCheckDate());
//        System.out.println(auto3.getBrand()+" ma konec technicke "+auto3.getNextCheckDate());
        Cesta cesta1=new Cesta(auto1,"Praha",LocalDate.of(2021,6,12),221,13);
        Cesta cesta2=new Cesta(auto2,"Brno",LocalDate.of(2021,5,22),105,5.6);
        Cesta cesta3=new Cesta(auto3,"Policka",LocalDate.of(2021,1,1),15,1.2);
//        cesta1.basicInfo();
//        cesta2.basicInfo();
//        cesta3.basicInfo();
        auto1.testCheckdate();
        auto2.testCheckdate();
        auto3.testCheckdate();

    }
}
