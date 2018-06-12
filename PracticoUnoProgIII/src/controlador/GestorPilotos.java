package controlador;

import java.util.*;

//import practiUno.Avion;
import practiUno.Piloto;
import practiUno.Vuelo;

public class GestorPilotos {
	Collection<Piloto> pilotos;

	public GestorPilotos(Collection<Piloto> listaDePilotos) {
		pilotos = listaDePilotos;
	}

	public int horasVueloPiloto(Collection<Vuelo> crearVuelos, Piloto piloto1) {

		int hsVueloPiloto = 0;
		for (Vuelo vuelo : crearVuelos) {
			// if(vuelo.getAvion().getIdAvion() == pAvion.getIdAvion())
			if (vuelo.getPilotos() != null)
				for (Piloto pilotoDelVuelo : vuelo.getPilotos()) {
					if (pilotoDelVuelo.getIdPiloto() == piloto1.getIdPiloto())
						hsVueloPiloto += (vuelo.duracionHoras() * 60) + vuelo.duracionMinutos();
				}

		}
		return hsVueloPiloto / 60;

	}
}
