public class Parcial {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		char opcion = ' ';
		
		opcion = opcionvalida();
		num1 = pedirnumnatural();
		num2 = pedirnumnatural();
		while (num2>=num1) {
			num2 = pedirnumnatural();
		}
		resolversegunopcion(opcion,num1,num2);
		
	}
	public static char opcionvalida() {
		char opuser = 'x';
		boolean validar = false;
		while(!validar) {
			opuser = Ejercicio1.pedirchar();
			if (opuser=='a'||opuser=='b'||opuser=='c'||opuser=='d') {
				validar = true;
			}
		}
		return opuser;
	}
	public static int pedirnumnatural() {
		int numero = 0;
		while (numero<=0) {
			numero = Ejercicio1.pedirentero();
		}
		return numero;	
	}
	public static void resolversegunopcion(char opcion, int num1, int num2) {
		double promedio = 0;
		int parimpreso = 0;
		
		if (opcion == 'a') {
			if (num1-num2!=1) {
				for (int i= num2+1; i<num1; i++) {
					num2++;
					System.out.println(num2);
				}
			}
			else {
				System.out.println("No hay números entre los dos ingresados");
			}
		}
		if (opcion == 'b') {
			promedio = (double)(num1+num2)/2;
			System.out.println(promedio);
		}
		if (opcion == 'c') {
			if (num1-num2!=1) {
				for (int i= num2+1; i<num1; i++) {
					num2++;
					if(num2%2 == 0) {
						System.out.println(num2);
						parimpreso++;	
					}
				} if (parimpreso == 0) {
					System.out.println("No hay números pares entre los dos ingresados");
				}
			}
			else {
				System.out.println("No hay números pares entre los dos ingresados");
			}	
		}
		if (opcion == 'd') {
			if((num1%4 == 0) && (num2%4 == 0)) {
				System.out.println("Ambos números son número de 4");
			}
			else {
				System.out.println("Algún o sendos números no son múltiplo de 4");
			}
		}
	}
}
