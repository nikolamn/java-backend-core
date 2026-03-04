# REST API Design


---

## 1. HTTP Methods and Semantics

REST APIs use standard HTTP methods to express how clients interact with and modify resources

Core methods:

-GET
-HEAD
-POST
-PUT
-DELETE
-CONNECT
-OPTIONS
-TRACE
-PATCH

---

## 2. Idempotency

An operation is **idempotent** if performing it multiple times results in the same system state as performing it once

### Idempotent Methods
- GET  
- PUT  
- DELETE  

### Non-Idempotent
- POST  

Idempotency is critical for:
- Safe request retries  
- Network failure recovery  
- Predictable API behavior  

---

## 3. DTO vs Entity Separation

A clear separation between internal persistence models and external API contracts is required.

### Entity
- Represents the persistence model  
- Maps directly to the database schema  

### DTO (Data Transfer Object)
- Represents the API contract  
- Defines externally exposed data  

---

## 4. Validation at API Boundary

All validation must occur **before business logic execution**.

Validation includes:

- Required field enforcement  
- String length constraints  
- Format validation  
- Domain invariant checks  

---
