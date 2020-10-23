package tp6.Historiador;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Documento {
	
	private String titulo;
	private ArrayList<String> autores;
	private String texto;
	private ArrayList<String> palabrasClaves;
	

	public Documento(String titulo, String texto) {
		this.titulo = titulo;
		this.autores = new ArrayList<String>();
		this.texto = texto;
	}
	
	public void addAutor(String autor) {
		this.autores.add(autor);
	}
	
	public void addPalabraClave(String palabraClave) {
		this.autores.add(palabraClave);
	}
	
	public boolean tengoAutor(String autor) {
		return this.autores.contains(autor);
	}
	
	public boolean tengoPalabraClaves(String palabraClave) {
		return this.palabrasClaves.contains(palabraClave);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public int contarPalabras() {
		String words = this.getTexto();
		StringTokenizer st = new StringTokenizer(words);
		return st.countTokens();
	}
	
	

}
