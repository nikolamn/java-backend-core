package jcore.oop.basics;

// Inheritance
// Car extends Vehicle to reuse common fields and methods from Vehicle
// Used when a subclass should inherit behavior and properties of a parent class
public class Car extends Vehicle {

    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year); // inherit Vehicle constructor
        this.doors = doors;
    }
    
    public int getDoors() {
        return doors;
    }

    public void setDoors() {
        this.doors = doors;
    }
    
    // Polymorphism
    // Overrides Vehicle.start() with Car-specific behavior
    // Used when different subclasses provide different implementations for the same method
    @Override
    public void start() {
        System.out.println("Car started!");
    }
}
