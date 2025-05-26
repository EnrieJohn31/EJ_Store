package com.edem.EJ_Store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjStoreApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(EjStoreApplication.class, args);
		var orderService = new OrderService();
		orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
