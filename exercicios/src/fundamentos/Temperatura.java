package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// formula do cálculo (F -32) * 5/9 = c
		double fahreinheit  = 90;
		final double AJUSTE = 32;
		final double MULTIPLICADOR =  5/9.0;
		double resultado = (fahreinheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("Temperatura em Celsius é: " + resultado);
		
		fahreinheit  = 55;
		resultado = (fahreinheit - AJUSTE) * MULTIPLICADOR;
		System.out.println("Temperatura em Celsius é: " + resultado);
	}

}
