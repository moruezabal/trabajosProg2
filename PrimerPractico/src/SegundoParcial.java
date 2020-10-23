
public class SegundoParcial {
	
	/* Dada una matriz de MxN enteros, donde cada fila de la matriz contiene secuencias de
	 * números separadas por uno o más ceros, crear un programa que invierta (para cada fila) 
	 * la secuencia de mayor longitud. En caso de existir múltiples secuencias con la 
	 * mayor longitud en una fia, invertir cualquiera de ellas. */
	
	public static int M = 3;
	public static int N = 13;

	public static void main(String[] args) {
		int [] [] matriz = {
				{1,2,0,0,6,7,0,1,4,2,1,8,0},
				{0,5,4,2,0,1,6,0,2,0,0,1,0},
				{0,1,2,3,4,5,6,7,8,9,0,0,0}	};
		
		imprimir_matriz(matriz);
		
		for (int fila = 0; fila < M; fila ++) {
			invertir_secuencia_mayor(matriz[fila]);
		}
		
		System.out.println(" ");
		imprimir_matriz(matriz);
	}
	


	private static void invertir_secuencia_mayor(int[] fila) {
		int inicio = 0; int inicioMayor = 0;
		int fin = -1; int finMayor = 0;
		int tamanio = 0; int tamanioMayor = 0;
		
		while (inicio < N) {
			inicio = buscarInicio(fila,fin+1);
			if (inicio < N) {
				fin = buscarFin(fila,inicio);
				tamanio = (fin-inicio)+1;
				if (tamanio>tamanioMayor) {
					inicioMayor = inicio;
					finMayor = fin;
					tamanioMayor = tamanio;
				}
			}
		}
		invertir_secuencia (fila,inicioMayor,finMayor);		
	}

	private static int buscarInicio(int[] fila, int pos) {
		while(pos<N && fila[pos]==0) {
			pos++;
		}
		return pos;
	}
	
	private static int buscarFin(int[] fila, int inicio) {
		while (inicio<N && fila[inicio] != 0) {
			inicio++;
		}
		return inicio-1;
	}

	private static void invertir_secuencia(int[] fila, int inicio, int fin) {
		int i = inicio;
		int j = fin;
		int aux = 0;
		
		while(i<j) {
			aux = fila [i];
			fila[i] = fila[j];
			fila[j] = aux;
			i++;
			j--;
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
