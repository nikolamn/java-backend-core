# Spring MVC Web Layer

This project demonstrates a **full web layer vertical slice**: handling HTTP requests, validating input, enforcing business rules, and returning structured responses.  

- Request mapping
- DTO binding and validation
- Controller-service interaction
- Exception handling and response shaping

Persistence (`Entity`/`Repository`) exists only to support the flow.

---

## Key Concepts

### 1️⃣ Controllers (`@RestController`)
- Entry point for HTTP requests.
- **Responsibilities:**
  - Map URLs to methods (`@RequestMapping`, `@PostMapping`, `@GetMapping`)
  - Bind request bodies to DTOs (`@RequestBody`)
  - Trigger validation (`@Validated`, `@Valid`)
  - Delegate business logic to services
  - Return DTOs as JSON responses

---

### 2️⃣ Data Transfer Objects (DTOs)
- Define the structure of **input and output for the**.
- DTOs decouple **web layer contracts** from internal persistence.
- **Responsibilities:**
  - Input DTOs (`RegisterDTO`) enforce validation rules via annotations:
    - `@NotEmpty` → field must not be blank
    - `@Size` → restrict string length
  - Output DTOs (`ResponseDTO`) define what data the client sees.

---

### 3️⃣ Validation (`@Valid` / Bean Validation)
- Automatically check that incoming requests meet the required rules **before hitting service logic**.
- Keeps controllers clean; service can assume valid input.
- **Behavior:**
  - `@Valid` triggers Spring to validate the DTO fields.
  - Violations throw `MethodArgumentNotValidException`.

---

### 4️⃣ Service Layer (Minimal Web Layer Perspective)
- Contains business rules and transforms entities into DTOs.
- **From web layer perspective:** Service is a **black box**; controller only interacts via DTOs.
- **Example responsibilities:** 
  - Check if username exists
  - Save account entity
  - Map saved entity to `ResponseDTO` for return

---

### 5️⃣ Exception Handling (`@RestControllerAdvice`)
- Translates exceptions into meaningful HTTP responses **without cluttering controllers**.
- Centralizes error handling, maintains clean controller logic.
- **Handled exceptions:**
  - `UsernameTakenException` → HTTP 409 Conflict
  - `MethodArgumentNotValidException` → HTTP 400 Bad Request

---

### 6️⃣ Spring MVC Lifecycle — Web Layer Perspective
1. HTTP request hits the controller URL mapping.
2. Request body is bound to a DTO (`@RequestBody`).
3. Validation is triggered (`@Valid` / `@Validated`).
4. Controller delegates to service layer for business logic.
5. Service returns a DTO.
6. Controller returns DTO → Spring converts to JSON.
7. Exception handling (`@RestControllerAdvice`) intercepts validation/business errors and returns structured HTTP responses.


---

## Run & Test

curl -X POST -i http://localhost:8080/auth/register -H 'Content-type: application/json' -d '{ "username" : "myusername" }' 

curl -X GET -i http://localhost:8080/auth/all

---
