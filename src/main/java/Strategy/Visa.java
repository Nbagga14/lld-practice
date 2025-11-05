package Strategy;

public class Visa extends CreditCard {

    private RefundStrategy refundStrategy;


    public Visa(String cardNumber, String cardHolderName, String expiryDate) {
        super(cardNumber, cardHolderName, expiryDate);
        this.refundStrategy = new BankAccountRefundStrategy();
    }

    @Override
    public void tapAndPay(double amount) {
        // Specific logic for Visa tap and pay
    }

    @Override
    public void doRefund(double amount) {
        // Specific logic for Visa refund
        this.refundStrategy.doRefund(amount);
    }

    @Override
    public void onlinePayment(double amount, String merchant) {
        // Specific logic for Visa online payment
    }
}
