package com.edem.EJ_Store;

public class OrderService {
    public void placeOrder(){
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
