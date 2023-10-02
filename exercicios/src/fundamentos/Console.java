package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.println("Bom");
		System.out.println("\nDia!!");

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
