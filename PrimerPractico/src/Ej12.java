
public class Ej12 {

	/* Dada una matriz de enteros, ordenar 
	     la matriz de forma ascendente.*/

	public static int N = 4;	// cantidad de filas
	public static int M = 5;	//cantidad de columnas

	public static void main(String[] args) {

		int mat[][]=new int [N][M];

		cargar_matriz(mat, 10);
		imprimir_matriz(mat); 
		ordenar_matriz(mat);

		System.out.println("");
		imprimir_matriz(mat);

	}

	private static void ordenar_matriz(int[][] mat) {

		int aux=0;  // Auxiliar

		//ordenamos la matriz de menor a mayor de la siguiente manera
		for( int i=0; i < N; i++){ //iterador de la fila del elemento a comparar
			for( int j=0;j< M; j++){ // iterador de la columna del elemento a comparar
				for(int x=0; x < N; x++){ // iterador de la fila del elemento con el que lo comparamos
					for(int y=0; y <M; y++){ // iterador de la columna del elemento con el que lo comparamos
						if(mat[x][y] > mat[i][j]){ // Si la celda a comparar es mayor a la del que lo comparamos
							//Hacemos el cambio de valores entre las celdas con la ayuda de un auxiliar
							aux = mat[i][j];
							mat[i][j] = mat[x][y];
							mat[x][y] = aux;
						}
					}
				}
			}
		}

	}

	public static void cargar_matriz (int [] [] mat, int max) {
		for (int i = 0; i<mat.length ;i++) {
			for (int j = 0; j<mat[i].length;j++) {
				mat [i] [j] = (int) (Math.random()* max);
			}
		}
	}

	private static void imprimir_matriz (int [] [] mat) {

		for ( int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}
}

