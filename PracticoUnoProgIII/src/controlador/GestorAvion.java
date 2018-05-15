package controlador;

import java.util.*;

import practiUno.Avion;

public class GestorAvion {
	private ArrayList<Avion> aviones;
	private static GestorAvion soyElGestorAvion;
	
	public GestorAvion() {
		aviones = new ArrayList<Avion>();
	}
	
	public static GestorAvion getInstancia() {
		if(soyElGestorAvion == null) {
			soyElGestorAvion = new GestorAvion();
		}
		return soyElGestorAvion;
	}
	

	public boolean crearAvion(Avion pAvion)throws AvionMalCargadoExeption{
		try { if(pAvion.getListaAsientos() != null && pAvion.getIdAvion() > 0 ) {
				if(!existeAvion(pAvion)) {
					return aviones.add(pAvion);
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
			if (aux.getIdAvion() == a.getIdAvion() || aux.getMatricula() == a.getMatricula() ){
				return true;
			}
		}
		return false;
	}
	
}
