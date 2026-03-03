All exceptions inherit from:

java.lang.Throwable
    ├── java.lang.Exception
    │     └── java.lang.RuntimeException
    └── java.lang.Error

-Checked exceptions: subclasses of Exception excluding RuntimeException (java.io.IOException, java.sql.SQLException)
    Must be declared with throws
    Compiler forces handling
    Intended for recoverable, external failures

-Unchecked exceptions: RuntimeException and Error
    Subclass of RuntimeException
    Not enforced by compiler
    Represent programming errors

-Unchecked exceptions: Error (OutOfMemoryError, StackOverflowError)
    Must not be catched in normal application code


-Should callers be forced to handle this? -> extend Exception
-Is this a programming error? -> extend RuntimeException
-Is this a JVM/system-level failure? -> extend Error (almost never create these yourself)


Every exception carries:
    Message
    Cause (Throwable cause)
    Stack trace

Layered Architecture Rule
    In a typical layered Spring Boot app:
    Repository layer → throws infrastructure exceptions
    Service layer → translates to domain exceptions
    Controller layer → maps to HTTP responses

Exception Translation (Clean Architecture)
try {
    repository.save(user);
} catch (DataIntegrityViolationException e) {
    throw new EmailAlreadyExistsException(user.getEmail(), e);
}

Custom Exceptions: When and How
    Domain rule violated
    Business invariant broken
    External system failure needs abstraction

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


Global Exception Handling (Spring Boot)

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(UserNotFoundException.class)
public ResponseEntity<?> handle(UserNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse(ex.getMessage()));
    }
}

Transactional Behavior and Exceptions
With @Transactional:
    Rolls back on RuntimeException by default
    Does NOT roll back on checked exceptions unless configured