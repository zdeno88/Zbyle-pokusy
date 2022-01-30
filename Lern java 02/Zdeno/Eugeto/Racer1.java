package Eugeto;

import java.time.LocalDate;

public class Racer1 {
        public static Racer getChuck(){
            Racer chuck2 = new Racer();
            chuck2.setName("Moris");
            chuck2.setJeKonec(false);
            chuck2.setPocetKnedliku(15);
            chuck2.setNar(LocalDate.of(1800,1,1));
            return chuck2;
        }

    public static void main(String[] args) {
        Racer chuck2;
        chuck2=getChuck();
        System.out.println(chuck2.getName()+" "+chuck2.getNar());
    }

    }

