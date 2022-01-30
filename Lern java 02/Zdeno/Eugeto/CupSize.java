package Eugeto;

public enum CupSize {
    BIG("big"),
    SMALL("small");
    private final String velikost;
    CupSize(String velikost) {
        this.velikost=velikost;
    }
    public String getVelikost() {
        return velikost;
    }
}
