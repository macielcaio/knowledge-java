package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o homo plata");
		case "marrom":
			System.out.println("Sei fazer o arm lock");
		case "roxa":
			System.out.println("Sei fazer o mata leão");
		case "azul":
			System.out.println("Sei fazer a americana");
			break;
//		default:
//			System.out.println("Fazer nada");
		
		}
		
		System.out.println("Fim!!");
	}
}
