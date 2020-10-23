package adicional.farmaciaBusqueda;

import java.util.ArrayList;

public class Medicamento {
	
	private String nombre;
	private double precio;
	private String laboratorio;
	private ArrayList<String> sintomas;
	
	public Medicamento(String nombre, double precio, String laboratorio) {
		this.nombre = nombre;
		this.precio = precio;
		this.laboratorio = laboratorio;
		this.sintomas = new ArrayList<>();
	}

	public String getLaboratorio() {
		return this.laboratorio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}
	
	public boolean tratasSintoma(String sintoma) {
		return sintomas.contains(sintoma);
	}

	
	public String toString() {
		return this.nombre + " (" + this.laboratorio + "): " + this.precio; 
	}


}
