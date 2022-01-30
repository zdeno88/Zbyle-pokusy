package Eugeto;

public class ChineseSoup implements Preparable{
    private final String name="ChineseSoup";
    private final String ingredient="soup powder, chinese noodles, hot water";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return ingredient;
    }
}
