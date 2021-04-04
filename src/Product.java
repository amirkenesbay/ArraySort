public class Product implements Comparable<Product> {

    private final String name;

    private final String description;

    private final int price;

    public Product(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return price - o.price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
