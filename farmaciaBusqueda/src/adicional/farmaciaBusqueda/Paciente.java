package adicional.farmaciaBusqueda;

import java.util.ArrayList;

public class Paciente {

	private String nombre;
	private ObraSocial os;
	private ArrayList<String> sintomas;


	public Paciente(String nombre, ObraSocial os) {
		this.nombre = nombre;
		this.os = os;
		this.sintomas = new ArrayList<>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ObraSocial getOs() {
		return os;
	}

	public void setOs(ObraSocial os) {
		this.os = os;
	}

	public void addSintoma(String sintoma) {
		this.sintomas.add(sintoma);
	}

	public boolean esTratadoPor(Medicamento medicamento) {
		for (int i = 0; i < this.sintomas.size(); i++) {
			if (!medicamento.tratasSintoma(this.sintomas.get(i)))
				return false;
		}

		return true;

	}

}
