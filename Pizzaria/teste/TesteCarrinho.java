import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinho {
	CarrinhoCompras c;
	Pizza pizza1, pizza2, pizza3, pizza4;
	
	@Before
	public void inicializa() {
		c = new CarrinhoCompras();
		
		pizza1 = new Pizza();
		pizza1.adicionaIngrediente("camarão");
		
		pizza2 = new Pizza();
		pizza2.adicionaIngrediente("camarão");
		pizza2.adicionaIngrediente("queijo");
		pizza2.adicionaIngrediente("tomate");
		pizza2.adicionaIngrediente("carne de sol");
		pizza2.adicionaIngrediente("catupiry");
		pizza2.adicionaIngrediente("cogumelo");
		
		pizza3 = new Pizza();
		pizza3.adicionaIngrediente("camarão");
		pizza3.adicionaIngrediente("queijo");
		pizza3.adicionaIngrediente("tomate");
		
		pizza4 = new Pizza();
	}

	@Test
	public void testUmaPizza() {
		c.adiciona(pizza2);
		assertEquals(23,c.getTotal());
		
	}
	
	@Test
	public void testDuasPizza() {
		c.adiciona(pizza2);
		c.adiciona(pizza1);
		assertEquals(38,c.getTotal());
	}
}
