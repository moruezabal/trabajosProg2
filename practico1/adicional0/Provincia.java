package tp1.ej2.adicional0;

public class Provincia {
	private String nombre;
	private Ciudad[] ciudades;
	private int countCiudades;
	
	public Provincia(String nombre, int nCiudades) {
		this.nombre = nombre;
		
		this.ciudades = new Ciudad[nCiudades]; 
		this.countCiudades = 0;
	}
	
	public boolean addCiudad(Ciudad ciudad) {
		if (countCiudades < ciudades.length) {
			ciudades[countCiudades] = ciudad;
			countCiudades++;
			return true;
		}
		else
			return false;
	}
	
	public double getTotalImpuesto() {
		double suma = 0;
		for (int i = 0; i < countCiudades; i++)
			suma += ciudades[i].getTotalImpuesto();
		
		return suma;
	}
	
	public double getGastos() {
		double suma = 0;
		for (int i = 0; i < countCiudades; i++)
			suma += ciudades[i].getGastos();
		
		return suma;
	}
	
	
	
	public int getCantidadCiudadesEnDeficit(int minimoHabitantes) {
		int cont = 0;
		for (int i = 0; i < countCiudades; i++)
			if (ciudades[i].getHabitantes() >= minimoHabitantes && ciudades[i].estaEnDeficit())
				cont++;
		
		return cont;
		
	}
	
	public int getCantidadCiudadesMinimo(int minimoHabitantes) {
		int cont = 0;
		for (int i = 0; i < countCiudades; i++)
			if (ciudades[i].getHabitantes() >= minimoHabitantes)
				cont++;
		
		return cont;
	}

}
