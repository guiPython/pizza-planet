package ingredients;

import commons.Product;

public abstract class Ingredient extends Product {
    public final Number price;
    public Ingredient(String name, Number price) {
        super(name);
        this.price = price;
    }

    public Number price() {
        return price;
    }

}
