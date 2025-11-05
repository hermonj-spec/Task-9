public class Subscription extends LaptopStore {
    int durationMonths;
    String renewalStatus;

    public Subscription(String name, double price, int durationMonths, String renewalStatus) {
        super(name, price);
        this.durationMonths = durationMonths;
        this.renewalStatus = renewalStatus;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + durationMonths + "hours");
        System.out.println("Provider: " + renewalStatus);
    }

    @Override
    public void discountedPrice(double discount) {
        double total = price * durationMonths;
        double discountedTotal = total - (total * discount);
        System.out.println("Discounted Annual Price: $" + discountedTotal);
    }
}
