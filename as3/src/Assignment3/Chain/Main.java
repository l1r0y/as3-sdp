package Assignment3.Chain;

public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Установка цепочки обработчиков
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        // Запрос на оплату
        int amountToPay = 210;
        System.out.println("Запрос на оплату: $" + amountToPay);
        paymentA.handlePayment(amountToPay);
    }
}