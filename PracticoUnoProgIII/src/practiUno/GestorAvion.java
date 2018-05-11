package practiUno;

import java.util.*;

public class GestorAvion {
	private ArrayList<Avion> aviones;
	private static GestorAvion soyElGestorAvion;
	private GestorAvion() {
		aviones = new ArrayList<Avion>();
	}
	public static GestorAvion getInstancia() {
		if(soyElGestorAvion == null) {
			soyElGestorAvion = new GestorAvion();
		}
		return soyElGestorAvion;
	}
	

	public boolean addAvion(int idAvion, String modelo, String matricula, LinkedList<Asiento> listaAsientos)throws AvionMalCargadoExeption{
		try {if(idAvion > 0) {
			
			Avion aux = new Avion(idAvion,  modelo,  matricula,  listaAsientos);
				if(!existeAvion(aux)) {
					return aviones.add(aux);
			}
			
		} 
		return false;
		}catch (Exception e) {
			// TODO: handle exception
				new AvionMalCargadoExeption();
				return true;
		}
	
	}
	private boolean existeAvion(Avion a){
		for(Avion aux: aviones){
			if (aux.equals(a)){
				return true;
			}
		}
		return false;
	}
	
}
