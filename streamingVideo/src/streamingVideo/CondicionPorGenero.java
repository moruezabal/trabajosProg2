package streamingVideo;

public class CondicionPorGenero extends Condicion{
	
private String nombre;
	
	public CondicionPorGenero(String genero) {
		this.nombre = genero;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.contieneGenero(this.nombre);
	}
}
