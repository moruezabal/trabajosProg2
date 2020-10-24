package PortalDeNoticias;

import java.util.ArrayList;

public class Noticia extends Contenido {
	
	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String introduccion;
	private String texto;
	private String autor;
	private String link;
	
	
	
	public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
		this.titulo = titulo;
		this.palabrasClaves = new ArrayList<>();
		this.introduccion = introduccion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(this.palabrasClaves);
	}
	
	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves = new ArrayList<>(this.palabrasClaves);
	}
	
	public void addPalabraClave(String palabraClave) {
		this.palabrasClaves.add(palabraClave);
	}
	
	public String getIntroduccion() {
		return introduccion;
	}
	
	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public int cantNoticias() {
		return 1;
	}

	@Override
	public Contenido copiar() {
		
		Noticia copia = new Noticia(this.titulo,this.introduccion,this.texto,this.autor,this.link);
		copia.setTitulo(this.titulo);
		copia.setIntroduccion(this.introduccion);
		copia.setTexto(this.texto);
		copia.setAutor(this.autor);
		copia.setLink(this.link);
		copia.setPalabrasClaves(this.getPalabrasClaves());
	
		return copia;
	}



	@Override
	public Contenido copiar(String palabraClave) {
		if (this.palabrasClaves.contains(palabraClave)) {
			Noticia copia = new Noticia(this.titulo,this.introduccion,this.texto,this.autor,this.link);
			copia.setTitulo(this.titulo);
			copia.setIntroduccion(this.introduccion);
			copia.setTexto(this.texto);
			copia.setAutor(this.autor);
			copia.setLink(this.link);
			copia.setPalabrasClaves(this.getPalabrasClaves());
		
			return copia;
		} else {
			return null;
		}
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Busqueda busqueda) {
		ArrayList<Noticia> salida = new ArrayList<>();
		
		if (busqueda.cumple(this)) 
			salida.add(this);
		
		return salida;
	}



	@Override
	public ArrayList<String> mapeo() {
		ArrayList<String> mapa= new ArrayList<>();
		mapa.add(this.link);
	
		return mapa;
	}
	

}


