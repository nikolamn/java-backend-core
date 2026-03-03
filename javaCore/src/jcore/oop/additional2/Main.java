package jcore.oop.additional2;

import jcore.oop.additional2.designPrinciples.decorator.BasicCoffee;
import jcore.oop.additional2.designPrinciples.decorator.Coffee;
import jcore.oop.additional2.designPrinciples.decorator.MilkDecorator;
import jcore.oop.additional2.designPrinciples.factory.Payment;
import jcore.oop.additional2.designPrinciples.factory.PaymentFactory;
import jcore.oop.additional2.designPrinciples.observer.NewsAgency;
import jcore.oop.additional2.designPrinciples.observer.NewsChannel;
import jcore.oop.additional2.designPrinciples.singleton.DataBaseConnection;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("OOP:Aditional2 App started !");
        System.out.println("---------------------------");

        System.out.println("Desing patterns example");
        System.out.println("Singleton pattern");
        DataBaseConnection db = DataBaseConnection.getInstance();

        System.out.println("Factory pattern");
        Payment payment = PaymentFactory.create("card");
        payment.pay();

        System.out.println("Observer pattern");
        NewsAgency agency = new NewsAgency();
        agency.addObserver(new NewsChannel());
        agency.publish("Earthquake in capital!");

        System.out.println("Decorator pattern");
        Coffee coffee = new MilkDecorator(new BasicCoffee());
        System.out.println(coffee.getDescription());
        System.out.println("---------------------------");
        
        // System.out.println("Object Lifecycle example");
        // Item p1 = new Item("Box");     // object created
        // Item p2 = p1;                       // reference copied
        // p1 = null;                          // p1 no longer references Box
        // System.gc();  
        // System.out.println("---------------------------");

        // System.out.println("Immutability example");
        // Point p = new Point(10, 20);
        // System.out.println("X: " + p.getX() + ", Y: " + p.getY());
        // p.x = 15; // Not allowed
        // System.out.println("---------------------------");
    }
}
