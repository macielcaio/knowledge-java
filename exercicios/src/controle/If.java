package controle;

import java.util.Scanner;

public class If {
	 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = entrada.nextDouble();
		
		boolean criterioAprovacao = media <= 10 && media >= 7.0;
		if(criterioAprovacao) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
			}
		
		boolean criterioRecu = media < 7 && media >= 4.5;
		if(criterioRecu){
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao){
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
