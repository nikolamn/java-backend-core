OOP principles basics
1. Encapsulation
2. Abstraction
3. Polymorphism
4. Inheritance

1. Encapsulation: Entities have private fields and public Getters&Setter, which control how the fields are modified and protect state
2. Abstraction: Defining class abstract(ei Vehicle) when we want to use class as template for other classes, they cannot be initiated. Defining methods abstract (ei Vehicle.start()) when we want to specify what behavior should subclasses implement, but subclasses should specify how will it implement it
3. Polymorphism: Different subclasses can have different implementations for same method from parent (Vehicle.start was @Override-n in both Bike and Car classes)
4. Inheritance: Car inherts(extends) Vehicle in order to reuse common fields and and methods


//Without a Build Tool (Raw JDK)
//Compile
javac -d bin src/main/core/oop/*.java

//Run
java -cp bin main.core.oop.Main