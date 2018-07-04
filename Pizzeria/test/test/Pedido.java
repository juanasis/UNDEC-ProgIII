package test;

import java.time.LocalDate;
import java.util.*;

public class Pedido {
	private int idPedido;
	private String nombre;
	private String  domicilio;
	private double importe;
	private LocalDate fechaEntrega;
	private LinkedList<Pizza> pizzas;
	public Pedido(String nombre, String domicilio, double importe, LocalDate fechaEntrega, Pizza pizza) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.importe = importe;
		this.fechaEntrega = fechaEntrega;
		pizzas = new LinkedList<Pizza>();
		pizzas.add(pizza);
	}
	public void agregarPizza(Pizza pizza) {
		this.pizzas.add(pizza);
		
	}
	public LinkedList<Pizza> getPizzas() {
		
		return pizzas;
	}
	public int importeTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
