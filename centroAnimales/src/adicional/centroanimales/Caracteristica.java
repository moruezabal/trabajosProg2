package adicional.centroanimales;

public class Caracteristica {
	
	private String nombre;
	private Object valor;
	
	public Caracteristica(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Object getValor() {
		return this.valor;
	}
	
	public void setValor(Object o) {
		this.valor = o;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Caracteristica otra = (Caracteristica)o;
			return this.getNombre().equals(otra.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "(" + this.nombre + ":" + this.valor + ")";
	}

}
