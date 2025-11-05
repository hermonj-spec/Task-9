public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("HP G16", 2499.99, "Electronics", 5);
        Service service1 = new Service("Computer Maintenance", 120.00, 2, "Big-Tech");
        Subscription subscription1 = new Subscription("Premium Subscription", 18.99, 12, "Enabled");

        System.out.println("=== Product Details ===");
        product1.displayDetails();
        product1.discountedPrice(0.10);
        System.out.println();

        System.out.println("=== Service Details ===");
        service1.displayDetails();
        service1.discountedPrice(0.15);
        System.out.println();

        System.out.println("=== Subscription Details ===");
        subscription1.displayDetails();
        subscription1.discountedPrice(0.20);
    }
}
