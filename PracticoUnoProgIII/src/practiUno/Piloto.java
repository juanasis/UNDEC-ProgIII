package practiUno;

import java.time.LocalDate;
import java.util.*;
public class Piloto implements Comparable<Piloto> {
		
		private int idPiloto;
		private String apellido;
		private String nombres;
		private String documento;
		private LocalDate fechaNacimiento;
		
		public Piloto(int idPiloto, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
			super();
			this.idPiloto = idPiloto;
			this.apellido = apellido;
			this.nombres = nombres;
			this.documento = documento;
			this.fechaNacimiento = fechaNacimiento;
		}
		public int getEdad(Piloto p){
			return (LocalDate.now().getYear() - fechaNacimiento.getYear());
			
		}
		public int compareTo(Piloto arg0) {
			return (int) (arg0.getEdad(arg0) - this.getEdad(arg0));
		}
		public int getIdPiloto() {
			return idPiloto;
		}
		public void setIdPiloto(int idPiloto) {
			this.idPiloto = idPiloto;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		@Override
		public String toString() {
			return "Piloto [idPiloto=" + idPiloto + ", apellido=" + apellido + ", nombres=" + nombres + ", documento="
					+ documento + ", fechaNacimiento=" + fechaNacimiento + "]";
		}
		public String mostrarPiloto(){
			return apellido + "," + nombres +"-" +(fechaNacimiento.getYear() - 2018 )+"años";
		}
		
		
		
}
