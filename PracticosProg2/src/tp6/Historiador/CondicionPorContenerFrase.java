package tp6.Historiador;

public class CondicionPorContenerFrase extends Condicion {
	
	public String frase;

	public CondicionPorContenerFrase(String frase) {
		this.frase = frase;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTexto().contains(this.frase);
	}

}
