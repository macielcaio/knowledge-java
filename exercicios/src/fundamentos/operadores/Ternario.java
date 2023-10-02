package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		Scanner media = new Scanner(System.in);
		
		System.out.print("Digite a nota final do Aluno:\n");
		// Recebe o valor da nota em formato STRING
		String nota = media.nextLine();
		// Converte o valor da nota em DOUBLE
		double notinha = Double.parseDouble(nota); 
		// As regras de NOTA são definidas
		String resultadoParcial = notinha >= 5.5 ? "Recuperação" : "Reprovado";
		
		String resultadoFinal = notinha >= 7.5 ? "Aprovado" : resultadoParcial;
		// Resultado final é impresso
		System.out.println("O aluno está: " + resultadoFinal);
		
		media.close();
	}
}
