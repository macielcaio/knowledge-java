package controle;

import java.util.Scanner;

public class DesafioIf {

		public static void main(String[] args) {
			
			Scanner media = new Scanner(System.in);
			System.out.println("Insira a médai do aluno");
			double nota = media.nextDouble();
	
			//Código abaixo com erro, não usar o PONTO&VIRGULA em estruturas de controle
			if(nota >= 9.0)
				
				;
			
			{
				System.out.println("Quadro de Honra");
				System.out.println("Você é fera");
				
			}
			media.close();
		}
}
