import java.io.BufferedReader;
import java.io.InputStreamReader;

public class asteriscos {
    
    public static void main(String[] args) {
        
    	int numero = pedirenteropositivo();
        dibujarescaleraasc(numero);
    }

    public static void dibujarescaleraasc(int altura){
        for (int nroasterisco=1; nroasterisco<=altura; nroasterisco++){
            
            for( int i=1; i<=nroasterisco;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
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
    
    public static int pedirenteropositivo(){
    	int entero=0;
    	boolean validar = false;
        while (validar ==false){
            entero = pedirentero();
            if (entero >0){
                validar =true;
            }
        }
        return entero;
    }
   
}