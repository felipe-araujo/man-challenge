package eu.man.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.man.challenge.model.Order;
import eu.man.challenge.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired OrderService orderService;
	
	@PostMapping("/orders")
    public Order order(@RequestBody Order order) {
		return orderService.createOrder(order);
    }
    
    @GetMapping("/orders/{id}")
    public Order orderStatus(@PathVariable("id") Long id){   	
    	return orderService.orderSatus(id);
    }
}
