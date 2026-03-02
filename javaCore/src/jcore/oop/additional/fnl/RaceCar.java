package jcore.oop.additional.fnl;

public class RaceCar {
    
    public static final int MAX_SPEED = 100;
    public int doors;

    public RaceCar() {     
    }

    public RaceCar(int doors) {   
        this.doors = doors;  
    }
    
    public final void turboBoost() {
        System.out.println("Turbo boost activated!");
    }

    public static void reduceSpeed() {
        System.out.println("Speed reduced!");
    }
}
