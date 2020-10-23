package tp6.Historiador;

public class CondicionAnd extends Condicion {

	private Condicion condicion1;
	private Condicion condicion2;
	
	public CondicionAnd(Condicion condicion1, Condicion condicion2) {
		this.condicion1 = condicion1;
		this.condicion2 = condicion2;
	}

	@Override
	public boolean cumple(Documento documento) {
		return this.condicion1.cumple(documento) && this.condicion2.cumple(documento);
	}

}
