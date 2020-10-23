package tp8.SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import tp8.SistemaDeArchivos.busqueda.Busqueda;

public class Carpeta extends Fichero{

	private ArrayList<Fichero>contenido;
	
	
	public Carpeta(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.contenido = new ArrayList<>();
	}
	
	public void addArchivo(Fichero fichero){
		this.contenido.add(fichero);
		
	}

	@Override
	public double getPeso() {
		int peso = 0;
		
		for (int i=0; i<this.contenido.size(); i++) {
			peso += contenido.get(i).getPeso(); 
		}
		return peso;
	}

	@Override
	public int cantArchivos() {
		int cantArchivos = 0;
		
		for (int i=0; i<this.contenido.size(); i++) {
			cantArchivos += contenido.get(i).cantArchivos(); 
		}
		return cantArchivos;
	}

	// Devuelve el total de carpetas que tiene debajo contandose a si misma
	@Override
	public int cantCarpetas() {
		int cantCarpetas = 1;
		
		for (Fichero fichero: this.contenido) {
			cantCarpetas += fichero.cantCarpetas(); 
		}
		return cantCarpetas;
	}

	@Override
	public LocalDate getFechaModificacion() {
		
		LocalDate maximaFecha = this.getFechaCreacion();
		
		for (Fichero fichero: this.contenido) {
			LocalDate fechaModFichero = fichero.getFechaModificacion();
			if (fechaModFichero.isAfter(maximaFecha)) {
				maximaFecha = fechaModFichero;
			}
		}
		return maximaFecha; 
	}

	@Override
	public ArrayList<Fichero> buscar(Busqueda busqueda) {
		
		ArrayList<Fichero> salida = new ArrayList<>();
		
		for (Fichero fichero: this.contenido) {
			salida.addAll(fichero.buscar(busqueda));
			}
		
		if (busqueda.cumple(this)) 
			salida.add(this);
		
		return salida;
	
	}

}
