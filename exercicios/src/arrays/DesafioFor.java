package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioFor {

	
	public static void main(String[] args) {
		//Pega a quantidades de alunos e notas
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos at� 6: ");
		int qtdAluno = entrada.nextInt();
		//Cria array com a quantidade definida
		double notasAlunos [] = new double [qtdAluno];
		//imprime a quantidade de indices sem valoes
		System.out.println(Arrays.toString(notasAlunos));
		
		//Atribui o valor a cada indice de acordo com o numero de indices
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": "); //informa qual nota est� sendo inserida
			notasAlunos[i] = entrada.nextDouble(); //cada linha ser� inserida uma nota, at� a qunatida de alunos que foi setada
		}
		//Imprime os indices com cada valor que foi definido para cada qual
		System.out.println(Arrays.toString(notasAlunos));
		//soma todos os indices e calcula m�dia
		double total = 0;
		for(double notas: notasAlunos ) {
			total += notas;
		}
		double media = total / notasAlunos.length;
		//Imprime os indices em forma de m�dia
		System.out.println("A m�dia �: " + media);
		entrada.close();
	}
}
