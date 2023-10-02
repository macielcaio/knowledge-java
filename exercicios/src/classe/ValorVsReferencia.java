package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;// atribuição por valor (tipo primitivo)
		
		a ++;
		b --;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6 , 2022);
		Data d2 = d1;// atribuição por referencia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		voltarDataParaValorPadrao(d1);
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
