

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {
	Produto  p1, p2, p3;
	
	@Before
	public void inicializa() {
		p1 = new Produto("camisa", 1, 12);
		p2 = new Produto("camisa", 2, 12);
		p3 = new Produto("cal�a", 1, 20);
	}


	@Test
	public void testCriaUmProduto() {
		assertEquals("camisa", p1.getNome());
		assertEquals(1, p1.getCodigo());
		assertEquals(12, p1.getPre�o());
	}
	
	@Test
	public void testProdutosIguais() {
		assertTrue(p1.equals(p3));
	}
	
	@Test
	public void testProdutosDiferentes() {
		assertFalse(p1.equals(p2));
	}

}
