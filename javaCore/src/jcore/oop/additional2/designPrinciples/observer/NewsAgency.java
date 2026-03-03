package jcore.oop.additional2.designPrinciples.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
public class NewsAgency {
    
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void publish(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}
