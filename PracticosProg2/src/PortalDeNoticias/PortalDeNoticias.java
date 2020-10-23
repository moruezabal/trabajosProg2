package PortalDeNoticias;

import java.util.ArrayList;

public class PortalDeNoticias {
	
	private ArrayList<Contenido> contenido;

	public PortalDeNoticias() {
		this.contenido = new ArrayList<>();
	}
	
	public ArrayList<Noticia> buscarNoticias(Busqueda busqueda){
		ArrayList<Noticia>seleccion = new ArrayList<Noticia>();
		
		for (Contenido contenido: this.contenido) {
			ArrayList<Noticia> resultado = contenido.buscarNoticias(busqueda);
			seleccion.addAll(resultado);
		}
		
		return seleccion;
	}
	
	
	
	

}
