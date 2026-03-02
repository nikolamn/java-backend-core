package jcore.oop.additional.overloading;


// Method overloading
// Multiple methods with the same name but different parameters 
public class PlusMethod {
    public static int plusMethod(int a, int b) {
        return a + b;
    }

    public static float plusMethod(float a, float b) {
        return a + b;
    }

    public static double plusMethod(double a, double b) {
        return a + b;
    }
}
