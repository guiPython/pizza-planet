package ingredients;

public class Sodas {
    public static Ingredient miniCocaCola() {
        return new UnitIngredient("Coca Cola 350ml", 2.0);
    }

    public static Ingredient mediumCocaCola() {
        return new UnitIngredient("Coca Cola 600ml", 3.0);
    }

    public static Ingredient cocaCola() {
        return new UnitIngredient("Coca Cola 1L", 4.0);
    }
}
