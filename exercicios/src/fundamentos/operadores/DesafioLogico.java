package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {
	
	public static void main(String[] args) {
		//Respostas
		boolean falso = false;
		boolean verdadeiro = true;
		//Condi��es
		boolean nenhum = verdadeiro && falso;
		boolean Pedro = verdadeiro ^ falso;
		boolean Cristovao = !verdadeiro;
		
		System.out.println("Quem descobriu o Brasil? Foi Pedro e Cristov�o!\n" + nenhum);
		System.out.println("Quem descobriu o Brasil? Foi Pedro\n" + Pedro);
		System.out.println("Quem descobriu o Brasil? Foi Cristovao\n" + Cristovao);
				
	}

}
