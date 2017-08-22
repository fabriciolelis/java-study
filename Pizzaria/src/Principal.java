
public class Principal {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		pizza1.adicionaIngrediente("queijo");
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("cebola");
		pizza1.adicionaIngrediente("azeitona");
		pizza1.adicionaIngrediente("bacon");
		
		pizza2.adicionaIngrediente("queijo");
		pizza2.adicionaIngrediente("camarão");
		pizza2.adicionaIngrediente("tomate");
		
		pizza3.adicionaIngrediente("queijo");
		pizza3.adicionaIngrediente("tomate");
		
		carrinho.adiciona(pizza1);
		carrinho.imprimeTotalCarrinho();
		
		carrinho.adiciona(pizza2);
		carrinho.imprimeTotalCarrinho();
		
		carrinho.adiciona(pizza3);
		carrinho.imprimeTotalCarrinho();
		
		Pizza.imprimeIngredientes();
	}

}
