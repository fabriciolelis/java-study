import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private static HashMap<Produto, Integer> produtos = new HashMap<Produto, Integer>();
	
	
	public void adicionaProduto(Produto p, int quantidade) {
		if (produtos.containsKey(p)) {
			produtos.put(p, produtos.get(p) + quantidade);
		}
		else {
			produtos.put(p, quantidade);
		}
	}
	
	public void removeProduto(Produto p, int quantidade) {
		System.out.println("Quantidade total de produtos " + produtos.size());
		if(produtos.containsKey(p)) {
			System.out.println("A quantidade do mesmo produto: " + p.getNome());
			if (produtos.get(p) == quantidade) {
				produtos.remove(p);
			}
			else {
				produtos.put(p, produtos.get(p) - quantidade);
			}
		}
	}
	
	public int totalCarrinho() {
		int total = 0;
		for(Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
			Integer value = entry.getValue();
			Produto p = entry.getKey();
			total = total + (value * p.getPreço());
		}
		
		return total;
	}
	
	public int totalProdutosDiferentes() {
		return produtos.size();
	}
	
	public int totalProdutos() {
		int totalProdutos = 0;
		for(Map.Entry<Produto, Integer> entry:produtos.entrySet()) {
			Integer value = entry.getValue();
			totalProdutos = totalProdutos + value;
		}
		return totalProdutos;
	}
}

