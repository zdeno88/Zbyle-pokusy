package sk.jaro.learnjava;

public class Vypis {
    public static void main(String[] args) {
        Ctverec ob1=new Ctverec(10,"ctverec");
        Obdelnik ob2=new Obdelnik(10,"obdelnik",20);
        Trojuhelnik ob3=new Trojuhelnik(5,"trojuhelnik",5,5);
        Trojuhelnik ob4=new Trojuhelnik(5,"trojuhelnik",4,5);
        Trojuhelnik ob5=new Trojuhelnik(3,"trojuhelnik",5,4);
        ob1.blesk();
        ob2.blesk();
        ob3.blesk();
        ob4.blesk();
        ob5.blesk();

    }
}
