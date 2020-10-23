package farmacia;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Paciente> pacientes;
	private ArrayList<Medicamento> medicamentos;
	
	public Farmacia() {
		this.pacientes = new ArrayList<>();
		this.medicamentos = new ArrayList<>();
	}
	
	public ArrayList<Medicamento> getMedicamentoTrataPaciente(Paciente paciente) {
		ArrayList<Medicamento> resultados = new ArrayList<>();
		for (int i = 0; i < this.medicamentos.size(); i++)
			if (this.aptoMedicamento(medicamentos.get(i), paciente))
				resultados.add(medicamentos.get(i));
		
		return resultados;
	}
	
	public boolean aptoMedicamento(Medicamento medicamento, Paciente paciente) {
		//if (!paciente.esAlergico(medicamento) && paciente.esTratadoPor(medicamento) && paciente.tieneContraindicaciones()) {
		if (paciente.esTratadoPor(medicamento))	{
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public static void main(String[] args) {
		ObraSocial os = new ObraSocial("OSDE", 10);
		
		Paciente p1 = new Paciente("p1", os);
		p1.addSintoma("tos");
		p1.addSintoma("fiebre");
		
		Medicamento ibu = new Medicamento("Ibupirac", 100);
		ibu.addSintoma("tos");
		ibu.addSintoma("dolor");
		ibu.addSintoma("fiebre");
		
		PacienteAlergico p2 = new PacienteAlergico("alergico", os);
		p2.addSintoma("tos");
		p2.addSintoma("fiebre");
		
		p2.addAlergia(ibu);
		
		Farmacia f1 = new Farmacia();
		System.out.println(f1.aptoMedicamento(ibu, p2));
	}

}
