package jcore.oop.additional.overriding;

public class Developer extends Worker {

    // Method overriding
    // Overrides Worker.work() with developer-specific behavior
    @Override
    public void work() {
        System.out.println("Developer works...");
    }
    
}
