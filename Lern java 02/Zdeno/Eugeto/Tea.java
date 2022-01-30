package Eugeto;

public class Tea implements Preparable{
    private final String name="Tea";
    private final String ingredient="syrup and hot water";

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getIngredients() {
        return ingredient;
    }
}
