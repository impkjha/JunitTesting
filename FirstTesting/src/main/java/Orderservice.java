public class Orderservice {
    private static Orderservice instance;
    private Emailservice emailService;

    public static Orderservice getInstance() {
        if (instance == null) {
            instance = new Orderservice();
        }
        return instance;
    }
    public Orderservice() {
        emailService = Emailservice.getInstance();
    }
    double placeOrder1(Order order) {
        double priceWithTax = order.getPrice() * 20 / 10;
        order.setPriceWithTax(priceWithTax);
        emailService.sendEmail(order);
        order.setCustomerNotified(true);
        System.out.println(priceWithTax);
        return priceWithTax;
    }
    boolean placeOrder(Order order, String cc) {
        double priceWithTax = order.getPrice() * 20 / 10;
        order.setPriceWithTax(priceWithTax);
        boolean isNotified = emailService.sendEmail(order, cc);
        order.setCustomerNotified(isNotified);
        System.out.println(priceWithTax);
        return isNotified;

    }
}