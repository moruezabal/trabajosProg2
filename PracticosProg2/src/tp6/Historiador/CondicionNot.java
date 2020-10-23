package tp6.Historiador;

public class CondicionNot extends Condicion {

private Condicion condicion;
	
	public CondicionNot(Condicion condicion) {
		this.condicion = condicion;
	}
	
	@Override
	public boolean cumple(Documento documento) {
		return !this.condicion.cumple(documento);
	}

}
