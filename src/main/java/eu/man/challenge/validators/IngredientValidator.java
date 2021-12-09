package eu.man.challenge.validators;

import org.springframework.stereotype.Component;

import eu.man.challenge.exception.IngredientNotAllowedException;
import eu.man.challenge.model.Order;

@Component
public class IngredientValidator {
	public void validar(Order order) throws IngredientNotAllowedException{
		if(order.getIngredients().stream().anyMatch( ingredient -> ingredient.contains("p"))){
			throw new IngredientNotAllowedException("Ingredient not allowed");
		}
	}
}
