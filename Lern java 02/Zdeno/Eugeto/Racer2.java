package Eugeto;

import java.time.LocalDate;

public class Racer2 {
    String name;
    int pocetKnedliku;
    boolean jeKonec;
    LocalDate nar;

    public Racer2(String name, int pocetKnedliku, boolean jeKonec, LocalDate nar) {
        this.name = name;
        this.pocetKnedliku = pocetKnedliku;
        this.jeKonec = jeKonec;
        this.nar = nar;
    }

    public static void main(String[] args) {
        Racer2 rac1=new Racer2("Pavel",10,false,LocalDate.of(1998,10,10));
    }


}
