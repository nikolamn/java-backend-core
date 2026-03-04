# Spring Boot Wiring

## Overview

Demo shows how Spring Boot wires the core automatically — like DataSource, JPA, transactions, MVC, validation — but also how things can be overriden manually if needed

H2 in-memory DB was used

---

## Key Concepts

- **Spring Boot Auto-Configuration**
  * `DataSourceAutoConfiguration`
  * `HibernateJpaAutoConfiguration`
  * `WebMvcAutoConfiguration`
  * `ValidationAutoConfiguration`
  * Automatically creates: `DataSource`, `EntityManagerFactory`, `PlatformTransactionManager`, `DispatcherServlet`, `RequestMappingHandlerMapping`, `Validator`

- **Spring Data JPA**
  * `JpaRepository`
  * `EntityManager`
  * `@Entity`, `@Id`, `@GeneratedValue`
  * Hibernate as JPA provider

- **H2 Database**
  * In-memory database (`jdbc:h2:mem:testdb`)
  * Tables auto-created via Hibernate (`ddl-auto`)
  * H2 web console enabled

- **Configuration Properties**
  * `@ConfigurationProperties`
  * Externalized config from `application.yml`
  * Type-safe binding (`GreetingProperties`)

- **Bean Overriding**
  * `@Configuration`
  * `@Bean`
  * `@Primary`
  * Manual override of auto-configured beans via `ManualBeansConfig`

- **Validation**
  * `jakarta.validation`
  * `LocalValidatorFactoryBean`
  * `@NotNull`

- **Spring MVC / REST**
  * `@RestController`
  * `@RequestMapping`, `@GetMapping`, `@PostMapping`
  * `DispatcherServlet`
  * `RequestMappingHandlerMapping`

---

## How to Test

1. **H2 Console**: `http://localhost:8080/h2-console`  
2. **REST**: `POST /person/new?name=anna`, `GET /person/all`  
3. **Greeting Service**: `/greet?name=Mark` → `"Welcome, Mark"`  
4. **Inspect beans**: `BeanInspectorConfig` prints all main beans at startup  

---
