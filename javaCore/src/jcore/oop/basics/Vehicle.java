package jcore.oop.basics;

// Abstraction
// Abstract class: cannot be instantiated directly, used as a template for subclasses
// Useful when you have common fields/methods but different implementations for certain behaviors
public abstract class Vehicle {
    
    // Encapsulation
    // Private field: protects internal state, accessed only via getters/setters
    // Used to control how fields are read or modified, preventing invalid states
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Encapsulation
    // Getters and setters allow controlled access to private fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
     
    public int getYear() {
        return year;
    
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    // Abstractions
    // Abstract method: subclasses must implement their own start logic
    // Used when a base class knows a method *should exist* but cannot define exact behavior
    public abstract void start();
}
