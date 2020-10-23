package parcialito3;

import java.util.ArrayList;

public class EmpresaAgricola {
	
	private ArrayList<Agroquimico>agroquimicos;
	private ArrayList<Cultivo>cultivos;
	
	
	
	
	public ArrayList<Agroquimico> getAgroquimicos() {
		return agroquimicos;
	}




	public void setAgroquimicos(ArrayList<Agroquimico> agroquimicos) {
		this.agroquimicos = agroquimicos;
	}




	public ArrayList<Cultivo> getCultivos() {
		return cultivos;
	}




	public void setCultivos(ArrayList<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}




	public ArrayList<Agroquimico>ListadoAgroquimicos(Enfermedad enfermedad){
		ArrayList<Agroquimico>agroquimicos = new ArrayList<Agroquimico>();
		int i;
		for ( i= 0; i < this.getAgroquimicos().size(); i++) {
			if (getAgroquimicos().get(i).puedeTratar(enfermedad)) {
				agroquimicos.add(getAgroquimicos().get(i));
			}		
		}
		
		return agroquimicos;
		
	}
	
	public ArrayList<Agroquimico>ListadoAgroquimicosPorCultivo(Cultivo cultivo){
		ArrayList<Agroquimico>agroquimicos = new ArrayList<Agroquimico>();
		int i, j;
		for ( i= 0; i < this.getAgroquimicos().size(); i++) {
			for ( j= 0; j < cultivo.getEnfermedades().size(); j++) {
			
			if (getAgroquimicos().get(i).puedeTratar(cultivo.getEnfermedades().get(j))) {
				agroquimicos.add(getAgroquimicos().get(i));
				}
			}
			}
		
		return agroquimicos;
		}
	
		
		
	
	
}
		
		
	


