package Strategy;

public class SameInstrumentRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund(double amount) {
        // Logic for refunding to the same wallet
        System.out.println("Refunding " + amount + " to the same instrument.");
    }
}
