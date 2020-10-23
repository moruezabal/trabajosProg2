package parcialito3;

import java.util.ArrayList;

public class Cultivo {
	
	private String nombre;
	private ArrayList<Enfermedad>enfermedades;
	
	public Cultivo (String nombre) {
		this.nombre = nombre;
		this.enfermedades = new ArrayList<Enfermedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	public boolean esEfectivo(Agroquimico agroquimico) {
		int i;
		for ( i= 0; i < this.getEnfermedades().size(); i++) {
			if (agroquimico.puedeTratar(getEnfermedades().get(i))) {
				return true;
			}		
		}
		
		return false;
	}
	
	public void addEnfermedad (Enfermedad enfermedad) {
		this.enfermedades.add(enfermedad);
	}
	
	
	

}
