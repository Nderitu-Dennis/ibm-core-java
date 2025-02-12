package abstraction;

public abstract class PaymentMethod {
    // Abstract method: must be implemented by any subclass
    public abstract void processPayment();

    // Concrete method: can be used as is or overridden
    public void defaultPaymentMethod() {
        System.out.println("Using default payment method.");
    }
}
