# Spring Core IoC

## Overview

Spring IoC concepts, implemented first using plain Spring (spring-ioc) and then with Spring Boot (spring-boot-ioc). 
It illustrates how the container manages bean creation, dependency injection, scopes, lifecycles, and circular dependencies.

---

## Key Concepts

1. **@Configuration + @Bean**
   * Defined in `AppConfig.java`
   * Marks beans for the container and allows wiring dependencies automatically

2. **Constructor Injection**
   * `LibraryService` receives `Book` and `NotificationService` via constructor
   * Ensures required dependencies are provided at creation

3. **Singleton vs Prototype**
   * `Author`, `Book`, `LibraryService` → singletons (default)
   * `NotificationService` → prototype, new instance each request
   * Demonstrates lifecycle differences

4. **Lazy Beans**
   * `NotificationService` is `@Lazy`
   * Created only when first needed, not at context startup

5. **Circular Dependency**
   * **Setter-based**: `BookReference` beans wired manually after creation; works safely  
   * **Constructor-based**: two `BookReference` beans injected into each other via constructors; triggers Spring circular-dependency detection (throws `BeanCurrentlyInCreationException`)  
   * Shows how Spring handles unresolvable cycles versus safe setter-based references

---

## Environment

- Java 17
- Maven 3.9.11
- Spring Framework 6.x
- IDE: Eclipse

---

## Notes

- **spring-ioc**: traditional Spring container, manual `AnnotationConfigApplicationContext`   
- **spring-boot-ioc**: Spring Boot application, automatic container startup, constructor injection and prototype/lazy beans 