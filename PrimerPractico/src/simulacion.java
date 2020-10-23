
public class simulacion {
	public static void main (String [] args) {
		int num = 0;
		int mayor = 0;
		final int cant = 10;
		final int mult1 = 2;
		final int mult2 = 7;
		int contador = 0;
		int i = 0;
		
		while (i<cant) {
			num = Ejercicio1.pedirentero();
			if (num>mayor) {
				if (!(EsMultiplo(num,mult1))||(EsMultiplo(num,mult2))) {
					contador++;
				}
				mayor=num;
				i++;
			}
			else {
				System.out.println("El número debe ser mayor a 0 y al anterior ingresado");
			}
		}
		System.out.println("La cantidad de números impares o múltiplos de 7 es "+contador);
	}

	public static boolean EsMultiplo(int num1, int num2) {
		if (num1%num2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
