import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejloiza{

    
    final static int veces=2;

	public static void main(String[] args) {
		int N=numerovalido();
        int MAX=N;
        int MIN=N;
        int i=1;
        int cant=1;
        int N2=0;
        int suma=N;

        if (N%7==0){
            while (i<=veces){
                N2=pedirentero();
                if (N2>MAX){
                    MAX=N2;
                }
                if (N2<MIN){
                    MIN=N2;
                }
                suma+=N2;
                cant++;
                i++;
            }

        }
        System.out.println("La cantidad de numeros ingresados es: "+cant+", la suma es "+suma+" el promedio es: "+(float) suma/cant);

        if (cant==1){
            System.out.println("el minimo y el maximo es el numero: "+N);
        }
        else {
            System.out.println("el maximo es: "+MAX);
            System.out.println("el minimo es: "+MIN);
        }
    }


public static int numerovalido() {
    int numval=0;
    boolean validar=false;

    while(validar==false){
        numval=pedirentero();

        if(numval>0){
            validar=true;
        }
    }
    return numval;
}

public static int pedirentero() {

	int entero = 0;
	boolean validar = false;

	while (validar == false)
		try { 
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero");
			entero = new Integer (entrada.readLine());
			validar = true;
		} 
	catch (Exception exc) {
		System.out.println("Error al ingesar el valor, ingreselo nuevamente");
	}
	return entero;
}

}