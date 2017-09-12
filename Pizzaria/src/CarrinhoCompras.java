
public class CarrinhoCompras {
	private int total = 0;

	public void adiciona(Pizza pizza) {
		if (pizza.quantIngredientes > 0) {
			total += pizza.getPreco();
		}
	}

	public void imprimeTotalCarrinho() {
		System.out.println("O total do carrinho: " + this.getTotal());
	}

	public int getTotal() {
		return total;
	}
}
