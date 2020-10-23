package adicional.centroanimales;

import java.util.ArrayList;

public class Animal {

	private ArrayList<Caracteristica> caracteristicas;
	
	

	public Animal(ArrayList<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public ArrayList<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	
}
