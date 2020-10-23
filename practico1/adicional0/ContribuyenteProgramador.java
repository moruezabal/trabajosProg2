package tp1.ej2.adicional0;

public class ContribuyenteProgramador extends Contribuyente {

	protected double indiceMonto = 0.2;
	protected double indiceFacturacion = 0.02;
	

	public ContribuyenteProgramador(String nombre, int cit, double facturacion) {
		super(nombre,cit,facturacion);
		this.monto= calcularMonto();
		
	}
	
	
	private double calcularMonto() {
		return ((super.montoFijo * this.indiceMonto) + (super.facturacion * this.indiceFacturacion )) ;	
	}

}