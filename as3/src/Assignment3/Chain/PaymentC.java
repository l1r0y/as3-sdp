package Assignment3.Chain;

public class PaymentC extends PaymentHandler {
    private final int balance = 1000;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью метода C на сумму: $" + amount);
        } else {
            System.out.println("Метод C: недостаточно средств, невозможно произвести оплату.");
        }
    }
}