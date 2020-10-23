
public class Ej7 {

	/*Dada una matriz de m × n de caracteres o de tipo char, donde en
	cada fila se tiene secuencias de caracteres separadas por uno o
	más espacios ‘ ’, realizar un programa que elimine las secuencias
	de tamaño TAM de toda la matriz. Para eliminar tenga en cuenta
	hacer los corrimientos correspondientes y completar con espacios
	‘ ’ al final.*/

	public static void main(String[] args) {

		int TAM = 2;
		int M = 4;
		int N = 12;

		char [] [] quijote = { 
				{' ','e','n',' ','u','n',' ','l','u','g','a','r'},
				{' ','d','e',' ','l','a',' ','m','a','n','c','h'},
				{'a',' ','c','u','y','o',' ','n','o','m','b','r'},
				{'e',' ','n','o',' ','m','e',' ','a','c','u','e'}
		};
	
		
		imprimir_matriz(quijote,M,N); // Ver matriz original en la consola

		for (int fila = 0; fila < quijote.length; fila++) {
			eliminar_sec_segun_tamaño(quijote[fila],TAM);	// Elimina secuencia por fila	
		}
	
		imprimir_matriz(quijote,4,12); // Ver matriz modificada en la consola
		
	}

	private static void imprimir_matriz (char [] [] mat, int filas, int columnas) {

		for ( int i = 0; i<filas; i++) {
			for(int j = 0; j<columnas;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}

	private static void eliminar_sec_segun_tamaño(char [] fila, int size) {

		int inicio = 0;
		int fin = -1;
		int tam_secuencia = 0;

			while(inicio < fila.length) {
				inicio = buscarInicio (fila, fin+1);
				if (inicio  < fila.length) {
					fin = buscarFin (fila,inicio);
				}
				
				tam_secuencia = (fin-inicio)+1;
				if (tam_secuencia == size) {  //Si el tamaño de la secuencia encontrada es igual a la pasada por parámetro
					for (int i = inicio; i<=fin;i++) {
						corr_izq(fila,inicio);
					}
					fin = fin-size; // Recompone la posición fin tras la secuencia eliminada
				}
			}
		}
	

	public static void corr_izq(char [] arr, int pos) {
		for (int i = pos; i<arr.length ;i++) {
			if (i != (arr.length-1)) { // Si no es el último elemento del arreglo;
				arr[i] = arr[i+1]; //Esa posición copia el valor de su elemento posterior
			}
			else {
				arr[i] = ' '; // Se completa la última posición por espacio

			}
		}

	}

	public static int buscarInicio(char [] arr, int i) {
		while (i<arr.length && arr[i]==' ') {
			i++;
		}
		return i; // Si se pasó del arreglo, devuelve una posición inválida
	}

	public static int buscarFin(char [] arr, int inicio) {
		while (inicio<arr.length && arr[inicio]!=' ') {
			inicio++;
		}
		return inicio-1; //Siempre va a haber un fin, lo retorna
	}
}
