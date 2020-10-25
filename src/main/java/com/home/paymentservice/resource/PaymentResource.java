package com.home.paymentservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.paymentservice.proxy.OrderProxy;

import commons.Order;
import commons.Payment;

@RestController
public class PaymentResource {

	@Autowired
	private OrderProxy orderProxy;

	@GetMapping(value = "/payment")
	public Payment payment() {
		
		Order order = orderProxy.order();
		return new Payment(201, "cheque", order);
	}

}
