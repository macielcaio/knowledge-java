package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(07, 11, 2021);
		
		var d2 = new Data(1,7,1988);
		var d3 = new Data();
//		d2.dia = 31;
//		d2.mes = 12;
//		d2.ano = 2020;
		
//		System.out.println(d1.obterDataFormatada());
//		System.out.println(d2.obterDataFormatada());
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
	}
}
