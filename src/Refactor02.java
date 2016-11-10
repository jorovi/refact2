/**
 * Ejemplo de código Extraer funcionalidad
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor02 {

	public static void main(String[] args) {
		//Tenemos los arrays de goles marcados por jugador y partido
		int[] jugador1={2,5,3,0,1};
		int[] jugador2={1,1,3,1,4};
		int[] jugador3={1,0,2,1,0};
		jugador(jugador1, jugador2, jugador3);
	}
	public static void jugador(int[] jugador1, int[] jugador2, int[] jugador3){
		//Calculamos la media geométrica para el primer jugador
		media(jugador1, "1");
		//Calculamos la media geométrica para el segundo jugador
		media(jugador2, "2");
		//Calculamos la media geométrica para el tercer jugador
		media(jugador3, "3");
	}

	public static void media(int[] jugador, String numero){
		int resultado=0;
		for(int i=0;i<jugador.length;i++)
		{
			resultado=resultado+jugador[i];
		}
		resultado=resultado/jugador.length;
		System.out.println("La media de goles del jugador "+numero+" es: "+resultado);
		resultado=0;
	}
	}
