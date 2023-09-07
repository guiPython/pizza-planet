package commons;

public abstract class Product {
    public final String name;
    public Product(String name) {
        this.name = name;
    }
    public abstract Number price();
}