package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		//Fazendo cast
		float b = (float) 1.12345; // conversão explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
