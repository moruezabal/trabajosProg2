import java.util.Scanner;

public class PrimeraClase {
	
	public static void ejer1(){
		
		int empleados = 0;
		
		int sueldos=0;
		int min = 0; 
		int max = 0;
		int sueldosTotales = 0;
		
		System.out.println("Ingrese la cantidad de empleados:");
		Scanner s = new Scanner(System.in);
		empleados = s.nextInt();
		for(int i = 1; i <= empleados; i++) {
			System.out.println("INgrese el sueldo del empleado " +i);
			sueldos = s.nextInt();
			if(sueldos <= 300) {
				min++;
			}else {
				max++;
			}
			sueldosTotales = sueldosTotales + sueldos;
		}
		System.out.println("La cantidad de empleados que cobra menosde $300 es: " + min);
		System.out.println("la cantidad de empleados que cobra mas de $300 es: " +max);
		System.out.println("El total de sueldos de la empresa es: " +sueldosTotales);
	}
	
	public static void main(String args[]){
		ejer1();
	}

 public static void countdown() {
	 
 }
}