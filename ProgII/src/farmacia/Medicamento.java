package farmacia;

import java.util.ArrayList;

public class Medicamento {
	
	private String nombre;
	private double precio;
	private ArrayList<String> sintomas;
	
	public Medicamento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.sintomas = new ArrayList<>();
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



}
