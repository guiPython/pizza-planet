package pizza;

import commons.Combo;
import ingredients.Ingredient;

import java.util.Set;

public class Pizza extends Combo<Ingredient> {
    public Pizza(String name, Set<Ingredient> ingredients) {
        super(name, ingredients);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
