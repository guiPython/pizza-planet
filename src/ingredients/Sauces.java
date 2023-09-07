package ingredients;

public class Sauces {
    public static Ingredient special() {
        return new BulkIngredient("Tomato sauce", 0.10f, BulkIngredient.Unit.Liter);
    }

    public static Ingredient tomato() {
        return new BulkIngredient("Tomato sauce", 0.10f, BulkIngredient.Unit.Liter);
    }
}
