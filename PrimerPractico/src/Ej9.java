
public class Ej9 {

	/* Dada una matriz de m × n de caracteres con filas que tienen
secuencias de caracteres separadas por uno o más espacios ‘ ’,
realizar un programa que reemplace todas las ocurrencias de una
secuencia patrón dada en un arreglo P, por la secuencia contenida
en el arreglo R (Las secuencias en P y R pueden tener distinto
tamaño). */

	public static final int M = 4;
	public static final int N = 23;

	public static void main(String[] args) {

		char [] [] trabalenguas = {
				{' ','c','o','m','p','r','e',' ',' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ',},
				{' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ','c','o','m','p','r','e',' ',' ',},
				{'c','o','m','o',' ','c','o','m','p','r','e',' ','p','o','c','a','s',' ','c','o','p','a','s',},
				{' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ','p','a','g','u','e',' ',' ',' ',}
		};

		char [] P = {'p','o','c','a','s'};
		char [] R = {'d','o','s'};


		imprimir_matriz(trabalenguas); // Ver estado original de la matriz

		for (int fila = 0; fila<M;fila++) {
			reemplazar_segun_patron(trabalenguas[fila],P,R);
		}

		System.out.println("");
		imprimir_matriz(trabalenguas); // Ver estado modificado de la matriz

	}

	private static void reemplazar_segun_patron(char[] fila, char [] patron, char [] reemplazo) {

		int inicio = 0;
		int fin = -1;
		int tamanio = 0;
		boolean hayPatron = false;
		int diferencia = 0;

		while (inicio<N) { // Si hay inicio, hay secuencia - Mientras haya secuencias
			inicio = buscarInicio(fila, fin+1);
			if (inicio<N) {
				fin = buscarFin(fila, inicio);
				tamanio = (fin-inicio)+1; // Luego de obtener el inicio y fin de la secuencia calculo su tamaño

				hayPatron = comprobarContenido(fila,inicio,tamanio,patron); // Compruebo la secuencia con el patrón
				if (hayPatron) { // Si hay coincidencia 
					reemplazarContenido(fila,inicio,reemplazo); // reemplazo la secuencia con el contenido del la secuencia R
					if (reemplazo.length<tamanio) { // Si reemplazo era más chico, debo borrar los caracteres de la secuencia que sobraron
						diferencia = tamanio - reemplazo.length; //Calculo la diferencia a borrar
						for (int i= 0; i<diferencia; i++) {
							corr_izq(fila,inicio+reemplazo.length); // Hago el corrimiento desde donde terminé de reemplazar
						}
						fin = fin - diferencia; // Luego del corrimiento, reubico el fin de la nueva secuencia para seguir buscando inicios
					}
				}
			}
		}
	}
	
	private static int buscarInicio(char[] nuevaFila, int desde) {

		int i = desde;
		while (i < N && nuevaFila[i] == ' ')
			i++;
		return i;
	}

	private static int buscarFin(char[] nuevaFila, int inicio) {

		int i = inicio;
		while (i < N && nuevaFila[i] != ' ')
			i++;
		return i - 1;
	}
	
	private static boolean comprobarContenido(char[] fila, int inicio, int tamanio, char[] patron) {

		int contCoincidencia = 0;

		if (tamanio!=patron.length) { 
			return false;					
		}
		else {
			for (int i = 0; i<patron.length; i++) {
				if (fila[inicio+i] == patron [i]) {
					contCoincidencia++;
				}
			}
			if (contCoincidencia == patron.length) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	private static void reemplazarContenido(char[] fila, int inicio, char[] reemplazo) {

		for (int i = 0; i<reemplazo.length; i++) {
			fila[inicio+i] = reemplazo[i]; 
		}
	}

	public static void corr_izq(char [] arr, int pos) {
		for (int i = pos; i<arr.length ;i++) {
			if (i != (arr.length-1)) { // Si no es el último elemento del arreglo;
				arr[i] = arr[i+1]; //Esa posición copia el valor de su elemento posterior
			}
			else {
				arr[i] = ' '; // Se completa la última posición por cero
			}
		}
	}

	private static void imprimir_matriz (char [] [] mat) {

		for ( int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}
}
