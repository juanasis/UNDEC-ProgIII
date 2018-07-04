package test;

public class Base {
	private int idBase;
	private String nombre;
	
	
	public Base(String nombre) {
	
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
}
