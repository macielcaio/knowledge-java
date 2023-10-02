package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		// || barras duplas significam a condição de OU
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		} else if(nota >= 8.1) {
			System.out.println("Conceito A");
			System.out.println("Parabéns");
		} else if (nota >= 6.1) {
				System.out.println("Conceito B");
				System.out.println("Continue tentando!");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
			System.out.println("Precisa melhorar");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D");
			System.out.println("Volte aos estudos");
		}else {
			System.out.println("Conceito E");
			System.out.println("Infelizmente você está inapto");
		}
		
		System.out.println("Fim!");
		entrada.close();
	}
}
