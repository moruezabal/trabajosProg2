package tp8.SistemaDeArchivos;

import java.util.ArrayList;

public class SistemaDeArchivos {
	
	public ArrayList<Fichero> ficheros;
	
	public SistemaDeArchivos() {
		this.ficheros = new ArrayList<>();
	}
	
	public void agregarFichero(Fichero fichero) {
		this.ficheros.add(fichero);
	}
	
	

}
