package eu.man.challenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.man.challenge.exception.IngredientNotAllowedException;
import eu.man.challenge.exception.NotFoundException;
import eu.man.challenge.model.Order;
import eu.man.challenge.validators.IngredientValidator;

@Service
public class OrderService {
	public static List<Order> orders = new ArrayList<>();
	
	@Autowired IngredientValidator ingredientValidator;
	
	public Order createOrder(Order order) throws IngredientNotAllowedException{
		ingredientValidator.validar(order);
		synchronized(orders){
			orders.add(order);
			order.setId(Long.valueOf(orders.indexOf(order)));
		}
		return order;
	}
	
	public Order orderSatus(Long id){
		Optional<Order> order = orders.stream().filter(o -> o.getId().equals(id)).findFirst();
		if(order.isPresent()){
			return order.get();
		}else{
			throw new NotFoundException();
		}
	}
}
