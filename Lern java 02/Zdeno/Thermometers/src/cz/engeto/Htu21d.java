package cz.engeto;

public class Htu21d implements ReadTemperature{
    private final int address=0x40;
    private double lastTemperature;

    public int getAddress() {
        return address;
    }
    public double getLastTemperature() {
        return lastTemperature;
    }

    public double readTemperature(){
        lastTemperature=generateNumber(-40,40);
        return lastTemperature;
    }
    public double generateNumber(int min,int max){
        return Math.random()*(max-min)+min;
    }


}
