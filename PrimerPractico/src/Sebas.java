


	//En la opcion b, yo tomé como que era el promedio entre los dos valores.
	//Tambien podría haber sido el promedio entre todos los valores entre los dos ingresados.
	 //En la opcion d, tomé como que había de decir si los números ingresados eran o no multiplos
	//de 4.
	 //Son las dos opciones que podían tener distintos puntos de vista.
	
	 import java.io.BufferedReader;
	 import java.io.InputStreamReader;
	
	 public class Sebas {
		
		public static void main(String[] args){
			
			char opcion=' ';
			
			int num1=0;
			
			int num2=0;
			
			opcion=obtenerOpcionValida();
			
			System.out.print("Ingrese el primer valor: ");
			
			num2=obtenerNaturalValido(0);
			
			System.out.print("Ingrese el segundo valor: ");
			
			num1=obtenerNaturalValido(num2);
			
			resolver(opcion,num1,num2);
			
		}
		
		
		public static char obtenerOpcionValida(){
			
			char op=' ';
			
			boolean validada=false;
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			while(!validada){
			
				System.out.println("Ingrese una de las siguientes opciones para resolver...");
				
				System.out.println("a: mostrar todos los números entre dos valores dados.");
				
				System.out.println("b: mostrar el promedio entre dos valores dados.");
				
				System.out.println("c: mostrar los números pares entre dos valores dados.");
				
				System.out.println("d: mostrar si los valores dados son multiplos de 4.");
				
				try{
				
					op=(char)(entrada.readLine().charAt(0));
				
					if(op=='a'|| op=='b' || op=='c' || op=='d')
				
						validada=true;
				
				}
				
				catch(Exception exc){
				
					System.out.print("Opncion Ingresa invalida");
				
				}
				
			}
			
			return op;
			
		}
		
		
		public static int obtenerNaturalValido(int a){
		
			int valor=0;
		
			boolean validada=false;
		
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
			while(!validada){
		
				try{
		
					System.out.print("\nIngrese una valor natural que sea mayor que " +a+ " :");
		
					valor=new Integer(entrada.readLine());
					
					if(valor>a)
					
						validada=true;
					
				}
				
				catch(Exception exc){
				
					System.out.print("Ingreso invalido");
				
				}
				
			}
			
			return valor;
			
		}	
	public static void resolver(char op, int v1, int v2){
		double prom=0;
		if(op=='a')
			for(int i=v2;i<=v1;i++)
				System.out.print(i+ " ");
		else
			if(op=='b'){
				prom=(double)(v1+v2)/2;
				System.out.print("El promedio entre " +v1+" y " +v2+" es "+prom);
			}
			else
				if(op=='c')
					for(int i=v2;i<=v1;i++){
						if(i%2==0)
							System.out.print(i+ " ");
					}
				else{
					if(v1%4==0)
						System.out.println("El numero " +v1+" es multiplo de 4");
								else
									System.out.println("El numero " +v1+" no es multiplo de 4");
											if(v2%4==0)
												System.out.println("El numero " +v2+" es multiplo de 4");
														else
															System.out.println("El numero " +v2+" no es multiplo de 4");

				}
	}
	 }
	
	
																	
														
											
								
