package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //convers�o implicita
		System.out.println(a);
		//Fazendo cast
		float b = (float) 1.12345; // convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Convers�o explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
