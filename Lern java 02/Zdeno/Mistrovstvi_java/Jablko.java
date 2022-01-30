package Mistrovstvi_java;

public enum Jablko {
    Rubín(10),
    Golden(15),
    Gala(9),
    Spartan(25),
    Fuji(12);
    private int cena;

    Jablko(int cena) {
        this.cena = cena;
    }
    int nactiCenu(){
        return cena;
    }
}
