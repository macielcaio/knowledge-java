package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		String x = "Leo".toUpperCase();
		System.out.println(s);
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
				
		//Tipos primitivos n�o tem o operador ponto
		int a = 3;
		// a.toUpperCase(); // N�o � possivel usar o operador "." neste tiops de linha, pois INT � primitivo
		System.out.println(a);
	}

}
