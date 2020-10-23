
public class Ej8 {

	/* Dada una matriz de m × n de caracteres con filas que tienen
	secuencias de caracteres separadas por uno o más espacios ‘ ’,
	realizar un programa que invierta el orden de las últimas CANT
	secuencias de cada fila de la matriz. */

	public static final int M = 7;
	public static final int N = 9;
	public static final int CANT = 2;

	public static void main(String[] args) {

		char [] [] lolita = {
				{'l','o','l','i','t','a',' ','l','u'},
				{'z',' ','d','e',' ','m','i',' ','v'},
				{'i','d','a',' ','f','u','e','g','o'},
				{' ','d','e',' ','m','i','s',' ','e'},
				{'n','t','r','a','ñ','a','s',' ','p'},
				{'e','c','a','d','o',' ','m','i','o'},
				{' ','a','l','m','a',' ','m','i','a'}

		};
		imprimir_matriz (lolita,M,N); // Ver estado original de la matriz en la consola

		for (int fila = 0; fila<lolita.length; fila++) {
			invertir_segun_cantidad(lolita[fila]);
		}

		System.out.println(" ");
		imprimir_matriz (lolita,M,N); // Ver la matriz modificada en la consola

	}

	private static void invertir_segun_cantidad(char [] fila) {
		
		int inicio = 0;
		int fin = N; //Comienza a buscar desde la última posición del arreglo
		int cantSec = cantSecuencias(fila);

		if (cantSec >= CANT) {
			for (int i = 0; i<CANT ; i++) {
				inicio = buscarInicioReversa(fila, fin-1);
				fin = buscarFinReversa(fila, inicio);
				invertirSecuencia(fila,inicio,fin);
						
			}
		}
	}

	private static void invertirSecuencia(char[] fila, int inicio, int fin) {
		int i = inicio;
		int j = fin;
		char aux = ' ';
		while (i>j) {
			aux = fila [i];
			fila [i] = fila [j];
			fila [j] = aux;
			i--;
			j++;						
		}
	
	}

	private static int buscarFinReversa(char[] fila, int inicio) {
		
		while (inicio>=0 && fila[inicio]!=' ') {
			inicio--;
		}
		return inicio+1; //Siempre va a haber un fin, lo retorna	
	}

	private static int buscarInicioReversa(char[] fila, int i) {
		
		while (i>=0 && fila[i]==' ') {
			i--;
		}
		return i; // Si se pasa de arreglo devuelve -1
	}

	private static int cantSecuencias(char[] nuevaFila) {

		int cant = 0;
		int inicio = 0;
		int fin = -1;

		while (inicio < N) {
			inicio = buscarInicio(nuevaFila, fin+1);
			if (inicio < N) {
				fin = buscarFin(nuevaFila, inicio);
				cant++;
			}
		}
		return cant;
	}

	private static int buscarFin(char[] nuevaFila, int inicio) {
		
		int i = inicio;
		while (i < N && nuevaFila[i] != ' ')
			i++;
		return i - 1;
	}

	private static int buscarInicio(char[] nuevaFila, int desde) {

		int i = desde;
		while (i < N && nuevaFila[i] == ' ')
			i++;
		return i;
	}

	private static void imprimir_matriz (char [] [] mat, int filas, int columnas) {

		for ( int i = 0; i<filas; i++) {
			for(int j = 0; j<columnas;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}

}
