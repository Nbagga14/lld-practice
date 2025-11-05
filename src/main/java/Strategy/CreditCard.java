package Strategy;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public void tapAndPay(double amount) {
        // Logic for tap and pay

    }

    public void doRefund(double amount) {
        // Logic for refund
    }

    public void onlinePayment(double amount, String merchant) {
        // Logic for online payment
    }

}