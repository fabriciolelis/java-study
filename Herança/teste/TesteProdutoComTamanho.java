

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {
	ProdutoComTamanho  p1, p2, p3, p4;
	
	@Before
	public void inicializa() {
		p1 = new ProdutoComTamanho("camisa", 1, 12, "M");
		p2 = new ProdutoComTamanho("calça", 2, 12, "P");
		p3 = new ProdutoComTamanho("camisa", 1, 20, "M");
		p4 = new ProdutoComTamanho("camisa", 1, 20, "G");
	}
	

	@Test
	public void testCriaUmProduto() {
		assertEquals("camisa", p1.getNome());
		assertEquals(1, p1.getCodigo());
		assertEquals(12, p1.getPreço());
	}
	
	@Test
	public void testProdutosIguais() {
		assertTrue(p1.equals(p3));
	}
	
	@Test
	public void testProdutosDiferentes() {
		assertFalse(p1.equals(p2));
	}
	
	@Test
	public void testProdutosDiferentesComMesmoCodigo() {
		assertFalse(p1.equals(p4));
	}

}
