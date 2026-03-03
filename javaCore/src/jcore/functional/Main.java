package jcore.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Functional Features App started!");

        System.out.println("Lambda examples!");
        System.out.println("Method references");
        List<String> names = List.of("Marc", "Anna");
        names.forEach(name -> System.out.println(name));
        System.out.println("--------------------------");

        System.out.println("Functional Interfaces!");
        System.out.println("Function<T, R> - Transform Data");
        Function<Integer, String> func = n -> "Value: " + n;
        System.out.println(func.apply(5)); 

        System.out.println("Predicate<T> - Condition Testing");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); 

        System.out.println("Consumer - perform action (no return)");
        Consumer<String> printMsg = msg -> System.out.println(msg);
        printMsg.accept("Hello Consumer");

        System.out.println("Supplier - provide value");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // print generated value
        System.out.println("--------------------------");


        System.out.println("Streams API example!");
        List<User> users = Arrays.asList(
            new User("marko@gmail.com", true),
            new User("marija@gmail.com", true),
            new User("ana@gmail.com", false)
        );

        List<String> emails = users.stream()
                .filter(User::isActive)
                .map(User::getEmail)
                .collect(Collectors.toList());

        System.out.println(emails);
        System.out.println("--------------------------");


        System.out.println("Optional API example!");
        Optional<String> name = Optional.of("Marko");
        name.ifPresent(System.out::println);
        System.out.println("--------------------------");

    }
}
