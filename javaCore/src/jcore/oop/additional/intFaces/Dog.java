package jcore.oop.additional.intFaces;

public class Dog implements Animal {
    
    public Dog() { }

    @Override
    public void animalSound() {
        System.out.println("Dog sound!");
    }
}
