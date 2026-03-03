Data Types

1. 1. Primitive Data types
byte, short, int, long ,float, double, char, boolean
-Stored by value
-Not nullable
-No obj allocation overhead
-Faster, more eff

byte → short → int → long → float → double

1. 2. Reference Data Types 
Classes, Interfaces, Arrays, Enumerations
-Stored as references pointing to heap objects
-Nullable
-Allocation + GC overhead


1. 3. Wrapper Classes
Integer, Double, Character, Boolean
-java.lang
-Autoboxing / unboxing
-Using primitives inside

2. Aoutobxing
Integer count = 0 // autoboxed
count++;          // boxing/unboxing happens

3. Equality semantics
Integer a = 100;
Integer b = 100;  // reused cached object, point to the same refrenece (100)  (caching happens only for values -128 127)
System.out.println(a == b); // true
System.out.println(a.equals(b)); // true, compares values

Integer x = 1000;
Integer y = 1000;    // no caching here, two separate objects are created
System.out.println(x == y);  // false, even though values are equal
System.out.println(x.equals(y)); // true, same numeric value

== compares references when used with objects

4. Imutability & Strings
String is immutable 

String s = "a";
s += "b";   // creates new object (use StringBuilder inside loops)

5. Nullability & Defensive Design
Reference types can be null.

if (user.getName().length() > 0)  // unsafe
Optional<String> // safe

6. Memory Model Awareness
Primitives - stored on the stack (fast, local scope)
Objects / wrappers / arrays - stored on the heap (managed by GC)