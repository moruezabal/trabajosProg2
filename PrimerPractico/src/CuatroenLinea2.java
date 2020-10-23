import java.util.Scanner;

public class CuatroenLinea2 {

	public static void main(String[] args) {

		System.out.println("¡Bienvenido al juego '4 en línea'!\n");
		System.out.println("Ingrese las medidas del tablero:\n");
		int longM = ingreseEnteroValido();
		int longN = ingreseEnteroValido();

		char [] [] tablero = new char [longM] [longN];
		char ficha = ' ';
		int cantJugadas = 0;
		int posColumna = 0;
		int posFila = 0;
		int modoJuego = 0;
		boolean tableroLleno = false;
		boolean hayGanador = false;

		cargar_matriz(tablero,'-');
		modoJuego = elegirModoJuego();
		System.out.println("Que comience el juego!\n");
		imprimir_indices(longN);
		imprimir_matriz(tablero);
		System.out.println("");

		while (!hayGanador && !tableroLleno) {

			ficha = fichaSeleccionada(cantJugadas);
			posColumna = obtener_posColumna(tablero,modoJuego,ficha, longN);
			posFila = insertarFicha(tablero, posColumna, ficha, longM);
			hayGanador = esGanador(tablero, posFila, posColumna,ficha, longN, longM);
			cantJugadas++;
			tableroLleno = esTableroLleno(cantJugadas, longN, longM);
			imprimir_indices(longN);
			imprimir_matriz(tablero);
			System.out.println("");
		}

		if(hayGanador) {
			System.out.println("¡4 en Linea! han ganado las fichas "+ficha);
		}
		else {
			System.out.println("¡Empate! Se ha completado el tablero sin un ganador");
		}
	}

	public static int ingreseEnteroValido(){

		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean valor = false;

		while(!valor){
			try{
				System.out.println("Ingrese un numero entre 4 y 20");
				num = scan.nextInt();
				if(num<4 || num>20){
					System.out.println("No ha ingresado un numero correcto");
				}else{
					valor = true;
				}
			}
			catch(Exception e){
				System.out.println("Valor ingresado incorrecto");
			}
		}
		return num;
	}

	public static int enterovalido(){

		int valor = 0;
		boolean obtenerEntero = false;
		Scanner scan;
		while (!obtenerEntero){
			try{
				System.out.println("Ingese numero entero valido");
				scan = new Scanner(System.in);
				valor = scan.nextInt();
				obtenerEntero = true;
			}catch(Exception e){
				System.out.println("Valor ingresado invalido");
			}
		}
		return valor;
	}

	private static void imprimir_indices(int longN) {
		for (int i=0;i<longN;i++) {
			System.out.print(" "+i);
		}
		System.out.println("");
	}

	private static int elegirModoJuego() {
		int modo = 0;
		while (modo<1 || modo>2) {
			System.out.println("Elija el modo de juego");
			System.out.println("Opción 1: J1 vs J2\nOpción 2: J1 vs PC\n" );
			modo = pedirEntero();
		}
		return modo;
	}

	public static void imprimir_matriz (char [] [] mat) {
		for ( int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}

	public static void cargar_matriz ( char [] [] mat, char caracter) {
		for (int i = 0; i<mat.length ;i++) {
			for (int j = 0; j<mat[i].length;j++) {
				mat [i] [j] = caracter;
			}
		}
	}

	public static char fichaSeleccionada (int cantJugadas){
		char color = ' ';
		if (cantJugadas %2 == 0) {
			color = 'X';
		}else {
			color = '0';
		}
		return color;
	}

	public static int insertarFicha (char [][] tablero, int posColumna, char ficha, int longM) {
		int i = longM-1;
		while(tablero[i][posColumna] != '-') {
			i--;			
		}
		tablero [i][posColumna] = ficha;
		return i;
	}

	public static int obtener_posColumna (char [][] tablero, int modo, char ficha, int longN) {
		int pos = 0;
		if (modo==2 && ficha=='0'){
			pos = (int)(Math.random()*longN);
			System.out.println("La máquina ha jugado su turno: (columna "+pos+")\n");
			while (tablero[0][pos] != '-') {
				System.out.println("La columna está llena, por favor seleccione otra.\n");
				pos = (int)(Math.random()*longN);
				System.out.println("La máquina ha jugado su turno: (columna "+pos+")\n");
			}
		}else {
			pos = pedirColumna(tablero, longN);
			while (tablero[0][pos] != '-') {
				System.out.println("La columna está llena, por favor seleccione otra.");
				pos = pedirColumna(tablero, longN);
			}
		}
		return pos;
	}

	public static int pedirColumna(char[][] tablero, int longN) {
		int valor = longN+1;
		while (valor<0 || valor>=longN) {
			System.out.println("Seleccione la columna donde ingresará la ficha (Entre 0 y "+(longN-1)+")");
			valor = pedirEntero();
		}
		return valor;
	}

	public static int pedirEntero() {
		int entero = 0;
		boolean validar = false;
		Scanner scan = new Scanner(System.in);

		while (validar == false){
			try { 
				entero = scan.nextInt();          
				validar = true;
			} 
			catch (Exception exc) {
				System.out.println("Escriba un carácter válido, ingréselo nuevamente");
			}
		}
		return entero;
	}

	public static boolean esTableroLleno(int cantJugadas, int longN, int longM) {

		return (cantJugadas == longM*longN);
	}

	public static boolean esGanador (char [][] tablero, int posFila, int posColumna, char color, int longN, int longM) {

		return (buscar4enLinea(tablero, posFila, posColumna, color, longM, longN, 0, 1) || // Busc. Vertical
				buscar4enLinea(tablero, posFila, posColumna, color, longM, longN, 1,-1) || // Busc. DiagDescY
				buscar4enLinea(tablero, posFila, posColumna, color, longM, longN, 1, 0) || // Busc. Horizontal
				buscar4enLinea(tablero, posFila, posColumna, color, longM, longN, 1, 1));  // Busc. DiagAscY
	}

	private static boolean buscar4enLinea (char[][] tablero, int posFila, int posColumna, char color, int M, int N, int dirX, int dirY) {		
		int contador = 0;
		int columna = posColumna;
		int fila = posFila;

		while((columna<N && columna >=0) && (fila<M && fila >= 0) && (tablero[fila][columna] == color)) {
			contador++;
			fila+=dirY;
			columna+=dirX;	
		}

		if (contador<4) {

			columna = posColumna+(-dirX);
			fila = posFila+(-dirY);
			while((columna<N && columna >=0) && (fila<M && fila >= 0) && (tablero[fila][columna] == color)) {
				contador++;
				fila+=(-dirY);
				columna+=(-dirX);	
			}		
		}
		return (contador >= 4);	
	}
}