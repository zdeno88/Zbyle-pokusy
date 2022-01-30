package sk.jaro.learnjava;

public class Car {
    String modelname;
    int modelyear;

    public Car(int year, String name) {
        modelname = name;
        modelyear = year;
    }

    public static void main(String[] args) {
        Car myObj = new Car(1969, "Mustang");
        System.out.println(myObj.modelname + " " + myObj.modelyear);

    }
}
