   package streamingVideo;

import java.util.ArrayList;

public class StreamingVideo {
	
	private ArrayList<Pelicula> catalogo;
	private Condicion CondicionRentabilidad;
	
	public StreamingVideo(Condicion condicionRentabilidad){
		
		this.catalogo = new ArrayList<Pelicula>();
		this.CondicionRentabilidad = condicionRentabilidad;
		
	}
	
	// Getters & Setters
	
	public Condicion getCondicionRentabilidad() {
		return CondicionRentabilidad;
	}

	public void setCondicionRentabilidad(Condicion condicionRentabilidad) {
		CondicionRentabilidad = condicionRentabilidad;
	}
	
	// Functions

	public void addPelicula(Pelicula pelicula) {
		this.catalogo.add(pelicula);
	}

}
