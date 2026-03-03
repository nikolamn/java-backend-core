// package jcore.oop.additional2.coupling;

// High coupling(bad) = OS tightly bound to specific implementation
// class OrderService {
//     PaymentService payment = new PaymentService();
// }



// Low coupling(good) = OS depends on an abstraction (PP interface), not concrete class
// class OrderService {
//     private PaymentProcessor payment;

//     OrderService(PaymentProcessor payment) {
//         this.payment = payment;
//     }
// }