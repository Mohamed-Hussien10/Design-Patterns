public class Main {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Payment using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.makePayment(100);

        // Payment using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.makePayment(200);

    }
}