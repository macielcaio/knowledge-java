package controle;

import java.util.Scanner;

public class DesafioIf {

		public static void main(String[] args) {
			
			Scanner media = new Scanner(System.in);
			System.out.println("Insira a m�dai do aluno");
			double nota = media.nextDouble();
	
			//C�digo abaixo com erro, n�o usar o PONTO&VIRGULA em estruturas de controle
			if(nota >= 9.0)
				
				;
			
			{
				System.out.println("Quadro de Honra");
				System.out.println("Voc� � fera");
				
			}
			media.close();
		}
}
