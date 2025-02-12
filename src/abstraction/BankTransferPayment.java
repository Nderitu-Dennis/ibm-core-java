package abstraction;

public class BankTransferPayment extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Bank Transfer.");
    }
}
