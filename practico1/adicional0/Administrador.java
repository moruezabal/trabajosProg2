package tp1.ej2.adicional0;



public class Administrador {
	
	public static void main(String[] args) {
		
		String s = "";
		
		System.out.println();
	
		
		Contribuyente c1 = new Contribuyente("Seba", 1, 500);
		Contribuyente c2 = new Contribuyente("Sergio", 2, 10);
		
		Ciudad rauch = new Ciudad("Rauch", 15000, 3);
		rauch.addContribuyente(c1);
		rauch.addContribuyente(c2);
		rauch.addGastos(8000);
		
		System.out.println(rauch.getTotalImpuesto() + " - " + rauch.getGastos() + " = " + rauch.getResultado() + " Esta en deficit: " + rauch.estaEnDeficit());
		
		if (c1.equals(c2))
			System.out.println(c1 + " y " + c2 + " son iguales.");
		else
			System.out.println(c1 + " y " + c2 + " son distintos.");
		
		
	}

}
