package testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testCriaUmProduto() {
		Produto p = new Produto("camisa", 1, 12);
		assertEquals("camisa", p.getNome());
		assertEquals(1, p.getCodigo());
		assertEquals(12, p.getPreço());
	}

}
