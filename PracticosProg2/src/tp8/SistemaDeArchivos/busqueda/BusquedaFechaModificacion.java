package tp8.SistemaDeArchivos.busqueda;

import java.time.LocalDate;

import tp8.SistemaDeArchivos.Fichero;

public class BusquedaFechaModificacion extends Busqueda {
	
	private LocalDate fechaMinima;
	
	public BusquedaFechaModificacion(LocalDate fechaMinima) {
		this.fechaMinima = fechaMinima;
	}

	@Override
	public boolean cumple(Fichero fichero) {
		return fichero.getFechaModificacion().isAfter(this.fechaMinima);
	}

}
