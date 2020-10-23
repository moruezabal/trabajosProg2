
public class Matrices {

	public static int MAX1 = 10;
	public static int MAX2 = 10;
	public static int DIMENSION = 4;

	public static void main(String[] args) {

		char [] [] tablero = new char [MAX1] [MAX2];
	}

	public static void imprimir_matriz (int [] [] mat, int filas, int columnas) {

		for ( int i = 0; i<filas; i++) {
			for(int j = 0; j<columnas;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}


	}

	public static void cargar_matriz (int [] [] mat, int max) {
		for (int i = 0; i<mat.length ;i++) {
			for (int j = 0; j<mat[i].length;j++) {
				mat [i] [j] = (int) (Math.random()* max);
			}

		}
	}

	public static void cargar_arreglo (int [] arr, int max) {
		for (int i = 0; i<arr.length ;i++) {
			arr [i] = (int) (Math.random()* max);
		}
	}

	public static int sumar_diagonal (int [] [] mat) {

		int suma = 0;

		for (int i = 0; i <MAX1; i++) {
			for (int j= i; j<= i; j++) {
				suma += mat [i] [j];
			}

		}
		return suma;


	}

	public static int sumar_diagonal_inferior (int [] [] mat) {

		int suma = 0;

		for (int i = 0; i <MAX1 ; i++) {
			for (int j=0; j<=i; j++) {
				suma += mat [i] [j];
			}

		}
		return suma;



	}

	public static void invertir_posicion_fila(int [] [] mat, int pos1, int pos2) {

		int aux = 0;
		for (int i = 0; i<MAX1 ; i++) {
			for (int j = i; j<=i; j++) {
				aux = mat [i] [pos1];
				mat [i] [pos1] = mat [i] [pos2];
				mat [i] [pos2] = aux;		
			}
		}

	}

	public static void insertar_fila (int [] [] mat, int [] filanueva, int pos) {

		for(int j = 0; j< filanueva.length; j++) {
			mat [pos] [j] = filanueva [j];	
		}
	}

	public static void eliminar_fila (int [] [] mat, int pos_fila) {

		for (int i = pos_fila ; i < mat.length; i++) {

			if(i != mat.length-1) {
				for (int j = 0; j < mat [i].length; j++) {
					mat [i] [j] = mat [i+1] [j];
				}
			}
			else {
				for (int j = 0; j < mat [i].length; j++) {
					mat [i] [j] = 0;
				}
			}
		}
	}

	public static void ordenar_arreglo_asc (int[] arr){
		int aux;
		for(int i = 1;i < arr.length;i++){
			for (int j = 0 ; j < arr.length - 1; j++){
				if (arr[j] > arr[j+1]){
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}
		}
	}


	public static int sumar_fila (int [] arr) {

		int suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
			suma = suma + arr[i];
		}
		return suma;

	}

	private static void insertarFilaOrdenada(int[][] mat, int[] filaNueva) {

		int suma = sumar_fila(filaNueva);
		int pos = buscarPosicion(mat, suma);

		if(pos < mat.length) {
			correrHaciaAbajo(mat, pos);
			insertar_fila(mat, filaNueva, pos);
		}
	}
	
	
	private static void correrHaciaAbajo(int[][] mat, int fila) {
		for (int filaActual = mat.length - 1; filaActual > fila; filaActual--) {
			copiarFila(mat, filaActual, filaActual - 1);
		}

	}

	private static void copiarFila(int[][] mat, int filaVieja, int filaNueva) {
		for (int columna = 0; columna < mat[0].length; columna++) {
			mat[filaVieja][columna] = mat[filaNueva][columna];
		}

	}

	private static int buscarPosicion(int[][] mat, int suma) {
		int fila = 0;
		int sumaFila = sumar_fila(mat[0]);

		while (fila < mat.length && sumaFila < suma) {
			fila++;
			sumaFila = sumar_fila(mat[fila]);
		}

		return fila;
	}

	public static void resolverEj2 () {

		int m = (int) ((Math.random()*9)+1);
		int n = (int) ((Math.random()*9)+1);
		int pos = (int) ((Math.random()*m));
		int [] [] matriz = new int [m] [n];
		int [] filanueva = new int [n];
		
		imprimir_matriz(matriz,m,n);
		System.out.println("");

		cargar_matriz (matriz,10);
		imprimir_matriz(matriz,m,n);

		insertar_fila(matriz,filanueva,pos);

		System.out.println(" ");
		System.out.println("La fila se insertará en la posición "+pos);

		System.out.println(" ");
		imprimir_matriz(matriz,m,n);
	}

	public static void resolverEj3() {

		int m = (int) ((Math.random()*9)+1);
		int n = (int) ((Math.random()*9)+1);
		int [] [] matriz = new int [m] [n];
		int pos = (int) (Math.random()*m);

		cargar_matriz (matriz,10);
		imprimir_matriz(matriz,m,n);

		System.out.println("");
		System.out.println("La fila a eliminar es "+pos);

		if (m>2) {

		}
		eliminar_fila(matriz,pos);

		System.out.println("");
		imprimir_matriz(matriz,m,n);
	}

	public static void resolverEj4() {

		int m = (int) ((Math.random()*9)+1);
		int n = (int) ((Math.random()*9)+1);
		int [] [] matriz = new int [m] [n];

		cargar_matriz (matriz,10);
		imprimir_matriz(matriz,m,n);
		System.out.println(" ");

		for (int fila = 0; fila < matriz.length; fila++) {
			ordenar_arreglo_asc(matriz[fila]);
		}

		imprimir_matriz(matriz,m,n);

	}

	public static void resolverEj5(){

		int[][] mat = { 
				{ 0,  1,  0,  3 }, 
				{ 0,  7,  8,  0 }, 
				{ 0,  7,  9, 15 }, 
				{ 0, 19, 20, 21 } 
		};

		int[] filaNueva = { 0, 9, 9, 0 };

		insertarFilaOrdenada(mat, filaNueva);
		imprimir_matriz(mat,4,4);

	}


}
