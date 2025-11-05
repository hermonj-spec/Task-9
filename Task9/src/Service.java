public class Service extends LaptopStore {
    int duration;
    String provider;

    public Service(String name, double price, int duration, String provider) {
        super(name, price);
        this.duration = duration;
        this.provider = provider;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration + "hours");
        System.out.println("Provider: " + provider);
    }
}
