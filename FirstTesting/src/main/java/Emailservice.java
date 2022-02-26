public class Emailservice {

    private static Emailservice instance;

    public Emailservice() {
    }

    public static Emailservice getInstance() {
        if (instance == null) {
            instance = new Emailservice();
        }
        return instance;
    }

    void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    boolean sendEmail(Order order, String cc) {
        order.setCustomerNotified(true);
        return true;
    }
}