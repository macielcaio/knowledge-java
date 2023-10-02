package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String primeiroSalario = salario.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salario: ");
		String segundoSalario = salario.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario: ");
		String terceiroSalario = salario.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(primeiroSalario);
		double sal2 = Double.parseDouble(segundoSalario);
		double sal3 = Double.parseDouble(terceiroSalario);
		
		double calculoTotal = (sal1 + sal2 + sal3) / 3;
		System.out.printf(("Somando os salários a média total é de: %.2f"), calculoTotal);
		
		salario.close();
	}

}
