package Eugeto;

public class Coffee implements Preparable{
    private final String name="Coffee";
    private final String ingredient="coffee power and hot water";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return ingredient;
    }
}
