package adicional.centroanimales;

public class CondicionPorCaracteristica extends Condicion {
	
	private String nombre;
	private Object valor;
	
	public CondicionPorCaracteristica(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	@Override
	public boolean cumple(Jaula jaula) {
		if (jaula.tieneCaracteristica(nombre))
			return jaula.getValor(nombre).equals(valor);
		else
			return false;
	}
	
	

}
