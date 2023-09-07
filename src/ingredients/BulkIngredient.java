package ingredients;

public class BulkIngredient extends Ingredient {
    public final Unit unit;
    public BulkIngredient(String name, Number price, Unit unit) {
        super(name, price);
        this.unit = unit;
    }

    @Override
    public String toString() {
        if(unit == Unit.Gram) {
            return String.format("Ingredient: %s %.2f by gram", name, price.doubleValue());
        }
        else if(unit == Unit.Kilogram) {
            return String.format("Ingredient: %s %.2f by kilogram", name, price.doubleValue());
        }
        return String.format("Ingredient: %s %.2f by liter", name, price.doubleValue());
    }

    public enum Unit {
        Gram,
        Kilogram,
        Liter
    }
}
