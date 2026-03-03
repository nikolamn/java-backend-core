package jcore.oop.additional2.designPrinciples.observer;

// Concreate observer
public class NewsChannel implements Observer {
    
    public void update(String message) {
        System.out.println("Breaking: " + message);
    }
}
