Functional Concepts (Java)
Immutability 
    final fields
    record(s)
public record UserDto(String username, String email) {}


Lambda Expressions
    Anonymous functions for short logic
    Syntax: (params) -> expression
    Common uses: mapping, filtering, simple callbacks


Functional Interfaces
    Interfaces with a single abstract method
    Used heavily in streams and callbacks
Function<T,R> → transform values
Predicate<T> → test condition (boolean)
Consumer<T> → perform action
Supplier<T> → provide values


Method References
Shorter syntax for calling existing methods
Replaces simple lambda expressions


Streams API Basics
Stream = sequence of elements processed in functional style
Common operations:
    Intermediate: map, filter, distinct, sorted
    Terminal: collect, forEach, count, reduce


Optional Basics
    Wraps values that may be null
    Helps avoid NullPointerException
    Common methods: ofNullable(), map(), orElse()