package adicional.farmaciaBusqueda;

public class PacienteConCondicion extends Paciente {
	
	private CondicionBusqueda condicion;

	public PacienteConCondicion(String nombre, ObraSocial os, CondicionBusqueda condicion) {
		super(nombre, os);
		this.condicion = condicion;
	}
	
	@Override
	public boolean esTratadoPor(Medicamento medicamento) {
		return super.esTratadoPor(medicamento) && this.condicion.cumple(medicamento);
	}
	

}
