package practiUno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		 Ciudad ciudad1 = new Ciudad(1,"La Rioja","5360");
		 Ciudad ciudad2 = new Ciudad(2,"Buenos Aires","1000");
		 Ciudad ciudad3 = new Ciudad(3,"Mendoza","5500");
		 Ciudad ciudad4 = new Ciudad(4,"Tucman","4000");
		 Aeropuerto aeropuerto1 = new Aeropuerto(1,"Aeropuerto Capit�n Vicente Almandos Almonacid", ciudad1,"IRJ");
		 Aeropuerto aeropuerto2 = new Aeropuerto(2,"Aeropuerto Buenos Aires Jorge Nwebery", ciudad2,"AEP");
		 Aeropuerto aeropuerto3 = new Aeropuerto(3,"Aeropuerto El Plumerillo", ciudad3,"MDZ");
		 Aeropuerto aeropuerto4 = new Aeropuerto(4,"Aeropuerto Benjam�n Matienzo", ciudad4,"TUC");
		 Pasajero pasajero1 = new Pasajero(1,"20123456784","Ram�rez", "Ramiro Ram�n","12345678");
		 Pasajero pasajero2 = new Pasajero(2,"20102030404","Fernandez", "Fernando Ferm�n","10203040");
		 Pasajero pasajero3 = new Pasajero(3,"20987654324","Martinez", "Mart�n Marcos","98765432");
		 Pasajero pasajero4 = new Pasajero(4,"20198273644","Rodriguez", "Rodrigo Rogelio","19827364");
		 Aerolinea aerolinea1 = new Aerolinea(1,"Aerol�neas Argentinas");
		 Aerolinea aerolinea2 = new Aerolinea(2,"Austral");
		 Aerolinea aerolinea3 = new Aerolinea(3,"LATAM");
		 Aerolinea aerolinea4 = new Aerolinea(4,"Iberia");
		 //LocalDate fecha1 = LocalDate.of(1970, 07, 07);
		 //LocalDate fecha2 = LocalDate.of(1978, 8, 8);
		 //LocalDate fecha3 = LocalDate.of(1950, 05, 05);
		 //LocalDate fecha4 = LocalDate.of(1960, 10, 10);
		 Piloto piloto1 = new Piloto(1,"Perez", "Juan Antonio", "07071970",LocalDate.of(1970, 07, 07));
		 Piloto piloto2 = new Piloto(2,"Mart�nez", "Juan Ignacio", "08081978",LocalDate.of(1978, 8, 8));
		 Piloto piloto3 = new Piloto(3,"L�pez", "Juan Carlos", "05051950",LocalDate.of(1950, 05, 05));
		 Piloto piloto4 = new Piloto(4, "G�mez","Juan Gabriel", "10101960",LocalDate.of(1960, 10, 10));
		 Asiento asiento1 = new Asiento(1,"A1");
		 Asiento asiento2 = new Asiento(2,"B1");
		 Asiento asiento3 = new Asiento(3,"C1");
		 Asiento asiento4 = new Asiento(4,"H1");
		 Asiento asiento5 = new Asiento(5,"J1");
		 Asiento asiento6 = new Asiento(6,"K1");
		 Asiento asiento7 = new Asiento(7,"A2");
		 Asiento asiento8 = new Asiento(8,"B2");
		 Asiento asiento9 = new Asiento(9,"C2");
		 Asiento asiento10 = new Asiento(10,"H2");
		 Asiento asiento11 = new Asiento(11,"J2");
		 Asiento asiento12 = new Asiento(12,"K2");
		 Asiento asiento13 = new Asiento(13,"A1");
		 Asiento asiento14 = new Asiento(14,"B1");
		 Asiento asiento15 = new Asiento(15,"C1");
		 Asiento asiento16 = new Asiento(16,"H1");
		 Asiento asiento17 = new Asiento(17,"J1");
		 Asiento asiento18 = new Asiento(18,"K1");
		 Asiento asiento19 = new Asiento(19,"A2");
		 Asiento asiento20 = new Asiento(20,"B2");
		 Asiento asiento21 = new Asiento(21,"C2");
		 Asiento asiento22 = new Asiento(22,"H2");
		 Asiento asiento23 = new Asiento(23,"J2");
		 Asiento asiento24 = new Asiento(24,"K2");
		 Asiento asiento25 = new Asiento(25,"A1");
		 Asiento asiento26 = new Asiento(26,"C1");
		 Asiento asiento27 = new Asiento(27,"D1");
		 Asiento asiento28 = new Asiento(28,"E1");
		 Asiento asiento29 = new Asiento(29,"G1");
		 Asiento asiento30 = new Asiento(30,"H1");
		 Asiento asiento31 = new Asiento(31,"K1");
		 Asiento asiento32 = new Asiento(32,"A2");
		 Asiento asiento33 = new Asiento(33,"C2");
		 Asiento asiento34 = new Asiento(34,"D2");
		 Asiento asiento35 = new Asiento(35,"E2");
		 Asiento asiento36 = new Asiento(36,"G2");
		 Asiento asiento37 = new Asiento(37,"H2");
		 Asiento asiento38 = new Asiento(38,"K2");
		 Asiento asiento39 = new Asiento(39,"A1");
		 Asiento asiento40 = new Asiento(40,"H1");
		 Asiento asiento41 = new Asiento(41,"K1");
		 Asiento asiento42 = new Asiento(42,"A2");
		 Asiento asiento43 = new Asiento(43,"H2");
		 Asiento asiento44 = new Asiento(44,"K2");
		 //ASIGNACIONES
		 Asignacion asig1 = new Asignacion(pasajero1,asiento43,"AR2443100420182012345678443");
		 Asignacion asig2 = new Asignacion(pasajero4,asiento41,"AR2443100420182019827364441");
		 //LISTA PARA PASAJERO VUELO
		 LinkedList paraVuelo1 = new LinkedList();
		 paraVuelo1.add(asig1);paraVuelo1.add(asig2);
		 //LISTA PARA PRIMER AVION
		 LinkedList lista1 = new LinkedList();
		 lista1.add(asiento1);lista1.add(asiento2);lista1.add(asiento3);lista1.add(asiento4);lista1.add(asiento5);lista1.add(asiento6);
		 lista1.add(asiento7);lista1.add(asiento8);lista1.add(asiento9);lista1.add(asiento10);lista1.add(asiento11);lista1.add(asiento12);
		 //LISTA PARA SEGUNDO AVION
		 LinkedList lista2 = new LinkedList();
		 lista2.add(asiento13);lista2.add(asiento14);lista2.add(asiento15);lista2.add(asiento16);lista2.add(asiento17);lista2.add(asiento18);
		 lista2.add(asiento19);lista2.add(asiento20);lista2.add(asiento21);lista2.add(asiento22);lista2.add(asiento23);lista2.add(asiento24);
		 //LISTA PARA EL TERCER AVION
		 LinkedList lista3 = new LinkedList();
		 lista3.add(asiento25);lista3.add(asiento26);lista3.add(asiento27);lista3.add(asiento28);lista3.add(asiento29);lista3.add(asiento30);
		 lista3.add(asiento31);lista3.add(asiento32);lista3.add(asiento33);lista3.add(asiento34);lista3.add(asiento35);lista3.add(asiento36);
		 lista3.add(asiento37);lista3.add(asiento38);
		 //LISTA PARA CUARTO AVION
		 LinkedList lista4 = new LinkedList();
		 lista4.add(asiento39);lista4.add(asiento40);lista4.add(asiento41);lista4.add(asiento42);lista4.add(asiento43);lista4.add(asiento44);
		 
		 Avion avion1 = new Avion(1,"Airbus A340-313X","LV-FPV",lista1);
		 Avion avion2 = new Avion(2,"Airbus A330-233","LV-FNI",lista2);
		 Avion avion3 = new Avion(3,"Boein 737-8MB","LV-FYK",lista3);
		 Avion avion4 = new Avion(4,"Embraer ERJ-190-100AR","LV-CIH",lista4);
		 //Pilotos para vuelo1
		 LinkedList listaPiloto1 = new LinkedList();
		 listaPiloto1.add(piloto1);listaPiloto1.add(piloto2);
		 Vuelo vuelo1 = new Vuelo("AR2443",aeropuerto1,LocalDateTime.of(2018, 04, 10, 21, 10),aeropuerto2,LocalDateTime.of(2018, 04, 10, 22, 45),aerolinea2,listaPiloto1,avion4,paraVuelo1);
		 
		 
		//IMPRIMIR AEROPUERTO
		 LinkedList<Aeropuerto> aeropuertos = new LinkedList();
		 aeropuertos.add(aeropuerto1);aeropuertos.add(aeropuerto2);aeropuertos.add(aeropuerto3);aeropuertos.add(aeropuerto4); 
		 /*for(Aeropuerto a : aeropuertos)
			 	System.out.println(a.mostrarAeropuerto());
		 */
		 //IMPRIMIR VUELO
		 System.out.println(vuelo1.mostrarVuelo());
	}

}
