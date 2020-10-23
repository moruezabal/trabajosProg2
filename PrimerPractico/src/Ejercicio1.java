import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Ejercicio1 {

	public static void main(String[] args) {
		
	}
		
	public static void ResolverEj2017() {
		
		final int MAX = 50;
        float val1 = 0.0f;
        float val2 = 0.0f;
        char opcion = ' ';

        for (int i = 0; i < MAX; i++) {
            val1 = pedirfloat();
            val2 = pedirfloat();
            opcion = opcion();
            if(opcion == 'c'){
                if(val1==1){
                    System.out.println("No se puede dividir por cero, ingrese otro Valor 1");
                    val1 = pedirfloat();
                }
                System.out.println(val2-val1/val1-1);
            }
            if(opcion == 'b'){
                System.out.println(val1*val2);
            }
            if(opcion == 'a'){
                System.out.println("Fin del programa");
                i=MAX;
            }
        }	

	}

	public static int pedirenteropositivo(){
		int entero =-1;
		while (entero<0){
			entero = pedirentero();
		}
		return entero;
	}
	
	public static boolean validar(){
	char a = 'a';
	char b = 'b';
	
	return (a<b);
	
	}

	public static void resolverparcial(){

		int num = 0;
		int mayor = -1;
		int sum = 0;
		int contador = 0;
		final int max = 5;

		for (int i=0;i<max;){
			num = pedirentero();
			if (num > mayor){
				if (num%7 == 0 || num%2 !=0){
					contador++;
				}
				sum+= num;
				mayor = num;
				i++;
			} 
		}
		double promedio = sum/max;
		System.out.println("El promedio de los "+max+" números ingresados es "+promedio+ " y la cantidad de impares o múltiplos de 7 es "+contador);
	}
			
	public static void resolverejparcial() {
		int N = 0;
		int N2 = 0;
		int min = 0;
		int max = 0;
		double promedio = 0.0;
		int suma = 0;
		int cant = 1; // Cantidad de numeros a promediar

		N = pedirenteropositivo();
		min = N;
		max = N;
		suma = N;
		if (N%7==0){
			for (int i=0;i<4;i++){
				N2=pedirenteropositivo();
				if (N2<min){
					min=N2;
				}
				if (N2>max){
					max=N2;
				}
				suma+=N2;
				cant ++;
			}
		} 
		promedio = suma/cant;
		System.out.println("El menor de los números ingresados es: "+min+", el mayor de los números es: "+max+" y el promedio de los números ingresados es: "+promedio);

	}


	public static int numerovalido(int max) {
		int valor = 0;
		do {
			valor = pedirentero();
		}

		while (valor>max);
		return valor;
	}

	public static char opcion() {
		char letra = 'z';
		do {
			letra = pedirchar();
		} 
		while (letra!='a' && letra!='b' && letra!='c');
		return letra;

	}


	public static void PromAltura() {
		int cant = 0;
		double altura = 0.0;
		int person = 0;

		try { 
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese la cantidad de personas a medir:");
			cant = new Integer (entrada.readLine());
			for (int i=0; i<cant; i++) {
				person++;
				System.out.println("Ingrese la altura de la persona "+person);
				altura+= new Double (entrada.readLine());
			}
			System.out.println("La altura promedio de las "+person+" personas es de: "+(altura/cant));	

		} 
		catch (Exception exc) {
			System.out.println("Error al ingesar el valor");
		}

	}

	public static char pedirchar() {

		char letra = 'c';
		boolean validar = false;

		while (validar == false) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese una letra:");
				letra = (char) (entrada.readLine().charAt(0));
				validar = true;

			} catch (Exception exc) {
				System.out.println("Error al ingesar el valor,ingresalo nuevamente");

			}

		}
		return letra;

	}

	public static int pedirentero() {

		int entero = 0;
		boolean validar = false;

		while (validar == false)
			try { 
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un n�mero");
				entero = new Integer (entrada.readLine());
				validar = true;
			} 
		catch (Exception exc) {
			System.out.println("Error al ingesar el valor, ingr�selo nuevamente");
		}
		return entero;
	}
	
	public static float pedirfloat() {

		float decimal = 0.0f;
		boolean validar = false;

		while (validar == false)
			try { 
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un n�mero");
				decimal = new Float (entrada.readLine());
				validar = true;
			} 
		catch (Exception exc) {
			System.out.println("Error al ingesar el valor, ingr�selo nuevamente");
		}
		return decimal;
	}


	public static void enteromasdiez() {
		int numero =0;

		numero = (pedirentero()+10) ;
		System.out.println("El nuevo numero es = "+numero);

	}

	public static void resolverej15() {
		int num = 0;
		int sum = 0;
		int neg = 0;
		int mult = 0;

		for (int i=0;i<10;i++) {
			num = pedirentero();
			if (num<0) {
				neg++;
			}
			if (EsMultiplo(num,15)) {
				mult++;
			}
			if (EsMultiplo(num,2)) {
				sum= sum + num;
			}

		}
		System.out.println("En la lista ingresada hay "+neg+" números negativos, "+mult+" múltiplos de 15 y la suma de todos los números pares da un total de "+sum);
	}

	public static int sumar(int a, int b) {
		int total = a+b;
		System.out.println("El total de la suma es: "+total);
		return total;
	}

	public static boolean EsMultiplo(int num, int mult){
		if (num%mult ==0) {
			return true;
		}	else {
			return false;
		}
	}
	public static void resolveroperaciones(char opcion, int n, int m) {

		if (opcion=='a') {
			int suma = n+m;
			System.out.println("La suma entre los dos números es "+suma);
		}
		if (opcion=='b') {
			int resta= n-m;
			System.out.println("La resta entre los dos números es "+resta);
		}
	}

	public static void resolverejercicio16() {
		int max = 10;
		char opcion = opcion();
		int n = numerovalido(max);
		int m = numerovalido(max);
		resolveroperaciones(opcion,n,m);
	}


public static void resolverEj10(){

	int inicio = 0;
	int fin = 0;
	int size = 0;
	int j = 0;
	int cantSecuencia = 0;
	boolean secuencia = false;

	int [] arr = {7,2,10,1,9,10,2,8,0,8,0,0,2,1,10,0,1,10,2,8};
	int [] indexSecuencia = new int [20];

	for (int i = 0; i<arr.length; i++) {
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
			cantSecuencia ++;
			size = 0;
			secuencia = false;
		}	
	}

	if (arr[arr.length-1] != 0) {
		indexSecuencia[j] = inicio;
		j++;
		indexSecuencia[j] = fin;
		j++;
		cantSecuencia ++;
	}

	if (cantSecuencia>=2) {
		System.out.println("Anteúltima secuencia:");
		System.out.println("Inicio en "+indexSecuencia[j-4]);
		System.out.println("Fin en "+indexSecuencia[j-3]);
	}
	else {
		System.out.println("No hay suficientes secuencias");
	}


}

}