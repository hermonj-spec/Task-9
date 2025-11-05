public abstract class LaptopStore {
    protected String name;
    protected double price;

    public LaptopStore(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void displayDetails();

    public void discountedPrice(double discount) {
        double discountedPrice = (price * discount);
        System.out.println("Discounted price $" + discountedPrice);
    }

}
