import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("AMD Ryzen 7 3700X", "Top processor", 178000),
                new Product("Intel Core I7 4700", "Old processor", 85000),
                new Product("Asus Xonar STX II", "Good audio card", 120000)
        };

        mySort(products);
        System.out.println(Arrays.toString(products));

        Arrays.sort(products, Comparator.naturalOrder());
        System.out.println(Arrays.toString(products));
    }

    private static void mySort(Product[] products) {
        for (int z = 1; z < products.length; z++) {
            for (int f = z; f > 0; f--) {
                if (products[f].getPrice() < products[f - 1].getPrice()) {
                    Product temp = products[f - 1];
                    products[f - 1] = products[f];
                    products[f] = temp;
                }
            }
        }
    }
}
