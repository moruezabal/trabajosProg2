package farmacia;

import java.util.ArrayList;

public class PacienteConAlergia extends Paciente {
	
	public ArrayList<Medicamento> alergias;

	public PacienteConAlergia(String nombre) {
		super(nombre);
		this.alergias = new ArrayList<Medicamento>();
	}
	
	public boolean esAlergico(Medicamento medicamento) {
		return this.alergias.contains(medicamento);
	}

}
