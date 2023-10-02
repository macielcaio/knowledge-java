package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do Desafio 
		//Não pode usar valor numero para controlar o laço!
		System.out.println("\nResultado do Desafio: ");
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);		
		}
	}
}