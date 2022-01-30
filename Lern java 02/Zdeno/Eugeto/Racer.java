package Eugeto;
import java.time.LocalDate;

public class Racer {
    String name;
    int pocetKnedliku;
    boolean jeKonec;
    LocalDate nar;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNar(LocalDate nar) {
        this.nar = nar;
    }
    public LocalDate getNar() {
        return nar;
    }
    public void setPocetKnedliku(int pocetKnedliku) {
        this.pocetKnedliku = pocetKnedliku;
    }
    public int addKnedlik(int pocet){
        pocetKnedliku+=pocet;
        return pocetKnedliku;
    }
    public int getPocetKnedliku() {
        return pocetKnedliku;
    }
    public void setJeKonec(boolean jeKonec) {
        this.jeKonec = jeKonec;
    }
    public static void main(String[] args) {
        String chuckName;
        Racer racer1=new Racer();
        Racer chuck=new Racer();
        racer1.setName("Milan");
        chuck.setName("Chuck Noris");
        racer1.setNar(LocalDate.of(1998,10,1));
        racer1.setPocetKnedliku(5);
        chuck.setPocetKnedliku(10000);
        racer1.addKnedlik(-2);
        racer1.setJeKonec(true);
        chuck.setJeKonec(false);
        chuckName=chuck.getName();
        Race todayRace=new Race();
        todayRace.setYear(2020);
        todayRace.setTitle("MČR Břicháč Cup");
        todayRace.setDate(LocalDate.of(2020,10,17));
        todayRace.setWiner(chuck);

        System.out.println(chuckName+" snedl knedliku "+chuck.getPocetKnedliku());

        System.out.println(racer1.getName()+" "+racer1.getNar()+" "+racer1.getPocetKnedliku()+" "+racer1.jeKonec);
    }
}
