import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dados1 {

	public static void main(String[] args) {

		final int tiradas=9;
		final int MIN=1;
		final int MAX=4;
		int opElegida=0;
		int conta1=0;
		int conta2=0;
		int conta3=0;
		int conta4=0;
		int valmax=0;
		int cantMaxima=0;
		int dado;

		for(int i=0;i<tiradas;i++){
			dado=(int)(4*Math.random()+1);
			System.out.println(dado);
			switch(dado){
			case 1:conta1++;break;
			case 2:conta2++;break;
			case 3:conta3++;break;
			case 4:conta4++;break;
			}
		}
		System.out.println("El dado se arrojó "+tiradas+" veces");

		
		cantMaxima = conta1; 
		valmax = 1;
		
		if (conta2>=cantMaxima) {
			cantMaxima=conta2;
			valmax = 2;
		} 
		if (conta3>=cantMaxima) {
			cantMaxima=conta3;
			valmax = 3;
		}
		if (conta4>=cantMaxima) {
			cantMaxima=conta4;
			valmax = 4;
		}
		opElegida=numusuario(MIN,MAX);

		if(opElegida==valmax){
			System.out.println("¡Acertaste, felicitaciones!");
		}
		else{
			System.out.println("Incorrecto, el valor "+valmax+" fue el que más salió");
		}

	}
	public static int numusuario(int a, int b) {
		int z=a-1;

		while(z<a || z>b){
			z=obtenerentero();
		}

		return z;
	}
	public static int obtenerentero() {
		int num=0;
		boolean validar=false;
		while(validar==false){
			try{
				BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Qué número salió más veces?");
				num=new Integer(entrada.readLine());
				validar=true;
			}
			catch(Exception exc){
				System.out.println("error");
			}
		}
		return num;
	}

}