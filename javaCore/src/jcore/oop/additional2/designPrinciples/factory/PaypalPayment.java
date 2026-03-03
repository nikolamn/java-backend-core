package jcore.oop.additional2.designPrinciples.factory;

public class PaypalPayment implements Payment {
    public void pay() {
        System.out.println("Payed by PayPal");
    }
}
