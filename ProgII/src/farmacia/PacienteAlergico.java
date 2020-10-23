package farmacia;

import java.util.ArrayList;

public class PacienteAlergico extends Paciente {

	private ArrayList<Medicamento> alergias;
	
	public PacienteAlergico(String nombre, ObraSocial os) {
		super(nombre, os);
		this.alergias = new ArrayList<>();
	}
	
	public void addAlergia(Medicamento medicamento) {
		this.alergias.add(medicamento);
	}


	public boolean esAlergico(Medicamento medicamento) {
		return alergias.contains(medicamento);
	}
	
	@Override
	public boolean esTratadoPor(Medicamento medicamento) {
		if (this.esAlergico(medicamento))
			return false;
		else
			return super.esTratadoPor(medicamento);
	}

	
	
	
}
