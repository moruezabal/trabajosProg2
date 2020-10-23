package adicional.farmaciaBusqueda;

public class CondicionBusquedaNOT extends CondicionBusqueda {

	private CondicionBusqueda condicion;
	
	public CondicionBusquedaNOT(CondicionBusqueda condicion) {
		this.condicion = condicion;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return !condicion.cumple(medicamento);
	}

}
