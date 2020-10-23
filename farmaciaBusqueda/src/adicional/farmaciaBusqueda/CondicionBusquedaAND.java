package adicional.farmaciaBusqueda;

public class CondicionBusquedaAND extends CondicionBusqueda {

	private CondicionBusqueda condicion1;
	private CondicionBusqueda condicion2;
	
	public CondicionBusquedaAND(CondicionBusqueda condicion1, CondicionBusqueda condicion2) {
		this.condicion1 = condicion1;
		this.condicion2 = condicion2;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return condicion1.cumple(medicamento) && condicion2.cumple(medicamento);
	}

}
