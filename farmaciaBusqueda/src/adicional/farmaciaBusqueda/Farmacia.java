package adicional.farmaciaBusqueda;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Paciente> pacientes;
	private ArrayList<Medicamento> medicamentos;
 	
	public Farmacia() {
		this.pacientes = new ArrayList<>();
		this.medicamentos = new ArrayList<>();
	}
	
	public void addMedicamento(Medicamento medicamento) {
		this.medicamentos.add(medicamento);
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
	
	/*
	public ArrayList<Medicamento> buscarMedicamentosPorLaboratorio(String laboratorio) {
		ArrayList<Medicamento> lista = new ArrayList<>();
		
		for (int i = 0; i < this.medicamentos.size(); i++) {
			Medicamento medicamento = this.medicamentos.get(i);
			if (medicamento.getLaboratorio().equals(laboratorio))
				lista.add(medicamento);
		}
		
		return lista;
	}
	
	public ArrayList<Medicamento> buscarMedicamentosPorNombre(String nombre) {
		ArrayList<Medicamento> lista = new ArrayList<>();
		
		for (int i = 0; i < this.medicamentos.size(); i++) {
			Medicamento medicamento = this.medicamentos.get(i);
			if (medicamento.getNombre().equals(nombre))
				lista.add(medicamento);
		}
		
		return lista;
	}
	
	public ArrayList<Medicamento> buscarMedicamentosPorPrecio(double precio) {
		ArrayList<Medicamento> lista = new ArrayList<>();
		
		for (int i = 0; i < this.medicamentos.size(); i++) {
			Medicamento medicamento = this.medicamentos.get(i);
			if (medicamento.getPrecio() == precio)
				lista.add(medicamento);
		}
		
		return lista;
	}
	
	*/
	
	public ArrayList<Medicamento> buscarMedicamentos(CondicionBusqueda condicion) {
		ArrayList<Medicamento> lista = new ArrayList<>();
		
		for (int i = 0; i < this.medicamentos.size(); i++) {
			Medicamento medicamento = this.medicamentos.get(i);
			if (condicion.cumple(medicamento))
				lista.add(medicamento);
		}
		
		return lista;
	}
	
	
		
	public static void main(String[] args) {
		Farmacia f1 = new Farmacia();
		
		Medicamento bayaspirina = new Medicamento("Bayaspirina", 100, "Bayer");
		bayaspirina.addSintoma("tos");
		bayaspirina.addSintoma("dolor");
		bayaspirina.addSintoma("fiebre");
		
		Medicamento aspirineta = new Medicamento("Aspirineta", 50, "Bayer");
		aspirineta.addSintoma("tos");
		aspirineta.addSintoma("dolor");
		aspirineta.addSintoma("fiebre");
		
		Medicamento ibu = new Medicamento("Ibupirac", 100, "Pfizer");
		bayaspirina.addSintoma("tos");
		bayaspirina.addSintoma("dolor");
		bayaspirina.addSintoma("fiebre");
		
		f1.addMedicamento(bayaspirina);
		f1.addMedicamento(ibu);
		f1.addMedicamento(aspirineta);
		
		//System.out.println(f1.buscarMedicamentosPorLaboratorio("Bayer"));
		
		//System.out.println(f1.buscarMedicamentosPorNombre("Ibupirac"));
		
		//System.out.println(f1.buscarMedicamentosPorPrecio(100));
		
		
		/// UTILIZANDO CondicionBusqueda
		
		System.out.println("Utilizando CondicionBusquedas");
		
		CondicionBusqueda c1 = new CondicionBusquedaPorLaboratorio("Bayer");
		System.out.println(f1.buscarMedicamentos(c1));
		
		CondicionBusqueda c2 = new CondicionBusquedaPorNombre("Ibupirac");
		System.out.println(f1.buscarMedicamentos(c2));
		
		CondicionBusqueda c3 = new CondicionBusquedaPorPrecio(50);
		System.out.println(f1.buscarMedicamentos(c3));
		
		// Por Laboratorio y por precio
		CondicionBusqueda cAnd = new CondicionBusquedaAND(c1, c3);
		System.out.println(f1.buscarMedicamentos(cAnd));
		
		CondicionBusqueda cAnd2 = new CondicionBusquedaAND(cAnd, new CondicionBusquedaNOT(c2));
		System.out.println(f1.buscarMedicamentos(cAnd2));
		
		boolean condicion1 = true;
		boolean condicion2 = true;
		boolean condicion3 = true;
		boolean condicion4 = true;
		if ((condicion1 && (condicion2 && (condicion3 && condicion4))))
			 System.out.println();
		
		Paciente p1 = new PacienteConCondicion("Juan", new ObraSocial("OSDE", 0.1), c1);
		p1.addSintoma("tos");
		
		System.out.println(f1.getMedicamentoTrataPaciente(p1));
		
		Paciente pComun = new Paciente("Juan", new ObraSocial("OSDE", 0.1));
		p1.addSintoma("tos");
		
		System.out.println(f1.getMedicamentoTrataPaciente(pComun));
		
		
	}

}
