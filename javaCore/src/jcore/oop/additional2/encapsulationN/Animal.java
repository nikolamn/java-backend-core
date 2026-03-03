package jcore.oop.additional2.encapsulationN;

public class Animal {
    // accessible in subclasses
    protected String name;  

    // accessible in subclasses
    protected void makeSound() {
        System.out.println("Some sound");
    }
}
