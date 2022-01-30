package Eugeto;

public abstract class Hrac {
    String jmeno;
    int cislo;
    public Hrac(String jmeno, int cislo) {
        this.jmeno = jmeno;
        this.cislo = cislo;
    }
    public abstract void play();

}
