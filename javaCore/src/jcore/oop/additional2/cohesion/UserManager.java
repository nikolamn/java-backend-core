package jcore.oop.additional2.cohesion;

// Low cohesion(bad) - mixes unrelated responsiblities 
// class UserManager {
//     void registerUser() {};
//     void sendEmail() {};
//     void calculateInvoce() {};
// }


// High cohesion(good) - each class has single, focused responsibility
// class UserService {
//     void registerUser() {};
// } 

// class EmailService {
//     void sendEmail() {};
// }