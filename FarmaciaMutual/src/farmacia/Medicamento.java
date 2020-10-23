package farmacia;

import java.util.ArrayList;

public class Medicamento {
	
	public String nombre;
	public int precio;
	public ArrayList<String> sintomasQueTrata;
	
	
	public Medicamento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.sintomasQueTrata = new ArrayList<String>();
	}

	// Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	// Functions
	
	public boolean equals(Object o) {
		try {
			Medicamento otro = (Medicamento)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	

}
