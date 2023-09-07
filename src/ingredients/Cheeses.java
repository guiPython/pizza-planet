package ingredients;

public class Cheeses {
    public static Ingredient mozzarella() {
        return new UnitIngredient("Mozzarella", 3.00);
    }

    public static Ingredient creamCheese() {
        return new UnitIngredient("Cream cheese", 5.00);
    }

    public static Ingredient gorgonzola() {
        return new UnitIngredient("Gorgonzola", 8.00);
    }
}
