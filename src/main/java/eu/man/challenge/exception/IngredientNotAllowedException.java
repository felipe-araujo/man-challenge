package eu.man.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class IngredientNotAllowedException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public IngredientNotAllowedException(String reason){
		super(reason);
	}
}
