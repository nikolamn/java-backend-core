package jcore.oop.additional2.encapsulationN;

// Fields cannot be changed after construction (thread-save and predictable)
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}