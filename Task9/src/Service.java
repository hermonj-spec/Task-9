public class Service extends LaptopStore {
    int duration;
    String provider;

    public Service(String name, double price, int duration, String provider) {
        super(name, price);
        this.duration = duration;
        this.provider = provider;
    }
}
