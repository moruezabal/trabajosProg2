package tp1.ej2.adicional0;

import java.util.ArrayList;

public class Ciudad {
	
	private String nombre;
	private int habitantes;
	//private double[] impuestos;
	private ArrayList<Contribuyente> contribuyentes;
	private double gastos;
	
	public Ciudad(String nombre, int habitantes, int nImpuestos) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		
		this.contribuyentes = new ArrayList<>();
		
		this.gastos = 0;
	}
	
	public Ciudad(String nombre, int nImpuestos) {
		this(nombre, 0, nImpuestos);
	}
	
	public Ciudad(String nombre) {
		this(nombre, 0, 5);
	}
	
	public int getHabitantes() {
		return habitantes;
	}
	
	public void addContribuyente(Contribuyente contribuyente) {
		this.contribuyentes.add(contribuyente);
	}
	
	public void addGastos(double gastos) {
		this.gastos += gastos;
	}
	
	public double getTotalImpuesto() {
		double suma = 0;
		for (int i = 0; i < this.contribuyentes.size(); i++)
			suma += this.contribuyentes.get(i).getMonto();
		
		return suma;
	}
	
	public double getGastos() {
		return this.gastos;
	}
	
	public double getResultado() {
		return this.getTotalImpuesto() - this.getGastos();
	}
	
	public boolean estaEnDeficit() {
		return this.getResultado() < 0;
		
	}
	
	

}
