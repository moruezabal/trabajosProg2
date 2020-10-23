package adicional.farmaciaBusqueda;

public class CondicionBusquedaPorPrecio extends CondicionBusqueda {

	private double precio;
	
	public CondicionBusquedaPorPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getPrecio() == precio;
	}

}
