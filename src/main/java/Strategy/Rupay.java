package Strategy;

public class Rupay extends CreditCard {
    public Rupay(String cardNumber, String cardHolderName, String expiryDate) {
        super(cardNumber, cardHolderName, expiryDate);
    }

    @Override
    public void tapAndPay(double amount) {
        // Specific logic for Rupay tap and pay
    }

    @Override
    public void doRefund(double amount) {
        // Specific logic for Rupay refund
    }

    @Override
    public void onlinePayment(double amount, String merchant) {
        // Specific logic for Rupay online payment
    }
}
