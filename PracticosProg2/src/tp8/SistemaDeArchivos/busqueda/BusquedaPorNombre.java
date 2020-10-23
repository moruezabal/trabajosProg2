package tp8.SistemaDeArchivos.busqueda;

import tp8.SistemaDeArchivos.Fichero;

public class BusquedaPorNombre extends Busqueda {
	
	private String buscado;
	
	public BusquedaPorNombre(String buscado) {
		this.buscado = buscado;
	}



	@Override
	public boolean cumple(Fichero fichero) {
		return fichero.getNombre().contains(this.buscado);
	}

}
