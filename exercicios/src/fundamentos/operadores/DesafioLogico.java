package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {
	
	public static void main(String[] args) {
		//Respostas
		boolean falso = false;
		boolean verdadeiro = true;
		//Condições
		boolean nenhum = verdadeiro && falso;
		boolean Pedro = verdadeiro ^ falso;
		boolean Cristovao = !verdadeiro;
		
		System.out.println("Quem descobriu o Brasil? Foi Pedro e Cristovão!\n" + nenhum);
		System.out.println("Quem descobriu o Brasil? Foi Pedro\n" + Pedro);
		System.out.println("Quem descobriu o Brasil? Foi Cristovao\n" + Cristovao);
				
	}

}
