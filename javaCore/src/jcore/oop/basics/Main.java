package jcore.oop.basics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application started!");
        
        // Polymorphism
        // Vehicle references can point to any subclass instance (Car or Bike)
        // Used to treat different subclasses uniformly while keeping their unique behavior
        Vehicle car = new Car("Toyota", 2023, 5);
        Vehicle bike = new Bike("Schimano", 2021, true);

        Garage garage = new Garage();
        garage.startVehicle(car);
        garage.startVehicle(bike);

        System.out.println("-------------------------");
    }
}