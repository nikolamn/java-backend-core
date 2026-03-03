package jcore.types;

public class Main {
    
    public static void main(String[] args) {

        // Equality
        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x == y);      // false - compares references
        System.out.println(x.equals(y)); // true  - compares values

        int p = 100;
        int q = 100;
        System.out.println(p == q);      // true - primitives, compares values

        // Autoboxing & Caching
        Integer small1 = 100;
        Integer small2 = 100;
        System.out.println(small1 == small2); // true, cached -128..127

        Integer big1 = 1000;
        Integer big2 = 1000;
        System.out.println(big1 == big2);     // false, outside cache

        // Casting & Type Conversion
        int i = 100;
        long l = i;       // implicit widening
        int j = (int) l;  // explicit narrowing

        String s = Integer.toString(i);
        int k = Integer.parseInt(s);
    }
}
