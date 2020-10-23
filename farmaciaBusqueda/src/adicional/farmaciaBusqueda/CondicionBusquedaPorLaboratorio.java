package adicional.farmaciaBusqueda;

// Chequear si el medicamento es de un laboratorio X
public class CondicionBusquedaPorLaboratorio extends CondicionBusqueda {

	private String laboratorio;
	
	public CondicionBusquedaPorLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getLaboratorio().equals(this.laboratorio);
	}

}
