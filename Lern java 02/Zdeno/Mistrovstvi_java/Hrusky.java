package Mistrovstvi_java;

public enum Hrusky {
    cervena(10),
    modra(12),
    zelena(15),
    bila(5),
    zluta(4);
    int cena;

    Hrusky(int cena) {
        this.cena = cena;
    }
    public int getCena() {
        return cena;
    }
}
