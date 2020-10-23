package tp1.ej2.adicional0;

public class ContribuyenteComerciante extends Contribuyente {
	
	protected double indiceMonto = 0.5;
	protected double indiceFacturacion = 0.035;
	

	public ContribuyenteComerciante(String nombre, int cit, double facturacion) {
		super(nombre,cit,facturacion);
		this.monto= calcularMonto();
		
	}
	
	
	private double calcularMonto() {
		return ((super.montoFijo * this.indiceMonto) + (super.facturacion * this.indiceFacturacion )) ;	
	}

}
