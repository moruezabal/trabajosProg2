package tp8.SistemaDeArchivos.busqueda;

import java.time.LocalDate;

import tp8.SistemaDeArchivos.Fichero;

public class BusquedaFechaCreacion extends Busqueda {
	
	private LocalDate fechaMinima;
	
	public BusquedaFechaCreacion(LocalDate fechaMinima) {
		this.fechaMinima = fechaMinima;
	}

	@Override
	public boolean cumple(Fichero fichero) {
		return fichero.getFechaCreacion().isAfter(this.fechaMinima);
	}

}
