SOLID 
1. Single Responsibility Principle (SRP)
A class should have one reason to change
Separate business rules from infrastructure concerns

(Bad approach)
UserService {     
    registerUser()
    validatePassword()
    sendEmail()
    generateJwt()
    mapToDto()
}
(Good Approach)
UserService → business logic
PasswordValidator
EmailService
JwtSigner
UserMapper


2. Open / Closed Principle (OCP)
Open for extension, closed for modification
You shouldn’t modify existing stable code every time a new behavior appears

(Bad approach)
if (paymentType.equals("CARD")) { ... }
else if (paymentType.equals("PAYPAL")) { ... }
else if (paymentType.equals("CRYPTO")) { ... }

(Good Approach)
interface PaymentProcessor {
    void process();
}
Implementations:
    CardPaymentProcessor
    PaypalPaymentProcessor
    CryptoPaymentProcessor

3. Liskov Substitution Principle (LSP)
A subclass must be usable anywhere its parent is expected — without breaking behavior

class Bird {
    void fly() {}
}
class Penguin extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}

(Good Approach)
interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

4. Interface Segregation Principle (ISP)
Clients should not depend on methods they do not use

(Bad approach)  // Now every implementation must support everything.
interface UserOperations {
    register();
    login();
    delete();
    exportAllUsers();
    resetSystem();
}

(Good Approach)
UserRegistrationService
UserAuthenticationService
UserAdminService

Smaller interfaces → smaller coupling.

5. Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules.
Both depend on abstractions.

(Wrong)
UserService {
    private MySQLUserRepository repo;
}

(Correct)
UserService {
    private UserRepository repo;
}