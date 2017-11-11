import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {
	CarrinhoDeCompras c;
	Produto p1, p2;
	ProdutoComTamanho pct1;
	
	@Before
	public void inicializa() {
		c = new CarrinhoDeCompras();
		p1 = new Produto("Camisa", 1, 22);
		pct1 = new ProdutoComTamanho("Camisa", 1, 22, "M");
		p2 = new Produto("Camisa", 1, 22);
	}
	
	@Test
	public void TesteAdicionaProduto() {
		c.adicionaProduto(p1, 1);
		assertEquals(1, c.totalProdutosDiferentes());
		assertEquals(1,c.totalItens());
		c.adicionaProduto(pct1, 1);
		assertEquals(2, c.totalProdutosDiferentes());
		assertEquals(2, c.totalItens());
		c.adicionaProduto(p2, 3);
		assertEquals(2, c.totalProdutosDiferentes());
		assertEquals(5, c.totalItens());
		
	}
	
	@Test
	public void TesteRemoveProduto() {
		c.adicionaProduto(p1, 1);
		c.adicionaProduto(pct1, 1);
		c.adicionaProduto(p2, 3);
		c.removeProduto(p1, 1);
		assertEquals(2, c.totalProdutosDiferentes());
		assertEquals(4, c.totalItens());
	}
	
	@Test
	public void TesteValorTotalCarrinho() {
		c.adicionaProduto(p1, 1);
		assertEquals(22, c.totalCarrinho());
		c.adicionaProduto(pct1, 2);
		assertEquals(66, c.totalCarrinho());
		c.removeProduto(pct1, 1);
		assertEquals(44, c.totalCarrinho());
	}
}
