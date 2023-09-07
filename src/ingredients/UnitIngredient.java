package ingredients;

public class UnitIngredient extends Ingredient {
    public UnitIngredient(String name, Number price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return String.format("Ingredient: %s %.2f by unit", name, price.doubleValue());
    }
}
