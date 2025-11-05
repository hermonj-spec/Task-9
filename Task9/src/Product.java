public class Product extends LaptopStore {
    String category;
    int units;

    public Product(String name, double price, String category, int units) {
        super(name, price);
        this.category = category;
        this.units = units;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Available units: " + units);
    }
}
