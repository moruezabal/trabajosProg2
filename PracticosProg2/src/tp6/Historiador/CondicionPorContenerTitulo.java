package tp6.Historiador;

public class CondicionPorContenerTitulo extends Condicion {
	
	public String titulo;
	

	public CondicionPorContenerTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().contains(this.titulo);
	}

}
