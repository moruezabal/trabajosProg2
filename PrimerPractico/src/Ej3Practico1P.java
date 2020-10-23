import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej3Practico1P {

	public static void main(String[] args) {

		int N = 10; //Cantidad de veces que se va a pedir un caracter
		char letra = ' '; //Variable donde se asignará el caracter ingresado por el usuario
		int vocales = 0; // Contador de vocales
		int noletras = 0; // Contador de los caracteres que no son letras 

		for (int i =0; i<N; i++) {
			letra =obtenerCaracterValido();
			if ((letra >='a' && letra<='z') || (letra >='A' && letra<='Z')) {
				if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U') {
					vocales++; // Si ingresó al segundo if es porque es una vocal
				}
			} 
			else {
				noletras++; //Si no ingresó al primer If es porque no es una letra
			}
			
		}
		System.out.println("En total hay "+vocales+" vocales y "+noletras+" caracteres no son letras");
	}

	public static char obtenerCaracterValido() {

		char letra = 'c';
		boolean validar = false;

		while (validar == false) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un caracter:");
				letra = (char) (entrada.readLine().charAt(0));
				validar = true;

			} catch (Exception exc) {
				System.out.println("Error al ingesar el valor,ingresalo nuevamente");

			}

		}
		return letra;
	} 

}
