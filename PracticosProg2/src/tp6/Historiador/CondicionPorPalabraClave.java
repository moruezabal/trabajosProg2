package tp6.Historiador;

public class CondicionPorPalabraClave extends Condicion {
	
	public String palabra;
	
	public CondicionPorPalabraClave(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.tengoPalabraClaves(this.palabra);
	}

}
