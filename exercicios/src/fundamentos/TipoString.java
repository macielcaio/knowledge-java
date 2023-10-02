package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		//Converte original da sting em letras ma�usculas
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s);
		
		//Altera o valor original da string, adiciona esclama��es e verifica palavras dentro dela
		s = "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom"));
		//Altera o valor original da string oara letras minusculas e verifica palavras dentro dela
		System.out.println(s.toLowerCase().endsWith("dia"));
		//Verifica numero de diferentes caracteres
		System.out.println(s.length());
		//verifica se a palavra est� correta e ignora o tipo de caractere
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		//formas de imprimir variaveis sem gerar grande c�digo
		var nome =  "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 123.4567;
		
		//primeira forma
		String maisUmaFrase = ("Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade 
				+ "\nSal�rio: " + salario); 
		System.out.println(maisUmaFrase);
		//segunda forma mais resumida
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		//Colocando dentro de uma string
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		System.out.println(frase.substring(15, 34));
		
	}

}
