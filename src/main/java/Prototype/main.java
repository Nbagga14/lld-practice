package Prototype;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
            NetworkConnection connection1 = new NetworkConnection("12", "24");

            System.out.println("Original Connection Details:");
            connection1.printConnectionDetails();

            NetworkConnection connection2 = new NetworkConnection();

            connection2 = connection1.clone();

            System.out.println("Cloned Connection Details:");

            connection2.printConnectionDetails();

    }
}