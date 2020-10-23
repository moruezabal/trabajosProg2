package adicional.centroanimales;

import java.util.ArrayList;

public class Jaula {
	
	private ArrayList<Caracteristica> caracteristicas;
	
	public Jaula() {
		this.caracteristicas = new ArrayList<>();
	}
	
	public void addCaracteristica(String nombre, Object valor) {
		Caracteristica nueva = new Caracteristica(nombre, valor);
		if (!tieneCaracteristica(nueva))	
			this.caracteristicas.add(nueva);
	}
	
	public void modificarCaracteristica(String nombre, Object valor) {
		Caracteristica c = this.getCaracteristica(nombre);
		if (c != null) {
			c.setValor(valor);
		}
		else {
			this.addCaracteristica(nombre, valor);
		}
	}
	
	private Caracteristica getCaracteristica(String nombre) {
		for (int i = 0; i < this.caracteristicas.size(); i++)
			if (this.caracteristicas.get(i).getNombre().equals(nombre))
				return this.caracteristicas.get(i);
		
		return null;
	}
	
	public Object getValor(String nombre) {
		Caracteristica c = this.getCaracteristica(nombre);
		if (c != null)
			return c.getValor();
		else
			return null;
	}
	
	public boolean tieneCaracteristica(String nombre) {
		return this.getCaracteristica(nombre) != null;
		
		/*for (int i = 0; i < this.caracteristicas.size(); i++) 
			if (this.caracteristicas.get(i).getNombre().equals(nombre))
				return true;
		
		return  false;*/
	}
	
	public boolean tieneCaracteristica(Caracteristica nueva) {
		return this.caracteristicas.contains(nueva);
	}
	
	@Override
	public String toString() {
		return this.caracteristicas.toString();
	}
	

}
