package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double notasAlunoA [] = new double [4];
		System.out.println(Arrays.toString(notasAlunoA)); //imprime o valor de cada indice de array
		
		//define o valor de cada indice do array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		
		double totalAlunoA = 0;
		for(int  i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i]; //adiciona cada indice de array no total
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		
		double totalAlunoB = 0;
		double notasAlunoB [] = {6.9, 8.9, 5.5, 10}; //define o valor de cada indice do array
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i]; //adiciona cada indice de array no total
		}
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println(totalAlunoB / notasAlunoB.length); //calcula uma média formada com cada indice de array no total
	}

}
