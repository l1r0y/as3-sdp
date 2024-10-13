package Assignment3.Chain;

public class PaymentB extends PaymentHandler {
    private final int balance = 300;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью метода B на сумму: $" + amount);
        } else if (nextHandler != null) {
            System.out.println("Метод B: недостаточно средств, передаю запрос дальше...");
            nextHandler.handlePayment(amount);
        }
    }
}