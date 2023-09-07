package pizza;

import commons.Combo;
import commons.Product;
import ingredients.Cheeses;
import ingredients.Sauces;
import ingredients.Sodas;

import java.util.HashSet;
import java.util.List;

public class Factory {
    public static Combo<Product> miniCombo() {
        Pizza pizza = new Pizza("Mozzarella", new HashSet<>());
        pizza.add(Sauces.tomato());
        pizza.add(Cheeses.mozzarella());

        Product soda = Sodas.miniCocaCola();
        return new Combo<>("Mini", new HashSet<>(List.of(pizza, soda)));
    }

    public static Combo<Product> combo() {
        Pizza pizza = new Pizza("Mozzarella & Cream Cheese", new HashSet<>());
        pizza.add(Sauces.tomato());
        pizza.add(Cheeses.mozzarella());
        pizza.add(Cheeses.creamCheese());

        Product soda = Sodas.mediumCocaCola();
        return new Combo<>("Combo", new HashSet<>(List.of(pizza, soda)));
    }

    public static Combo<Product> womboCombo() {
        Pizza pizza = new Pizza("Mozzarella & Cream Cheese & Gorgonzola", new HashSet<>());
        pizza.add(Sauces.tomato());
        pizza.add(Cheeses.mozzarella());
        pizza.add(Cheeses.creamCheese());
        pizza.add(Cheeses.gorgonzola());

        Product soda = Sodas.cocaCola();
        return new Combo<>("Wombo Combo", new HashSet<>(List.of(pizza, soda)));
    }
}
