OOP principles additional
1. Interfaces
2. Interfaces vs abstract classes
3. Method overloading
4. Method overriding
5. Final
6. Static
7. Constructor & Constructor Chaining
8. Nested classes
9. Object class methods
10. Exception handling 
11. Generics
12. Composition over inheritance

1. Interfaces: Blueprints for a class, declare what subclass must implement 2. Interfaces vs abstract classes: abstract classes can have fields + methods with implementation, interfaces can't (only method signatures + constants);
Usage: Interfaces are used when multiple unrealted classes should be sharing common behaviour without enforcing strict class hiarchy like with abstract classes
3. Method overloading: Multiple same-named methods with different parameters, convinient for reusable operations  (return types can be the same but parameters differ)
4. Method overriding: Allow subclass to provide specific implementation of a method defined in superclass (runtime polymorphism) 
5. Final: Prevents furthe inheritance or overriding
variable: can be assigned only once (immutable reference/value); method: cannot be overriden; class: cannot be extended; objects: locks the reference - not it's internal state
6. Static: Class-level variable or method, not tiead to the instance but for the class; Use for shared state or utility methods that don’t require an instance.
variable, method, block, (nested classes)...
7. Constructors: Special methods used for creating class's instances
Constructor Chaining: allow calling parent's constructor
8. Nested classes: Class defined inside of another class; Encapsulating logic, keeping helper classes hidden
9. Object class methods: All objects inherit from java.lang.Object, customize objects behavior for printing, comparison
10. Exception handling: Using inheritance to create custom exceptions; Helps keep error-handling structured
11. Generics: Type safe collections/classes; Ensures compile-time safety, avoids casting
12. Composition: Include objects instead of inheritance; More used, flexible than inh 