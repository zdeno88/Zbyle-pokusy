package P1;

class Car {
    String znacka;
//    public Car(String znacka) {
//        this.znacka = znacka;
//    }
    public String getZnacka(String znacka) {
        return znacka;
    }
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }
}
class Garage{
    void park(Car car){
        System.out.println("Auto "+car.znacka+" je zaparkovane.");
        car.setZnacka("Dacia");
    }
}
class ParkGarage{
    public static void main(String[] args) {
        Car auto1=new Car();
        Car auto2=new Car();
        auto1.setZnacka("Audi");
        auto2.setZnacka("Skoda");
        System.out.println(auto1.getZnacka("BMW"));
        Garage gar=new Garage();
        gar.park(auto1);
        gar.park(auto2);
        gar.park(auto1);
        gar.park(auto2);

    }
}
