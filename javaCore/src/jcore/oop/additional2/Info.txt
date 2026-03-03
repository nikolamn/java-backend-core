1. Coupling vs Cohesion
2. Design principles
3. Composition vs Inheritance
4. Encapsulation nuances: final / protected
5. Object Lifecycle & Garbage Collection
6. Immutability
+Runtime vs Compile-time Polymorphism

1. Coupling vs Cohesion; 
Cohesion: How closely related the responsibilities of a class are (high cohesion = one clear purpose); 
Coupling: How much one class depends on another (low coupling = easier to change code)
2. Design principles
-Singleton: Only one instance of a class exists (good for shared resource: config etc..)
-Factory: Create objects without exposingconcrete class logic (Interface)
(centralizing object creatin logic, reduces coupling to concrete classes)
-Observer: One-to-many notification system (good for even systems, messaging, reactive state)
-Decorator: Add behavior dynamically without modifying the original class (good for adding behaviour at runtime/ avoids large inheritance trees)
3. Composition vs Inheritance
Inheritance: is-a relationship; Thight coupling, less flexible if you want different engines later (use only for true is-a relat)
Composition: has-a relationship; More flexible (you can swap engines withouth changing car) (for flexb and maint)
4. Encapsulation nuances: 
protected: controlled subclass access
final / immutability: safe, predictable objects
Encapsulation is more than just private + getters/setters; it’s about controlling who can see/change state.
5. Object Lifecycle & Garbage Collection
lifecycle: Objects automatically destroyed by the JVM when they are no longer referenced (this helps avoid memory leaks)
6. Immutability: state cannot change after creation, making code predictable, thread-safe, and easier to reason about
+Runtime vs Compile-time Polymorphism
Compile-time polymorphism (method overloading)
Runtime polymorphism (method overriding / interface)