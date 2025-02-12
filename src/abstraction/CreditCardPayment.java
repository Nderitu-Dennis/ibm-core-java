package abstraction;


public class CreditCardPayment extends PaymentMethod {
    public void processPayment() {
        System.out.println("Processing payment with Credit Card.");
    }

    //the concrete method can be overridden
    public void defaultPaymentMethod(){
        System.out.println("overridding the concrete method and now using the default credit card payment");
    }

    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();
        creditCardPayment.defaultPaymentMethod(); //calling concrete method from the abstract class
/*note
*  if you choose to override the method, the subclass will use the overridden version instead of the one from the abstract class.*/
    }

}
