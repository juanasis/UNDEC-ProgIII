package Utilidades;

import java.time.*;
import java.time.format.TextStyle;
import java.util.*;

public interface dateFormatted {
	public default String fechaHoraSpanish(LocalDateTime pFechaHora) {
		Locale argentina = new Locale("es", "AR");
		String dia = pFechaHora.getDayOfWeek().getDisplayName(TextStyle.FULL, argentina).toLowerCase();
		
		return dia.substring(0,1).toUpperCase() + dia.substring(1).toLowerCase() + " " + pFechaHora.getDayOfMonth() + " de "
				+ pFechaHora.getMonth().getDisplayName(TextStyle.FULL, argentina) + " " + pFechaHora.getHour() + ":"
				+ pFechaHora.getMinute();
		
	} 
}
