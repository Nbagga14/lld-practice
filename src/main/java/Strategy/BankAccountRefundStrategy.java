package Strategy;

public class BankAccountRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund(double amount) {
        // Logic for refunding to a bank account
        System.out.println("Refunding " + amount + " to bank account.");
    }
}
