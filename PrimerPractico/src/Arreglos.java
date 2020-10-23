import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arreglos {

	final static int MAX = 10;
	final static int MAX2 = 20;
	final static int INVALIDO = -1;

	public static void main (String [] args) {

		resolverEj7();

	}


	public static void resolverEj3() {

		int [] arr = array_random_desc(10,1000);

		int pos = (int) (Math.random()*MAX);
		System.out.println("Posición elegida: "+pos);

		//Imprimimos arreglo inicial
		System.out.println("El arreglo inicial es: ");
		mostrar_arreglo(arr);

		corr_izq(arr, pos);

		//Imprimimos arreglo modificado
		System.out.println("\nEl arreglo modificado es:");
		mostrar_arreglo(arr);

	}

	public static void resolverEj4() {

		int num = 0;
		int [] arr = array_random_desc(10,1000);

		num = pedirnatural_menorA(1000);

		mostrar_arreglo(arr);

		for (int i = 0; i<MAX; i++) {

			if (num<arr[MAX-1])	{
				corr_izq(arr,0);
				arr[MAX-1] = num;
				i = MAX;

			} 

			else if (num>=arr[i]) {
				corr_der(arr, i);
				arr[i] = num;
				i = MAX;
			}

		}
		System.out.println("\nEl elemento se ha ingresado");	
		mostrar_arreglo(arr);

	}

	public static void resolverEj5() {

		int num = 0;
		int [] arr = {9,18,27,36,45,54,63,72,81,90};

		num = pedirnatural_menorA(100);
		int changes = 0;

		mostrar_arreglo(arr);

		for (int i = 0; i<MAX-1;i++) {
			if (arr[i]== num) {
				corr_izq(arr,i);
				i=MAX;
				changes++;
			}	
		}

		if (changes==0) {
			System.out.println("\nEl elemento no ha sido encontrado en la lista");
		}

		else {
			System.out.println("\nEl elemento ha sido eliminado");
		}
		mostrar_arreglo(arr);
	}

	public static void resolverEj6() {

		int [] arr = array_random_desc(10,1000);

		mostrar_arreglo(arr);

		for (int i = 0; i<MAX;i++) {
			if (arr[i]%2==0) {
				arr[i]=-1;
			}
		}
		System.out.println("\nEl arreglo ha sido modificado");
		mostrar_arreglo(arr);

	}

	public static void resolverEj7() {

		int aux = 0;
		int i = 0;
		int j = MAX-1;
		int [] arr = array_random_desc(10,1000);
		mostrar_arreglo(arr);

		while (i<j) {
			aux = arr[j];
			arr[j] = arr [i];
			arr [i] = aux;
			i++;
			j--;
		}

		System.out.println("\nEl arreglo ha sido invertido");
		mostrar_arreglo(arr);

	}

	public static void resolverEj8() {

		int inicio = 0;
		int fin = 0;
		boolean secuencia = false;
		int [] arr = {0,0,6,3,3,5,2,1,2,3,0,0,2,3,1,7,1,2,3,0};

		for (int i = 0; i<MAX2; i++) {
			if (arr[i] != 0) {
				fin = i;
				secuencia = true;
			}
			else if (secuencia) {
				i = MAX2;
			}
			else {
				inicio++;		
			}
		}	
		System.out.println(inicio+" , "+fin);
	}

	public static void resolverEj9() {

		int [] arr = {7,2,4,0,9,1,2,0,0,3,4,0,2,0,9,8,0,1,2,8};

		int inicio = 0; int inicioMayor = -1;
		int fin = 0; int finMayor = -1;
		int suma = 0; int sumaMayor = 0;

		// Buscar la primera suma máxima
		inicioMayor = buscarInicio(arr,fin);
		if (inicioMayor != INVALIDO) {
			finMayor = buscarFin(arr,inicio);
			sumaMayor = sumarSecuencia(arr,inicioMayor,finMayor);
		}

		inicio = finMayor; //El inicio de la segunda secuencia es el fin del anterior
		fin = finMayor;


		//Seguir buscando
		while (inicio != INVALIDO) {
			inicio = buscarInicio(arr, fin+1);;
			if (inicio != INVALIDO) {
				fin = buscarFin (arr, inicio);
				
				suma = sumarSecuencia (arr, inicio, fin);
				if (suma > sumaMayor) {
					sumaMayor = suma;
					inicioMayor = inicio;
					finMayor = fin;
				}
			}
		}

		System.out.println("Inicio Secuencia mayor: "+inicioMayor);
		System.out.println("Fin Secuencia mayor: "+finMayor);
		System.out.println("La suma de la secuencia es :"+sumaMayor);


	}

	public static void resolverEj10() {

		int [] arr = {0,1,2,3,0,1,2,0,5,5,5,0,6,0,9,8,0,9,9,9};

		int inicio = MAX2-1; //Ultima posición del arreglo
		int fin = MAX2; // Se le resta 1 en el parámetro inicio
		int contSecuencia = 0;



		do  {
			inicio = buscarInicioReversa(arr, fin-1);
			if (inicio != INVALIDO) {
				fin = buscarFinReversa(arr,inicio);
				contSecuencia++;
			}
		}
		while (inicio != INVALIDO && contSecuencia<2);

		if (contSecuencia < 2) {
			System.out.println("No hay secuencias suficientes");	
		}

		else {
			System.out.println("Inicio segunda secuencia: "+inicio);
			System.out.println("Fin segunda secuencia: "+fin);
		}
	}

	public static void resolverEj11() {

		int [] arr = {0,1,0,2,2,0,3,3,3,0,4,4,4,0,5,5,5,0,2,2};
		int num_user = -1;
		int inicio = 0;
		int fin = -1;

		System.out.println("Elige un número entre 1 y "+arr.length);
		num_user = pedirentero();
		
		System.out.println("El arreglo inicial es");
		mostrar_arreglo(arr);
		
		eliminar_segun_tamaño(arr, inicio, fin, num_user);

		System.out.println("\nEl arreglo modificado es este: ");
		mostrar_arreglo(arr);

	}
	
	public static void resolverEj12() {
		
		int [] arr = {0,1,2,3,0,1,2,0,5,5,5,0,6,0,9,8,0,9,9,9};
		int [] patron = {0,1,2,3};
		
		
		
	}

	public static void eliminar_segun_tamaño(int arr[],int inicio, int fin, int num_user) {

		int size= 0; //Tamaño de la secuencia

		while (inicio != INVALIDO) {
			inicio = buscarInicio (arr, fin+1);
			if (inicio != INVALIDO) {
				fin = buscarFin (arr,inicio);
				size = (fin-inicio)+1;
				if (coincide_tamaño(num_user,size)) {
					for (int i = inicio; i<=fin;i++) {
						corr_izq(arr,inicio);
					}
					fin = fin-size; // Recompone la posición fin tras la secuencia eliminada
				}
			}
		}

	}
	public static boolean coincide_tamaño (int opcion, int size) {

		if (opcion == size) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void corr_izq(int [] arr, int pos) {
		for (int i = pos; i<arr.length ;i++) {
			if (i != (arr.length-1)) { // Si no es el último elemento del arreglo;
				arr[i] = arr[i+1]; //Esa posición copia el valor de su elemento posterior
			}
			else {
				arr[i] = 0; // Se completa la última posición por cero
			}
		}
	}

	public static int buscarInicio(int [] arr, int i) {
		while (i<arr.length && arr[i]==0) {
			i++;
		}
		if (i<arr.length) {
			return i;
		}
		return INVALIDO;
	}

	public static int buscarFin(int [] arr, int inicio) {
		while (inicio<arr.length && arr[inicio]!=0) {
			inicio++;
		}
		return inicio-1; //Siempre va a haber un fin, lo retorna
	}

	public static int buscarInicioReversa(int [] arr, int i) {

		while (i>=0 && arr[i]==0) {
			i--;
		}
		
		return i; // Si se pasa de arreglo devuelve -1
	}

	public static int buscarFinReversa(int [] arr, int inicio) {
		while (inicio>=0 && arr[inicio]!=0) {
			inicio--;
		}
		return inicio+1; //Siempre va a haber un fin, lo retorna
	}


	public static int sumarSecuencia(int [] arr, int inicio, int fin) {
		int suma = 0;
		for (int i = inicio; i<=fin;i++) {
			suma+= arr[i];
		}
		return suma;
	}

	public static void mostrar_arreglo(int [] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void corr_der(int [] arr, int pos) {
		for (int i=MAX-1; i>pos;i--) {
			arr[i] = arr[i-1];
		}
	}

	public static int [] array_random_asc (int size, int limit) {
		int [] arr_asc = new int [size];
		int i = 1;
		int num = 0;
		int porcentaje = limit/size;
		arr_asc[0] = (int) (Math.random()*porcentaje);
		porcentaje +=100;

		while (i <size) {
			num = (int) (Math.random()*porcentaje);
			if (num > arr_asc[i-1]) {
				arr_asc[i] = num;
				i++;
				porcentaje += 100;
			}
		}
		return arr_asc;		
	}

	public static int [] array_random_desc (int size, int limit) {
		int [] arr_desc= new int [size];
		int i = 1;
		int num = 0;
		int porcentaje = (limit/size)*9;

		arr_desc[0] = (int) (porcentaje + Math.random()*100);
		porcentaje -=100;

		while (i <size) {
			num = (int) (porcentaje + Math.random()*100);
			if (num < arr_desc[i-1]) {
				arr_desc[i] = num;
				i++;
				porcentaje -= 100;
			}
		}
		return arr_desc;		
	}

	public static int pedirentero() {

		int entero = 0;
		boolean validar = false;

		while (validar == false)
			try { 
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				entero = new Integer (entrada.readLine());
				validar = true;
			} 
		catch (Exception exc) {
			System.out.println("Escriba un carácter válido, ingréselo nuevamente");
		}
		return entero;
	}
	public static int pedirnatural_menorA(int max) {

		int valor = 0;
		do {
			System.out.println("Ingrese un número menor a "+max);
			valor = pedirentero();
		}

		while (valor<0 || valor>=max);
		return valor;
	}

	public static int [] index_secuencia (int [] arr) {

		int inicio = 0;
		int fin = 0;
		boolean secuencia = false;
		int size = 0;
		int j = 0;


		int [] indexSecuencia = new int [MAX2];

		for (int i = 0; i<MAX2; i++) {
			if (arr[i] != 0) {
				secuencia = true;
				fin = i;
				inicio = i-size;
				size++;
			}
			else {
				if (secuencia == true)
					indexSecuencia[j] = inicio;
				j++;
				indexSecuencia[j] = fin;
				j++;
				size = 0;
				secuencia = false;
			}	
		}

		if (arr[MAX2-1] != 0) {
			indexSecuencia[j] = inicio;
			j++;
			indexSecuencia[j] = fin;
			j++;
		}
		return indexSecuencia;
	}



}
