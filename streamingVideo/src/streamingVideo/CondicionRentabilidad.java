package streamingVideo;

import java.util.ArrayList;

public class CondicionRentabilidad extends Condicion {

	public ArrayList<Condicion> condiciones;
	
	public CondicionRentabilidad() {
		this.condiciones = new ArrayList<Condicion>();
		
	}
	
	public void addCondicion(Condicion condicion) {
		this.condiciones.add(condicion);	
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		for (int i = 0; i<this.condiciones.size();i++) {
			if (this.condiciones.get(i).cumple(pelicula) == false) {
				return false;
			}
		}
		return true;
	}
}
