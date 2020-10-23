package streamingVideo;

public class CondicionNot extends Condicion {

private Condicion condicion;
	
	public CondicionNot(Condicion condicion) {
		this.condicion = condicion;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return !this.condicion.cumple(pelicula);
	}

}
