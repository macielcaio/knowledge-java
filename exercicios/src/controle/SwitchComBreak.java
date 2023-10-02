package controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		String conceito = "";
		//Inserção de valor pedido pelo sistema
		System.out.print("Informe a nota do Aluno: ");
		int nota = entrada.nextInt();
		
		//Lógica
		switch(nota){
		case 10: case 9:
			conceito = "A";
		break;
		case 8: case 7:
			conceito = "B";
		break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado";
		}
		System.out.println("Conceito de nota " + conceito);
		entrada.close();
	}
}
