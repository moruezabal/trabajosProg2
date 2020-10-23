package tp6.Historiador;

public class CondicionPorTituloIdentico extends Condicion {
	
	public String texto;
	
	public CondicionPorTituloIdentico(String texto) {
		this.texto = texto;
	}

	@Override
	public boolean cumple(Documento documento) {
		return this.texto.equals(documento.getTitulo());

	}

}
