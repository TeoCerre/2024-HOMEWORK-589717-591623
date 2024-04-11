package diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LabirintoTest {
	Labirinto l=new Labirinto();
	Stanza biblioteca=new Stanza("biblioteca");
	Stanza atrio=new Stanza("atrio");
	@Test
	public void testGetStanzaVincente() {
		l.creaStanze();
		assertEquals("Biblioteca", l.getStanzaVincente().getNome());
	}
	@Test
	public void testGetStanzaCorrente() {
		l.creaStanze();
		assertEquals("Atrio", l.getStanzaCorrente().getNome());
	}
	@Test
	public void testSetStanzaCorrente() {
		l.setStanzaCorrente(atrio);
		assertEquals(atrio, l.getStanzaCorrente());
	}

}
