package PortalDeNoticias;

import java.util.ArrayList;

public abstract class Contenido {
	
	public abstract int cantNoticias();
	
	public abstract Contenido copiar();
	
	public abstract Contenido copiar(String palabraClave);
	
	public abstract ArrayList<Noticia> buscarNoticias(Busqueda busqueda);
	
	public abstract ArrayList<String> mapeo();
	

}
