abstract class Payment {
    protected double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    public void showAmount() {
        System.out.println("So tien: " + (long) amount);
    }
    public abstract void processPayment();
}
interface Refundable {
    void refund();
}
class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }
    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang tien mat");
    }
}
class CardPayment extends Payment implements Refundable {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang the");
    }
    @Override
    public void refund() {
        System.out.println("Hoan tien thanh cong");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Payment[] payments = {
                new CashPayment(500000),
                new CardPayment(1000000)
        };
        for (Payment p : payments) {
            p.showAmount();
            p.processPayment();
            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            }
        }
    }
}
