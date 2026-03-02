package jcore.oop.additional.fnl;

public class SuperCar extends RaceCar {

    public SuperCar() {}
    
    // Constructor chaining
    public SuperCar(int doors) {
        super(doors);
        System.out.println("RaceCar's constructor was called when SuperCar was created!");  
    }
    // compile time error
    // @Override
    // public void turboBoost() {
    //     System.out.println("Super turbo boost activated!");
    // }
    
}
