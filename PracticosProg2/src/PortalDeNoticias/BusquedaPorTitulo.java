package PortalDeNoticias;

public class BusquedaPorTitulo extends Busqueda {
	
	private String tituloBuscado;
	
	public BusquedaPorTitulo(String titulo) {
		this.tituloBuscado = titulo;
	}

	public String getTituloBuscado() {
		return tituloBuscado;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTitulo().contains(this.tituloBuscado);
	}

}
