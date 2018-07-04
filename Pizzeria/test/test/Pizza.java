package test;

import java.util.Collection;
import java.util.LinkedList;



public class Pizza {
   
	private int idPizza;
    private String nombre;
    private Base base;
    private Collection<Cubierta> cubierta;
	private double precio;
    public Pizza(String nombre, double pPrecio, Base base, Collection<Cubierta> cubierta) {
		this.nombre = nombre;
		this.precio = pPrecio;
		this.base = base;
		cubierta= new LinkedList<Cubierta>();
		cubierta.addAll(cubierta);
	}
	public String getBase() {
		
		return this.base.toString();
	}
  
}
