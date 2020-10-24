package PortalDeNoticias;

import java.util.ArrayList;

public class Seccion extends Contenido {
	
	private String nombre;
	private ArrayList<Contenido> contenido;
	private String descripcion;
	private String imagenAsociada;
	
	
	public Seccion(String nombre, String descripcion, String imagenAsociada) {
		this.nombre = nombre;
		this.contenido = new ArrayList<>();
		this.descripcion = descripcion;
		this.imagenAsociada = imagenAsociada;
	}

	
	public void addContenido(Contenido contenido) {
		this.contenido.add(contenido);
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagenAsociada() {
		return imagenAsociada;
	}


	public void setImagenAsociada(String imagenAsociada) {
		this.imagenAsociada = imagenAsociada;
	}


	@Override
	public int cantNoticias() {
		int cantNoticias = 0;
		
		for (Contenido contenido: this.contenido)
			cantNoticias += contenido.cantNoticias();
		
		return cantNoticias;
	}

	@Override
	public Contenido copiar() {
		Seccion copia = new Seccion(this.nombre, this.descripcion, this.imagenAsociada);
		
		for (Contenido contenido: this.contenido) {
			Contenido auxiliar = contenido.copiar();
			copia.addContenido(auxiliar);
		}
		
		return copia;
	}


	@Override
	public Contenido copiar(String palabraClave) {
		Seccion copia = new Seccion(this.nombre, this.descripcion, this.imagenAsociada);
		
		for (Contenido contenido: this.contenido) {
			Contenido auxiliar = contenido.copiar(palabraClave);
			if (auxiliar != null)
				copia.addContenido(auxiliar);
		}
		
		return copia;
	}


	@Override
	public ArrayList<Noticia> buscarNoticias(Busqueda busqueda) {
		
		ArrayList<Noticia>seleccion = new ArrayList<Noticia>();
		
		for (Contenido contenido: this.contenido) {
			ArrayList<Noticia> resultado = contenido.buscarNoticias(busqueda);
			seleccion.addAll(resultado);
		}
		
		return seleccion;
	}


	@Override
	public ArrayList<String> mapeo() {
		
		ArrayList<String> mapa = new ArrayList<>();
		
		mapa.add(this.getNombre());
		
		for (Contenido contenido: this.contenido) {
			ArrayList<String> mapaHijo = contenido.mapeo(); 
			for (String rutaHijo: mapaHijo) {
				 mapa.add(this.getNombre()+ "/" + rutaHijo);  
			}
			
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
