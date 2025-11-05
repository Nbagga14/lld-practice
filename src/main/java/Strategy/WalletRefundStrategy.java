package Strategy;

public class WalletRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund(double amount) {
        // Logic for refunding to a digital wallet
        System.out.println("Refunding " + amount + " to digital wallet.");
    }
}
