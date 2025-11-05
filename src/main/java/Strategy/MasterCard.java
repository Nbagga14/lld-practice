package Strategy;

public class MasterCard extends CreditCard {
    private RefundStrategy refundStrategy;

    public MasterCard(String cardNumber, String cardHolderName, String expiryDate) {
        super(cardNumber, cardHolderName, expiryDate);
        this.refundStrategy = new SameInstrumentRefundStrategy();
    }

    @Override
    public void tapAndPay(double amount) {
        // Specific logic for MasterCard tap and pay
    }

    @Override
    public void doRefund(double amount) {
        // Specific logic for MasterCard refund
        this.refundStrategy.doRefund(amount);
    }

    @Override
    public void onlinePayment(double amount, String merchant) {
        // Specific logic for MasterCard online payment
    }
}
