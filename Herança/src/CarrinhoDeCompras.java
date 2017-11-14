import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private int totalDasCompras;
	private static HashMap<Produto, Integer> produtos;
	
	public CarrinhoDeCompras() {
		totalDasCompras = 0;
		produtos = new HashMap<Produto, Integer>();
	}
	
	
	public void adicionaProduto(Produto p, int quantidade) {
		if (produtos.containsKey(p)) {
			produtos.put(p, produtos.get(p) + quantidade);
		}
		else {
			produtos.put(p, quantidade);
		}
	}
	
	public void removeProduto(Produto p, int quantidade) {
		if(produtos.containsKey(p)) {
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
		totalDasCompras = total;
		return totalDasCompras;
	}
	
	public int totalProdutosDiferentes() {
		return produtos.size();
	}
	
	public int totalItens() {
		int totalItens = 0;
		for(Map.Entry<Produto, Integer> entry:produtos.entrySet()) {
			Integer value = entry.getValue();
			totalItens = totalItens + value;
		}
		return totalItens;
	}
}

