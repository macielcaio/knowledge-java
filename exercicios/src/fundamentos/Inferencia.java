package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
//		não é possivel, pois o java ja definiu que a variavel A é double
//		a = ".....";
//		System.out.println(a)
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);		
		
//		não é possivel, pois o java ja definiu que a variavel C é texto
//		c = 4.5;
//		System.out.println(c);	
		
		double d; // variavel declarada
		d = 123.456; // variavel inicializada
		System.out.println(d); // variavel usada
		
//		não é possivel, posi quando é usar o VAR, 
//		é necessário ja inicializar par aque o java entenda qual tipo da variavel
//		var e;
//		e = 123.456; 
//		System.out.println(e); 

		var e = 123.456; // variavel declarada e inicializada
		System.out.println(e); // variavel usada com sucesso
		
		var f = 4; // variavel declarada
//		f = 12.1; // impossivel, pois o tipo da variavel foi declarado como inteiro
		System.out.println(f);
		
	}
}
