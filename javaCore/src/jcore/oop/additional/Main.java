package jcore.oop.additional;

import jcore.oop.additional.exceptions.MonitorException;
import jcore.oop.additional.exceptions.MonitorService;
import jcore.oop.additional.fnl.Monitor;
import jcore.oop.additional.fnl.RaceCar;
import jcore.oop.additional.fnl.SuperCar;
import jcore.oop.additional.generics.Box;
import jcore.oop.additional.intFaces.Dog;
import jcore.oop.additional.overloading.PlusMethod;
import jcore.oop.additional.overriding.Developer;
import jcore.oop.additional.overriding.Manager;
import jcore.oop.additional.overriding.Worker;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("OOP:Aditional App started !");
        System.out.println("---------------------------");

        System.out.println("Interface example");
        Dog dog = new Dog();
        dog.animalSound();
        System.out.println("---------------------------");

        
        System.out.println("Method overloading example");
        int r1 = PlusMethod.plusMethod(1, 2);
        System.out.println("Int: " + r1);

        float r2 = PlusMethod.plusMethod(1.22222f, 2.4444f);
        System.out.println("float: " + r2);
        System.out.println("---------------------------");

        System.out.println("Method overriding example");
        Worker worker = new Worker();
        worker.work();

        Worker developer = new Developer();
        developer.work();

        Worker manager = new Manager();
        manager.work();
        System.out.println("---------------------------");

        System.out.println("Final examples");
        RaceCar raceCar = new RaceCar();
        // 1 finalTest.MAX_SPEED = 200; compile time error
        System.out.println(raceCar.MAX_SPEED);


        raceCar.turboBoost();
        RaceCar superCar = new SuperCar();
        // 2 overriden superCar.turboBoost(); would throw compile time error

        // 3 ExtendedUtility extends final class Utility - throws compile time error
        // ExtendedUtility eu = new ExtendedUtility();

        // 4 Objects
        final Monitor monitor = new Monitor(30);
        System.out.println("Monitor inches: " + monitor.getInches());
        monitor.setInches(24); // no error, only reference is final
        System.out.println("Monitor inches: " + monitor.getInches());
        // final monitor = new Monitor(20); compile-time error, files to compile
        System.out.println("---------------------------");
        System.out.println("Static example");
        RaceCar newSuperCar = new SuperCar();
        // inherited variable and method from super class
        int inheritedVar = newSuperCar.MAX_SPEED;
        System.out.println("Inherited MAX_SPEED variable: " + inheritedVar);   
        newSuperCar.reduceSpeed();    
        System.out.println("---------------------------");


        System.out.println("Constructor and constructor chaining example");
        RaceCar chainedContructor = new SuperCar(5);
        System.out.println("---------------------------");


        System.out.println("Nested classes example");
        Monitor.TouchScreen touchScreen = monitor.new TouchScreen();
        touchScreen.touch();
        System.out.println("---------------------------");
        

        System.out.println("Object class methods example");
        boolean equals = monitor.equals(touchScreen);
        System.out.println("Object equals: " + equals);       
        boolean equals2 = monitor.equals(monitor);
        System.out.println("Object equals 2: " + equals2);       
        System.out.println("---------------------------");

        System.out.println("Exception handling example");
        MonitorService monitorService = new MonitorService();
        try {
            monitorService.validateMonitor(-1);
        } catch (MonitorException e) { // no try-catch block will terminate program
            System.out.println("Monitor exception: " + e.getMessage());
        }       
        System.out.println("---------------------------");

        System.out.println("Generics example");
        Box<String> box = new Box<>();

        box.set("Java");
        System.out.println("This is example of generic value: " + box.get());
        System.out.println("---------------------------");
    } 
}
