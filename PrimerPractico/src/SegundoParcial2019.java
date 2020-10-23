
public class SegundoParcial2019 {

	/* Dada una matriz de caracteres de MxN compuesta de secuencias de caracteres separadas por
espacios, hacer un programa completo para borrar la secuencia central de cada fila (secuencia
correspondiente a la mitad de la cantidad de secuencias que tiene la fila, sin importar si la
cantidad es par o impar). Para borrar realizar los desplazamientos necesarios y no utilizar
estructuras auxiliares. Suponer que la matriz se encuentra cargada, y que cada fila comienza y
termina con caracteres espacio. */

	public static int M = 5;
	public static int N = 12;

	public static void main(String[] args) {
		
		char [] [] N1984 = {
				{' ','E','r','a',' ','u','n',' ','d','í','a',' '},
				{' ','l','u','m','i','n','o','s','o',' ','y',' '},
				{' ',' ','y',' ','f','r','í','o',' ','d','e',' '},
				{' ','A','b','r','i','l',' ','y',' ','e','l',' '},
				{' ','r','e','l','o','j',' ','d','a','b','a',' '},
				{' ',' ','l','a','s',' ','t','r','e','c','e',' '}
		};
		
		imprimir_matriz (N1984);
		
		for (int fila = 0; fila < M ; fila++) {
			borrar_secuencia_central(N1984[fila]);			
		}
		
		System.out.println(" ");
		imprimir_matriz (N1984);
		
		

	}
	
	private static void borrar_secuencia_central(char[] fila) {
		
		int sumaSec = cantSecuencias(fila);
		System.out.println(sumaSec);
		
		
		
		
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
	
	private static int cantSecuencias(char[] nuevaFila) {

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

	private static void imprimir_matriz (char [] [] mat) {

		for ( int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}

}
