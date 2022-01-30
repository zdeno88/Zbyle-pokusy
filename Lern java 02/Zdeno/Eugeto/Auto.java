package Eugeto;

import java.time.LocalDate;

public class Auto {
    private String brand;
    private String type;
    private int price;
    private boolean readySell;
    private Client owner;
    private double avrCons;

    public Auto(String brand, String type, int price,Client owner, boolean readySell, double avrCons) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.owner=owner;
        this.readySell = readySell;
        this.avrCons = avrCons;
    }

    public void stream(){
        System.out.printf("znacka: "+brand+"\nmodel: "+type+"\ncena: "+price+"Kc"+"\npripraveno k prodeji: "+readySell+"\nspotreba: "+avrCons+"l/km\n");
        System.out.println();
        System.out.println("jmeno: "+owner.getName()+"\nadresa: "+owner.getAdrress()+"\nVIP: "+owner.isVip()+"\ndatum narozeni: "+owner.getBirdtDay());
        System.out.println();
    }

    public static void main(String[] args) {
        Client client2=new Client("Jiri","Pisek",true, LocalDate.of(1956,2,6));
        Auto auto=new Auto("skoda","octavia",300000,client2,false,5.5);
        Client client=new Client("Milan","Praha",false, LocalDate.of(1998,10,2));
        auto.stream();
        client.stream();
    }


}
