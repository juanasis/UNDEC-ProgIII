package practiUno;

//import java.time.LocalDate;
import java.time.*;
import java.util.Collection;
import java.util.LinkedList;

import Utilidades.dateFormatted;;

public class Vuelo implements dateFormatted {
	
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private Collection<Piloto> pilotos;
	private Avion avion;
	private Collection<Asignacion> pasajeros;
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, Collection<Piloto> tripulacion, Avion avion,
			Collection<Asignacion> pasajeros) {
		super();
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = tripulacion;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}

	

	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Collection<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(Collection<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Collection<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(Collection<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}
	@Override
	public String toString() {
		return "Vuelo [codigoVuelo=" + codigoVuelo + ", salida=" + salida + ", fechaHoraSalida=" + fechaHoraSalida
				+ ", arribo=" + arribo + ", fechaHoraArribo=" + fechaHoraArribo + ", aerolinea=" + aerolinea
				+ ", pilotos=" + pilotos + ", avion=" + avion + ", pasajeros=" + pasajeros + "]";
	}
	
	public String estadoAsietno(){
		return "";
		//falta hacer los dos for each de asiento y asignaciones y comparar id
		}
	public int duracionHoras(){
		return (fechaHoraArribo.getDayOfYear() - fechaHoraSalida.getDayOfYear())*24 +(fechaHoraArribo.getHour() - fechaHoraSalida.getHour());
	}

	public int duracionMinutos(){
		if(fechaHoraArribo.getMinute() > fechaHoraSalida.getMinute() )
			return fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute();
		else
			return fechaHoraSalida.getMinute() - fechaHoraArribo.getMinute();
	}
	
	
	public String duracionHsMin(){
		String tiempo;
		int hora =(fechaHoraArribo.getHour() - fechaHoraSalida.getHour());
		int min =duracionMinutos();
		return ""+hora+"h "+min+"m";
				
	}
	
	public String mostrarVuelo() {
		return "Vuelo " + codigoVuelo + " - " + avion.getModelo()+ "  \n"+traductorDia(fechaHoraSalida.getDayOfWeek()) + "  "+
				fechaHoraSalida.getDayOfMonth()+ " de " +traductorMes(fechaHoraSalida.getMonth())+" "+ fechaHoraSalida.getHour()+":"+ fechaHoraSalida.getMinute() + " " + salida.getCodigo() + "("+salida.verCiudad()+" - "+salida.getNombre()+")"
				+ "  \n"+traductorDia(fechaHoraArribo.getDayOfWeek())  + "  "+
						fechaHoraArribo.getDayOfMonth()+  " de "+traductorMes(fechaHoraArribo.getMonth())+" "+ fechaHoraArribo.getHour()+":"+ fechaHoraArribo.getMinute() + " " + arribo.getCodigo() + "("+arribo.verCiudad()+" - "+arribo.getNombre()+
				" \nOperado por "+ aerolinea.getNombre() +".Duracion "+ duracionHsMin() ;
		
	}
	private String traductorMes(Month month) {
		// TODO Auto-generated method stub
	    switch(month) {
	    	case JANUARY : return "ENERO ";
	    	case FEBRUARY : return "FEBRERO ";
	    	case MARCH: return "MARZO";
	    	case APRIL: return "abril";
	    	case MAY: return "MAYO";
	    	case JUNE: return "JUNIO";
	    	case JULY: return "JULIO";
	    	case AUGUST: return "AGOSTO";
	    	case SEPTEMBER: return "SEPTIEMBRE";
	    	case OCTOBER: return "OCTUBRE";
	    	case NOVEMBER: return "NOBIEMBRE";
	    	case DECEMBER: return "DICIEMBRE";
	    	default: System.out.println("error");
		      }
		return null;
	}
	private String traductorDia(DayOfWeek dayOfWeek) {
		// TODO Auto-generated method stub
		switch(dayOfWeek) {
		case MONDAY : return "Lunes";
		case TUESDAY: return "Martes";
		case WEDNESDAY: return "Miercoles";
		case THURSDAY : return "Jueves";
		case FRIDAY : return "Viernes"; 
		case SATURDAY  : return "Sabado"; 
		case  SUNDAY : return "Domingo"; 
		default: System.out.println("error");
		}
		return null;
	}
	public String getDetails() {
		// "Vuelo AR2443 - Embraer ERJ-190-100AR\r\n"
		//		+ "Martes 10 de abril 21:10 IRJ (La Rioja - Aeropuerto Capitán Vicente Almandos Almonacid)\r\n"
			//	+ "Martes 10 de abril 22:45 AEP (Buenos Aires - Aeropuerto Buenos Aires Jorge Newbery)\r\n"
				//+ "Operado por Austral. Duración 1h 35m"
		return "Vuelo "+this.getCodigoVuelo()+" - "+this.avion.getModelo()+"\r\n"+traductorDia(fechaHoraSalida.getDayOfWeek()) + " "+
		fechaHoraSalida.getDayOfMonth()+ " de " +traductorMes(fechaHoraSalida.getMonth())+" "+ fechaHoraSalida.getHour()+":"+ fechaHoraSalida.getMinute() + " " + salida.getCodigo() + " ("+salida.verCiudad()+" - "+salida.getNombre()+")"
		+ "\r\n"+traductorDia(fechaHoraArribo.getDayOfWeek())  + " "+
				fechaHoraArribo.getDayOfMonth()+  " de "+traductorMes(fechaHoraArribo.getMonth())+" "+ fechaHoraArribo.getHour()+":"+ fechaHoraArribo.getMinute() + " " + arribo.getCodigo() + " ("+arribo.verCiudad()+" - "+arribo.getNombre()+
		")\r\nOperado por "+ aerolinea.getNombre() +". Duración "+ duracionHsMin() ;
	}



	@Override
	public String fechaHoraSpanish(LocalDateTime pFechaHora) {
		// TODO Auto-generated method stub
		return dateFormatted.super.fechaHoraSpanish(pFechaHora);
	}



	
	

	
	

}
