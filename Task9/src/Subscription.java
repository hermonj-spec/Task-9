public class Subscription extends LaptopStore {
    int durationMonths;
    String renewalStatus;

    public Subscription(String name, double price, int durationMonths, String renewalStatus) {
        super(name, price);
        this.durationMonths = durationMonths;
        this.renewalStatus = renewalStatus;
    }
}
