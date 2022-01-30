package Eugeto;

import java.time.LocalDate;

public class Cesta {
    private FiremniVozidla auto;
    private String tagetOfTrip;
    private LocalDate date;
    private int distanceOfTrip;
    private double consupOfFuel;

    public Cesta(FiremniVozidla auto, String tagetOfTrip, LocalDate date, int distanceOfTrip, double consupOfFuel) {
        this.auto = auto;
        this.tagetOfTrip = tagetOfTrip;
        this.date = date;
        this.distanceOfTrip = distanceOfTrip;
        this.consupOfFuel = consupOfFuel;
    }

    public void basicInfo(){
        System.out.println("Auto: \n"+auto.basicInfoText()+"\nCesta: \nCil cesty: "+tagetOfTrip+"\nDatum: "+date+"\nVzdalenost: "+distanceOfTrip+" km\nSpotreba: "+consupOfFuel+" km/l\n");
    }


    public FiremniVozidla getAuto() {
        return auto;
    }

    public void setAuto(FiremniVozidla auto) {
        this.auto = auto;
    }

    public String getTagetOfTrip() {
        return tagetOfTrip;
    }

    public void setTagetOfTrip(String tagetOfTrip) {
        this.tagetOfTrip = tagetOfTrip;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDistanceOfTrip() {
        return distanceOfTrip;
    }

    public void setDistanceOfTrip(int distanceOfTrip) {
        this.distanceOfTrip = distanceOfTrip;
    }

    public double getConsupOfFuel() {
        return consupOfFuel;
    }

    public void setConsupOfFuel(double consupOfFuel) {
        this.consupOfFuel = consupOfFuel;
    }
}
