package jcore.oop.additional2.designPrinciples.factory;

public class PaymentFactory {
    
    public static Payment create(String type) {
        if (type.equals("card")) return new CardPayment();
        if (type.equals("paypal")) return new PaypalPayment();
        throw new IllegalArgumentException("Unknown payment type");
    }
}
