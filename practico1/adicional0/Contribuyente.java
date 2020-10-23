package tp1.ej2.adicional0;

public class Contribuyente {
	
	protected String nombre;
	protected int cit;
	protected double montoFijo; // El monto fijo estipulado
	protected double monto; // El impuesto que debe pagar y es recaudado por la ciudad
	protected double facturacion;
	protected double indiceMonto = 1;
	protected double indiceFacturacion = 1;
	
	protected static int contador;
	
	
	public Contribuyente(String nombre, int cit, double facturacion) {
		this.nombre = nombre;
		this.monto = calcularMonto();
		this.facturacion = facturacion;
		this.cit = contador;
		contador++;
	}

	private double calcularMonto() {
		return monto;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCit() {
		return cit;
	}

	public void setCit(int cit) {
		this.cit = cit;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public String toString() {
		return this.getNombre() + " cit: " + this.getCit() + " Monto: " + this.getMonto();
	}
	
	public boolean equals(Object o) {
		try {
			return this.getCit() == ((Contribuyente)o).getCit();
		} catch (Exception e) {
			return false;
		}
	}
	
	

}
