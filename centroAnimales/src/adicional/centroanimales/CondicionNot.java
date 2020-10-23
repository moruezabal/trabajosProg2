package adicional.centroanimales;

public class CondicionNot extends Condicion {
	
	private Condicion condicion;
	
	public CondicionNot(Condicion condicion) {
		this.condicion = condicion;
	}
	
	@Override
	public boolean cumple(Jaula jaula) {
		return !this.condicion.cumple(jaula);
	}

}
