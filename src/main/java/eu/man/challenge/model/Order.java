package eu.man.challenge.model;

import java.util.List;


public class Order {
	private Long id;
	private String nome;
	private OrderStatus status;
	private List<String> ingredients;
	
	public Order(){
		this.status = OrderStatus.NEW;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
 enum OrderStatus{
	 NEW, PREPARING, DONE
 }