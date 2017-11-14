import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {

	Autoridade a1, a2, a3, a4;
	
	@Before
	public void inicializa() {
		a1 = new Autoridade("Fabricio", "Lelis", new ComTitulo("Mestre"));
		a2 = new Autoridade("Fabricio", "Lelis", new Informal());
		a3 = new Autoridade("Fabricio", "Lelis", new Respeitoso("m"));
		a4 = new Autoridade("Solange", "Lelis", new Respeitoso("f"));
	}
	
	@Test
	public void testFormatarNome() {
		assertTrue(a1.getTratamento().equals("Mestre Fabricio Lelis"));
		assertTrue(a2.getTratamento().equals("Fabricio"));
		assertTrue(a3.getTratamento().equals("Sr. Fabricio Lelis"));
		assertTrue(a4.getTratamento().equals("Sra. Solange Lelis"));
	}
}

