
public class CarrinhoCompras {
	public int total;

	public void adiciona(Pizza pizza) {
		if (pizza.quantIngredientes > 0) {
			total += pizza.getPreco();
		}
	}
	
	public void imprimeTotalCarrinho() {
		System.out.println("O total do carrinho: " + total);
	}
}
