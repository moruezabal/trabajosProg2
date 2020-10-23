package parcialito3;

import java.util.ArrayList;

public class Enfermedad {
	
	private String nombre;
	private ArrayList<String>EstadoPatologico;
	
	public Enfermedad(String nombre, ArrayList<String> estadoPatologico) {
		
		this.nombre = nombre;
		EstadoPatologico = estadoPatologico;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getEstadoPatologico() {
		return EstadoPatologico;
	}


	public void setEstadoPatologico(ArrayList<String> estadoPatologico) {
		EstadoPatologico = estadoPatologico;
	}
	
	public void addEstadoPatologico (String patologia) {
		this.EstadoPatologico.add(patologia);
	}

}
