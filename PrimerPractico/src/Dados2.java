import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dados2 {

	public static void main(String[] args) {

		final int tiradas=10000;
		final int MIN=1;
		final int MAX=4;
		int opElegida=0;
		int conta1=0;
		int conta2=0;
		int conta3=0;
		int conta4=0;
		int cantMayor=0;
		int dado;

		for(int i=0;i<tiradas;i++){
			dado=(int)(4*Math.random()+1);
			switch(dado){
			case 1:conta1++;break;
			case 2:conta2++;break;
			case 3:conta3++;break;
			case 4:conta4++;break;
			}
		}
		System.out.println("El dado se arrojó "+tiradas+" veces");

		cantMayor = obtenercantmayor(conta1,conta2,conta3,conta4);
		opElegida=numusuario(MIN,MAX);

		if(esCorrecto(opElegida,conta1,conta2,conta3,conta4,cantMayor)){
			System.out.println("¡Acertaste, felicitaciones! Salió unas "+cantMayor+" veces");
		}
		else{
			System.out.println("Le pifiaste perri");
		}

	}
	
	public static int numusuario(int a, int b) {
		int z=a-1;

		while(z<a || z>b){
			z=obtenerentero();
		}

		return z;
	}
	
	public static int obtenercantmayor(int num1, int num2, int num3,int num4) {
		int mayor = num1; 
		int valmax = 1;
		if (num2>=mayor) {
			mayor=num2;
			valmax = 2;
		} 
		if (num3>=mayor) {
			mayor=num3;
			valmax = 3;
		}
		if (num4>=mayor) {
			mayor=num4;
			valmax = 4;
		}
		return valmax;
	}
	
	public static boolean esCorrecto(int opcion, int num1, int num2, int num3, int num4, int mayor) {
		boolean correcto = false;

		switch(opcion){
		case 1: if (num1==mayor) {correcto=true;};break;
		case 2: if (num2==mayor) {correcto=true;};break;
		case 3: if (num3==mayor) {correcto=true;};break;
		case 4: if (num4==mayor) {correcto=true;};break;
		}

		return correcto;
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