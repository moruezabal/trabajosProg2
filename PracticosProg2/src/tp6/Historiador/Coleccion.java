package tp6.Historiador;

import java.util.ArrayList;

public class Coleccion {
	
	public ArrayList<Documento> documentos;
	
	public Coleccion() {
		
		this.documentos = new ArrayList<Documento>();
		
	}
	
	public ArrayList<Documento> buscarDocumentos(Condicion condicion){
		
		ArrayList<Documento> lista = new ArrayList<>();
		
		for (int i = 0; i<this.documentos.size();i++) {
			Documento documento = documentos.get(i);
			if (condicion.cumple(documento)) {
				lista.add(documento);
			}		
		}
		return lista;
		
	}
	
	
	

}
