import java.util.HashMap;
import java.util.Map;

public class Pizza {
	public int quantIngredientes = 0;
	private static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

	public void adicionaIngrediente(String ingrediente) {
		quantIngredientes++;
		contabilizaIngrediente(ingrediente);
	}
	
	public static void zeraIngredientes() {
		ingredientes.clear();
	}
	
	public int getTotalIngredientes() {
		return ingredientes.size();
	}
	
	public int getPreco() {
		int preco = 0;
		if(quantIngredientes <=2) {
			preco = 15;
			return preco;
		}
		else if(quantIngredientes >= 3 && quantIngredientes <= 5) {
			preco = 20;
			return preco;
		}
		else {
			preco = 23;
			return preco;
		}
	}
	
	public static void imprimeIngredientes() {
		for (Map.Entry<String, Integer> entry: ingredientes.entrySet()) {
			String key = entry.getKey().toString();
			Integer quantidade = entry.getValue();
			System.out.println("Ingrediente: "+ key + " Quantidades: " + quantidade);
		}
	}
	
	private static boolean contabilizaIngrediente(String ingrediente) {
		Integer quantidade = ingredientes.get(ingrediente);
		if (quantidade != null) {
			quantidade++;
			ingredientes.put(ingrediente, quantidade);
			return false;
		}
		else {
			ingredientes.put(ingrediente, 1);
			return true;
		}
	}
}
