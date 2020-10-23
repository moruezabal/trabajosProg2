
public class Ej10 {

	/* Dada una matriz de m × n de caracteres con filas que tienen
secuencias de caracteres separadas por uno o más espacios ‘ ’,
realizar un programa que ordene ascendentemente cada fila de la
matriz por tamaño de secuencias. Las secuencias deberán quedar
separadas por un carácter espacio siempre que haya lugar.*/

	public static void main(String[] args) {

		char [][] scaramouche = {
				{' ','N','a','c','i','o',' ','c','o','n',' '},
				{' ','e','l',' ','d','o','n',' ','d','e',' '},
				{' ','l','a',' ','r','i','s','a',' ','y',' '},
				{' ','s','i','n',' ','l','a',' ','f','e',' '},
				
		};
		
		for (int fila = 0; fila<scaramouche.length; fila++ ) {
			ordernar_sec_por_cant(scaramouche[fila]);
		}
		imprimir_matriz(scaramouche);



	}

	private static void ordernar_sec_por_cant(char[] fila) {
		
		int cantSec = cantSecuencias(fila);
		
		for (int i = 1; i<cantSec;i++) {
			for (int j= 0; j<cantSec-1;j++) {
				
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
	
	private static int buscarInicio(char[] nuevaFila, int desde) {

		int i = desde;
		while (i < nuevaFila.length && nuevaFila[i] == ' ')
			i++;
		return i;
	}

	private static int buscarFin(char[] nuevaFila, int inicio) {

		int i = inicio;
		while (i < nuevaFila.length && nuevaFila[i] != ' ')
			i++;
		return i - 1;
	}
	
	private static int cantSecuencias(char[] nuevaFila) {

		int cant = 0;
		int inicio = 0;
		int fin = 0;
		
		while (inicio < nuevaFila.length) {
			inicio = buscarInicio(nuevaFila, fin+1);
			if (inicio < nuevaFila.length) {
				fin = buscarFin(nuevaFila, inicio);
				cant++;
			}
		}
		return cant;
	}
}


