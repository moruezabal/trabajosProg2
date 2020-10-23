package tp8.SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import tp8.SistemaDeArchivos.busqueda.Busqueda;

public class Atajo extends Fichero {

	private static int PESO_ATAJO = 1;
	
	private Fichero apuntado;
	
	public Atajo(Fichero apuntado, LocalDate fechaCreacion) {
		super(apuntado.getNombre(), fechaCreacion); 	}
	
	public Fichero getApuntado() {
		return this.apuntado;
	}
	
	@Override
	public String getNombre() {
		return "Acceso Directo a " + super.getNombre();
	}

	@Override
	public double getPeso() {
		return PESO_ATAJO;
	}

	@Override
	public int cantArchivos() {
		return 1;
	}
	
	public static void setPesoAtajo(int pesoNuevo) {
		PESO_ATAJO = pesoNuevo;
	}

	@Override
	public int cantCarpetas() {
		return 0;
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.apuntado.getFechaModificacion();
	}
	
	@Override
	public ArrayList<Fichero> buscar(Busqueda busqueda) {
		ArrayList<Fichero> salida = new ArrayList<>();
		
		if (busqueda.cumple(this)) 
			salida.add(this);
		
		return salida;
	}
	
	
}
