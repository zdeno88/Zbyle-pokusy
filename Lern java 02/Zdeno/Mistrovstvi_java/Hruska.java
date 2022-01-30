package Mistrovstvi_java;

public enum Hruska {
    cervena(10),
    zelena(5),
    bila(8),
    hraskova(15);
    int cena;
    Hruska(int cena) {
        this.cena = cena;
    }
    public int getCenaHruska() {
        return cena;
    }
}
