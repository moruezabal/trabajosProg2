package adicional.centroanimales;

import java.util.ArrayList;

public class CentroAnimales {
	
	private ArrayList<Jaula> jaulas;
	
	public CentroAnimales() {
		this.jaulas = new ArrayList<>();
	}
	
	public void addJaula(Jaula jaula) {
		this.jaulas.add(jaula);
	}
	
	public ArrayList<Jaula> getJaulasPorCondicion(Condicion condicion) {
		ArrayList<Jaula> list = new ArrayList<>();
		for (int i = 0; i < jaulas.size(); i++)
			if (condicion.cumple(jaulas.get(i)))
				list.add(jaulas.get(i));
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		Jaula j1 = new Jaula();
		j1.addCaracteristica("largo", 100);
		j1.addCaracteristica("alto", 220);
		j1.addCaracteristica("ancho", 50);
		j1.addCaracteristica("color", "rojo");
		
		Jaula j2 = new Jaula();
		j2.addCaracteristica("largo", 80);
		j2.addCaracteristica("alto", 240);
		j2.addCaracteristica("ancho", 200);
		j2.addCaracteristica("tiene arbol", true);
		
		CentroAnimales centro = new CentroAnimales();
		centro.addJaula(j1);
		centro.addJaula(j2);
		
		
		Condicion noNaranja = new CondicionNot(new CondicionPorCaracteristica("color", "naranja"));
		Condicion alto220 = new CondicionPorCaracteristica("alto", 220);
		Condicion noNaranjaYAlto220 = new CondicionAnd(noNaranja, alto220);
		System.out.println(centro.getJaulasPorCondicion(noNaranjaYAlto220));
		
		
	}
	

}
