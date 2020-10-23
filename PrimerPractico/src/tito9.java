
public class tito9 {

	public static final int M = 4;
	public static final int N = 23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matriz={
				{' ','c','o','m','p','r','e',' ',' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ',},
				{' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ','c','o','m','p','r','e',' ',' ',},
				{'c','o','m','o',' ','c','o','m','p','r','e',' ','p','o','c','a','s',' ','c','o','p','a','s',},
				{' ','p','o','c','a','s',' ',' ','c','o','p','a','s',' ',' ','p','a','g','u','e',' ',' ',' ',}};


		char[]P={'c','o','m','p','r','e'};
		char[]R={'t','o','m','e'};
		imprimirMatriz(matriz);
		System.out.println("                 ");

		buscoYreemplazoSecuencia(matriz,P,R);
		imprimirMatriz(matriz);



	}
	public static void buscoYreemplazoSecuencia(char[][] mat,char[]p,char[]r){
		int inicio=0;
		int fin=-1;
		int rango_p=buscoRangoP(p);
		int rango_r=buscoRangoR(r);
		int diferencia=rango_p-rango_r;
		boolean comp=false;
		
		for(int fila=0;fila<M;fila++){			
			while(inicio<N){
				inicio=buscarInicio(mat[fila],fin+1);
				System.out.println(inicio);
				fin=buscarFin(mat[fila],inicio);
				if(fin-inicio+1==rango_p){
					for(int col=inicio;col<fin+1;col++){
						comp=comprobar(mat[fila],p,inicio,fin);
						if(comp){
							reemplazoPorR(mat[fila],p,r,inicio,fin);
						}
						
					}
					
				}
				fin=fin-diferencia;
			}
			inicio=0;
		}

	}

	public static void reemplazoPorR(char[]fila,char[]p,char[]r, int inicio,int fin){
		int ran_p=buscoRangoP(p);
		int ran_r=buscoRangoR(r);	
		if(ran_r<ran_p){
			for(int i=inicio;i<ran_r;i++){
				fila[i]=r[i];
				fila[ran_r+i]=' ';
			}
		}
		else{
			for(int i=inicio;i<=ran_r;i++){
				fila[i]=r[i];
			}
		}

	}

	public static boolean comprobar(char[]fila,char[]P,int inicio,int fin){
		int cant=0;
		int rango_p=buscoRangoP(P);
		boolean compruebo=false;
		for(int i=0;i<rango_p;i++){
			if(fila[inicio+i]==P[i]){
				cant++;
			}
		}
		if(rango_p==cant){
			compruebo=true;
		}
		return compruebo;
	}

	public static int buscoRangoP(char[]P){
		int rangoP=0;
		for(int i=0;i<P.length;i++){
			rangoP++;
		}
		return rangoP;
	}

	public static int buscoRangoR(char[]R){
		int rangoR=0;
		for(int i=0;i<R.length;i++){
			rangoR++;
		}
		return rangoR;
	}



	public static int buscarInicio(char[]fila,int inicio){
		while(inicio<N && fila[inicio]==' '){
			inicio++;
		}
		return inicio;	
	}

	public static int buscarFin(char[]fila,int inicio){
		while(inicio<N && fila[inicio]!=' '){
			inicio++;
		}
		return inicio-1;	
	}

	private static void imprimirMatriz (char[][] mat) {

		for ( int i = 0; i<M; i++) {
			for(int j = 0; j<N;j++) {
				System.out.print(" "+mat [i] [j]);
			}
			System.out.println("");
		}
	}

}

