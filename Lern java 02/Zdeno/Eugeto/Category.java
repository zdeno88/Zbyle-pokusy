package Eugeto;

public enum Category {
    FOOD("jidlo"),
    CONSUMABLES("domacnost"),
    OTHERS("jine");
    private String zbozi;

    Category(String typ) {
        this.zbozi=typ;
    }
    public String getTyp() {
        return zbozi;
    }
}
