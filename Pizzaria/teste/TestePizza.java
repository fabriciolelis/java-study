import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	Pizza pizza;

	@Before
	public void inizializa() {
		pizza = new Pizza();
		Pizza.zeraIngredientes();
	}
	@Test
	public void testePizzaUmIngrediente() {
		pizza.adicionaIngrediente("camar�o");
		assertEquals(15, pizza.getPreco());
	}
	
	@Test
	public void testeUmIngrediente() {
		pizza.adicionaIngrediente("camar�o");
		assertEquals(1, pizza.getTotalIngredientes());
	}
	
	@Test
	public void testePizzaTresIngredientes() {
		pizza.adicionaIngrediente("camar�o");
		pizza.adicionaIngrediente("queijo");
		pizza.adicionaIngrediente("tomate");
		assertEquals(20, pizza.getPreco());
	}
	
	@Test
	public void testeTresIngredientes() {
		pizza.adicionaIngrediente("camar�o");
		pizza.adicionaIngrediente("queijo");
		pizza.adicionaIngrediente("tomate");
		assertEquals(3, pizza.getTotalIngredientes());
	}
	
	@Test
	public void testePizzaCincoIngredientes() {
		pizza.adicionaIngrediente("camar�o");
		pizza.adicionaIngrediente("queijo");
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("carne de sol");
		pizza.adicionaIngrediente("catupiry");
		pizza.adicionaIngrediente("cogumelo");
		assertEquals(23, pizza.getPreco());
	}
	
	@Test
	public void testeCincoIngredientes() {
		pizza.adicionaIngrediente("camar�o");
		pizza.adicionaIngrediente("queijo");
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("carne de sol");
		pizza.adicionaIngrediente("catupiry");
		pizza.adicionaIngrediente("cogumelo");
		assertEquals(6, pizza.getTotalIngredientes());
	}

}
