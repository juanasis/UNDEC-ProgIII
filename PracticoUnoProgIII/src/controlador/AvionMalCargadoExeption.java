package controlador;

public class AvionMalCargadoExeption extends RuntimeException {
	public AvionMalCargadoExeption() {
		super("\nAvion mal formado");
	}
}
