package parcialito3;

import java.util.ArrayList;

public class Agroquimico {
	
	private String nombre;
	private ArrayList<String>EstadoPatologico;
	private boolean esToxico;
	
	public Agroquimico(String nombre, boolean esToxico) {
		this.nombre = nombre;
		this.EstadoPatologico = new ArrayList<String>();
		this.esToxico = esToxico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsToxico() {
		return esToxico;
	}

	public void setEsToxico(boolean esToxico) {
		this.esToxico = esToxico;
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
	
	public boolean puedeTratar(Enfermedad enfermedad) {
		return this.EstadoPatologico.containsAll(enfermedad.getEstadoPatologico());
		
	}
	

}
