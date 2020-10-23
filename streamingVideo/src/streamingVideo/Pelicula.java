package streamingVideo;

import java.util.ArrayList;

public class Pelicula {
	
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int anio_estreno;
	private int duracion_min;
	private int edad_minima;
	
	
	
	public Pelicula(String titulo, String sinopsis, String director, int anio_estreno, int duracion_min, int edad_minima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.generos = new ArrayList<String>();
		this.director = director;
		this.actores = new ArrayList<String>();
		this.anio_estreno = anio_estreno;
		this.duracion_min = duracion_min;
		this.edad_minima = edad_minima;
	}
	
	// Getters and Setters 
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio_estreno() {
		return anio_estreno;
	}
	public void setAnio_estreno(int anio_estreno) {
		this.anio_estreno = anio_estreno;
	}
	public int getDuracion_min() {
		return duracion_min;
	}
	public void setDuracion_min(int duracion_min) {
		this.duracion_min = duracion_min;
	}
	public int getEdad_minima() {
		return edad_minima;
	}
	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}
	
	// Functions
	
	public void addActor(String actor) {
		this.actores.add(actor);
	}
	
	public void addGenero(String genero) {
		this.actores.add(genero);
	}
	
	public boolean contieneGenero(String genero) {
		for (int i = 0; i<this.generos.size();i++) {
			if (this.generos.get(i).equals(genero)){
				return true;
			}
		}
		return false;
	}
	
	public boolean contieneActor(String actor) {
		for (int i = 0; i<this.actores.size();i++) {
			if (this.actores.get(i).equals(actor)){
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean esRentable(CondicionRentabilidad Condicion) {
		return Condicion.cumple(this);
		
	}
	
	
	
}
