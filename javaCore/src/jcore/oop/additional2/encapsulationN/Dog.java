package jcore.oop.additional2.encapsulationN;

public class Dog extends Animal {
    void bark() {
        name = "Buddy";  // allowed
        makeSound();     // allowed
    }
}