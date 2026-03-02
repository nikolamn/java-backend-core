package jcore.oop.basics;

public class Bike extends Vehicle {

    private boolean hasCarrier;

    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    public boolean getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.setHasCarrier(hasCarrier);
    }

    @Override
    public void start() {
        System.out.println("Bike started!");
    }
}