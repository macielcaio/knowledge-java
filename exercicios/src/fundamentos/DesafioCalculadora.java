package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double value1 = entrada.nextDouble();
		System.out.println("Informe o operador: ");
		String operador = entrada.next();
		System.out.println("Informe o segundo valor: ");
		double value2 = entrada.nextDouble();

		
		
		//Lógica da calculadora
		double resultado = "+".equals(operador) ? value1 + value2 : 0;
		resultado  = "-".equals(operador) ? value1 - value2 : resultado;
		resultado  = "*".equals(operador) ? value1 * value2 : resultado;
		resultado  = "/".equals(operador) ? value1 / value2 : resultado;
		resultado  = "%".equals(operador) ? value1 % value2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", value1, operador, value2, resultado);
		
		entrada.close();
	}
}
