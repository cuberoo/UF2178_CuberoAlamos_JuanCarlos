import java.util.Scanner;

/**
 * 
 */

/**
 * @author juanc
 *
 */
public class Ej1_CuberoAlamos_JuanCarlos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca su peso en kg: ");
		double peso = teclado.nextDouble();
		
		System.out.println("introduzca su altura en m: ");
		double altura = teclado.nextDouble();
		
		double IMC = peso/Math.pow(altura, 2);

		if(IMC<18.5) {  
			System.out.println("el paciente de " + peso + "kg y " + altura + "m de altura tiene un IMC de " + String.format("%.2f", IMC) + " y tiene un diagnóstico de bajo peso");
		}else if(IMC>18.5 && IMC<24.9) {
			System.out.println("el paciente de " + peso + "kg y " + altura + "m de altura tiene un IMC de " + String.format("%.2f", IMC) + " y tiene un diagnóstico de peso normal (saludable)");
		}else if(IMC>25 && IMC<29.9) {
			System.out.println("el paciente de " + peso + "kg y " + altura + "m de altura tiene un IMC de " + String.format("%.2f", IMC) + " y tiene un diagnóstico de sobrepeso");
		}else if(IMC>30 && IMC<40) {
			System.out.println("el paciente de " + peso + "kg y " + altura + "m de altura tiene un IMC de " + String.format("%.2f", IMC) + " y tiene un diagnóstico de obesidad premòrbida");
		}else if(IMC>40) {
			System.out.println("el paciente de " + peso + "kg y " + altura + "m de altura tiene un IMC de " + String.format("%.2f", IMC) + " y tiene un diagnóstico de obesidad mórbida");
		}
		
		
	}
}
