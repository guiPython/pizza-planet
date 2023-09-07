package commons;

import java.util.Set;

public class Combo<T extends  Product> extends Product {
    private final Set<T> products;

    public Combo(String name, Set<T> products) {
        super(name);
        this.products = products;
    }

    public void add(T product) {
        products.add(product);
    }

    public void remove(T product) {
        products.remove(product);
    }

    @Override
    public Number price() {
        return products.stream().map(p -> p.price().doubleValue()).reduce(0d, Double::sum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s:", name));
        products.forEach(p -> sb.append(String.format("\n\t%s: %.2f", p.name, p.price().doubleValue())));
        sb.append(String.format("\nTotal: %.2f", price().doubleValue()));
        return sb.toString();
    }
}
