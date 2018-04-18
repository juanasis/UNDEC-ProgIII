package practiUno;

import java.util.Comparator;
import java.util.LinkedList;

public class Avion implements Comparable<Avion>{
		private double hs;
		private int idAvion;
		private String modelo;
		private String matricula;
		private LinkedList<Asiento> listaAsientos;
		private LinkedList<Vuelo> listaVuelos =new LinkedList<Vuelo>() ;
		public Avion(int idAvion, String modelo, String matricula, LinkedList<Asiento> listaAsientos) {
			super();
			this.idAvion = idAvion;
			this.modelo = modelo;
			this.matricula = matricula;
			this.listaAsientos = listaAsientos;
			this.hs = 0;
			//this.listaVuelos = vuelos;
		}
		
		
		public LinkedList<Vuelo> getListaVuelos() {
			return listaVuelos;
		}

		public int compareTo(Avion arg0) {
			return (int) (arg0.hs - this.hs);
		}
		public void setListaVuelos(LinkedList<Vuelo> listaVuelos) {
			this.listaVuelos = listaVuelos;
		}


		public double getHs() {
			return hs;
		}


		public void setHs(double hs) {
			this.hs = hs;
		}

		public void agregarHs(double hs){
			this.hs += hs;
		}
		
		public int getIdAvion() {
			return idAvion;
		}
		public void setIdAvion(int idAvion) {
			this.idAvion = idAvion;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public LinkedList<Asiento> getListaAsientos() {
			return listaAsientos;
		}
		public void setListaAsientos(LinkedList<Asiento> listaAsientos) {
			this.listaAsientos = listaAsientos;
		}
		@Override
		public String toString() {
			return "Avion [idAvion=" + idAvion + ", modelo=" + modelo + ", matricula=" + matricula + ", listaAsientos="
					+ listaAsientos + "]";
		}

			
	
		
}

class ordenarPorHoras implements Comparator<Avion>{
	public int compare(Avion a, Avion b) {
		return (int)(a.getHs()-b.getHs());
	}
}