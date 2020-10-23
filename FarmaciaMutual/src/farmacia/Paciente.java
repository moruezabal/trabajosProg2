package farmacia;

import java.util.ArrayList;

public class Paciente {
	
	public String nombre;
	public ArrayList<String> sintomas;
	public ObraSocial obraSocial;
	
	
	
	
	public Paciente(String nombre) {
		this.nombre = nombre;
		this.sintomas = new ArrayList<String>();
	}
	
	public void addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}
	
	public void addAlergia(String alergia) {
		this.sintomas.add(alergia);
	}
	
	public double calcularPrecio(Medicamento medicamento) {
		return medicamento.getPrecio();
	}
	
	
	
	
	

	

}
