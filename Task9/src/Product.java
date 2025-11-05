public class Product extends LaptopStore {
    String category;
    int units;

    public Product(String name, double price, String category, int units) {
        super(name, price);
        this.category = category;
        this.units = units;
    }
}
