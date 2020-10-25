package com.home.paymentservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import commons.Order;

//@FeignClient(name = "order-service")

@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "order-service")
public interface OrderProxy {

	@GetMapping(value = "/order-service/order")
	public Order order();
}
