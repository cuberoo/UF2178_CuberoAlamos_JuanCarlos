/**
 * 
 */

/**
 * @author juanc
 *
 */
public class Examen {

	public static void mostrar_imcs(double matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf(" %.2f ", matriz[i][j]);
			}
		System.out.println();
		}
	}
	
	public static double media_paciente(double matriz[][], int num) {
		double suma = 0, media;
		for(int i=0; i<matriz[num].length; i++) {
			suma += matriz[num][i];
		}
		media=suma/matriz[0].length;;
		return media;
	}
}
