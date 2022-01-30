package Eugeto;

import java.time.LocalDate;

public class Client {
    private String name;
    private String adrress;
    private boolean vip;
    private LocalDate birdtDay;

    public Client(String name, String adrress, boolean vip, LocalDate birdtDay) {
        this.name = name;
        this.adrress = adrress;
        this.vip = vip;
        this.birdtDay = birdtDay;
    }
    public void stream(){
        System.out.printf("jmeno: "+getName()+"\nadresa: "+getAdrress()+"\nVIP: "+isVip()+"\ndatum narozeni: "+getBirdtDay()+"\n");
    }

    public String getName() {
        return name;
    }

    public String getAdrress() {
        return adrress;
    }

    public boolean isVip() {
        return vip;
    }

    public LocalDate getBirdtDay() {
        return birdtDay;
    }
}
