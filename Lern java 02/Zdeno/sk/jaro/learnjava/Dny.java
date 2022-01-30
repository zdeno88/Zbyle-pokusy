package sk.jaro.learnjava;

public enum Dny {
    pondeli(1),
    utery(2),
    streda(3),
    ctvrtek(4),
    patek(5),
    sobota(6),
    nedele(7);
    public int poradi;

    public int getPoradi(){
        return poradi;
    }

     Dny(int poradi) {

        this.poradi = poradi;
    }

}
