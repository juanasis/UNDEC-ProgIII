package controlador;

import java.util.*;

import practiUno.Avion;
import practiUno.Vuelo;

public class GestorAvion {
	private LinkedList<Avion> aviones;
	private static GestorAvion soyElGestorAvion;
	
	public GestorAvion() {
		
	}
	
	public GestorAvion(LinkedList<Avion> linkedList) {
		// TODO Auto-generated constructor stub
		aviones = new LinkedList<Avion>();
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

	public LinkedList<Avion> getColeccionAviones() {
		// TODO Auto-generated method stub
		return aviones;
	}

	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion pAvion) {
		int hs = 0;
		for (Vuelo vuelo : crearVuelos) {
			if(vuelo.getAvion().getIdAvion() == pAvion.getIdAvion())
				hs += (vuelo.duracionHoras()*60 ) + vuelo.duracionMinutos() ; 
		}
		return hs/60;
	}
	
}
