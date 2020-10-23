package streamingVideo;


public class CondicionContieneTitulo extends Condicion{
	
private String nombre;
	
	public CondicionContieneTitulo(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getTitulo().contains(this.nombre);
	}

}
