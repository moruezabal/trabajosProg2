package farmacia;

public class ObraSocial {
	private String nombre;
	private double descuento;
	
	public ObraSocial(String nombre, double descuento) {
		this.nombre = nombre;
		this.descuento = descuento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
}
