package cz.engeto;

public class Main {

    public static void main(String[] args) {
        Htu21d zarizeni=new Htu21d();
        for (int i=1;i<=10;i++) {
            System.out.println("Mereni cislo "+i+" :"+(double)Math.round(zarizeni.readTemperature()*10)/10);
        }
    }
}
