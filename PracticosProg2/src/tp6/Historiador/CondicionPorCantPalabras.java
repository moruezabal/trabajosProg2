package tp6.Historiador;

public class CondicionPorCantPalabras extends Condicion {
	
	private int cant;
	
	public CondicionPorCantPalabras(int cant) {
		this.cant = cant;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.contarPalabras() >= cant;
	}

}
