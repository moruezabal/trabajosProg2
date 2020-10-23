package tp8.SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import tp8.SistemaDeArchivos.busqueda.Busqueda;

public class Archivo extends Fichero{
	
	private String extension;
	private int peso;
	public LocalDate fechaModificacion;
	
	
	public Archivo(String nombre, String extension, int peso, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.extension = extension;
		this.peso = peso;
		this.fechaModificacion = fechaCreacion;
		
		// TODO Auto-generated constructor stub
	}

	
	public String getExtension() {
		return this.extension;
	}
	
	
	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	@Override
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	@Override
	public int cantArchivos() {
		return 1;
	}


	@Override
	public int cantCarpetas() {
		return 0;
	}


	@Override
	public ArrayList<Fichero> buscar(Busqueda busqueda) {
		ArrayList<Fichero> salida = new ArrayList<>();
		
		if (busqueda.cumple(this)) 
			salida.add(this);
		
		return salida;
	}
	
	
	
	
	 
	
	

}
