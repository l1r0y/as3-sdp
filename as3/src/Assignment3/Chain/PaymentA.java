package Assignment3.Chain;

public class PaymentA extends PaymentHandler {
    private final int balance = 100;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью метода A на сумму: $" + amount);
        } else if (nextHandler != null) {
            System.out.println("Метод A: недостаточно средств, передаю запрос дальше...");
            nextHandler.handlePayment(amount);
        }
    }
}