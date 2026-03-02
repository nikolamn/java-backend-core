package jcore.oop.basics;

// Polymorphism
// Method accepts any Vehicle type; calls correct start() at runtime
// Used to write flexible code that can operate on multiple subclass types via a parent reference
public class Garage {
    public void startVehicle(Vehicle v) {
        v.start();
    }
}
