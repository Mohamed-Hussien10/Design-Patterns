class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Allows setting the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    // Delegate payment to the selected strategy
    public void makePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}