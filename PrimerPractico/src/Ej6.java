
public class Ej6 {

	private static final int M = 4;
	private static final int N = 7;

	public static void main(String[] args) {
		int[][] mat = { { 0, 1, 2, 3, 4, 5, 0 }, 
						{ 0, 7, 8, 3, 8, 9, 0 }, 
						{ 0, 7, 9, 15, 0, 0, 1 },
						{ 0, 19, 0, 21, 22, 0, 0 } };

		int[] nuevaFila = { 1, 2, 0, 0, 8, 9, 9 };

		insertarNuevaFila(mat, nuevaFila);
		imprimirMatriz(mat);
	}

	private static void insertarNuevaFila(int[][] mat, int[] nuevaFila) {
		int cantSecuencias = cantSecuencias(nuevaFila);

		int posInsercion = buscarPosicion(mat, cantSecuencias);
		insertarFila(mat, nuevaFila, posInsercion);

	}

	private static void insertarFila(int[][] mat, int[] filaNueva, int fila) {
		for (int columna = 0; columna < N; columna++) {
			mat[fila][columna] = filaNueva[columna];
		}
	}

	private static int cantSecuencias(int[] nuevaFila) {

		int cant = 0;
		int inicio = 0;
		int fin = 0;
		
		while (inicio < N) {
			inicio = buscarInicio(nuevaFila, fin+1);
			if (inicio < N) {
				fin = buscarFin(nuevaFila, inicio);
				cant++;
			}
		}
		return cant;
	}

	private static int buscarFin(int[] nuevaFila, int inicio) {
		int i = inicio;
		while (i < N && nuevaFila[i] != 0)
			i++;
		return i - 1;
	}

	private static int buscarInicio(int[] nuevaFila, int desde) {
		
		int i = desde;
		while (i < N && nuevaFila[i] == 0)
			i++;
		return i;
	}

	private static int buscarPosicion(int[][] mat, int cantSecuencias) {
		int fila = 0;

		while (fila < M && cantSecuencias > cantSecuencias(mat[fila]))
			fila++;

		return fila;
	}

	private static void imprimirMatriz(int[][] mat) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.println("");
		}

	}
}
