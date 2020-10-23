package parcialito3;

import java.util.ArrayList;

public class CultivoComestible extends Cultivo {

	private ArrayList<Agroquimico>AgroquimicosProhibidos;

	public CultivoComestible(String nombre) {
		super(nombre);
		this.AgroquimicosProhibidos = new ArrayList<Agroquimico>();
		
	}

	public void setAgroquimicosProhibidos(ArrayList<Agroquimico> agroquimicosProhibidos) {
		this.AgroquimicosProhibidos = agroquimicosProhibidos;
	}
	
	public void addAgroquimicoProhibido (Agroquimico Agroquimico) {
		if (Agroquimico.isEsToxico())
		this.AgroquimicosProhibidos.add(Agroquimico);
	}
}
