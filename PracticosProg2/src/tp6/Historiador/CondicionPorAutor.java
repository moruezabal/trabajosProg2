package tp6.Historiador;

public class CondicionPorAutor extends Condicion {
	
	public String autor;
	
	public CondicionPorAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.tengoAutor(this.autor);
	}

}
