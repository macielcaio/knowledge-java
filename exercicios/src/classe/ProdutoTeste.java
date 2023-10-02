package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {

		//Criando produto com construtor da forma padrão
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		Produto.desconto = 0.50;
		
		//Criando produto com construtor completo 
		var p2 = new Produto("Caneta preta", 12.50);

		//Imprimindo valores e detalhes dos produtos com variaveis que foram definidas
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaDoCarrinho = precoFinal + precoFinal2;
		System.out.printf("\nO preço final do produto " + p1.nome + ", com desconto é %.2f", precoFinal);
		System.out.printf("\nO preço final do produto " + p2.nome + ", com desconto é %.2f", precoFinal2);
		System.out.printf("\nO preço final do carrinho é de %.2f", mediaDoCarrinho);
		
	}
}
