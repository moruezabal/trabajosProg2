package adicional.farmaciaBusqueda;

public class CondicionBusquedaPorNombre extends CondicionBusqueda {
	
	private String nombre;
	
	public CondicionBusquedaPorNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getNombre().equals(this.nombre);
	}

}
