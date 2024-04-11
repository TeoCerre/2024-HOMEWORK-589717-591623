package diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import diadia.ambienti.Stanza;

class PartitaTest {
	Partita p = new Partita();
	Stanza s = new Stanza("Stanza");
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca",p.getLabirinto().getStanzaVincente().getNome());
	}
	@Test
	public void testSetStanzaCorrente() {
		p.getLabirinto().setStanzaCorrente(s);
		assertEquals(s,p.getLabirinto().getStanzaCorrente());
	}	
	@Test
	public void testIsNotFinita() {
		assertFalse(p.isFinita());
	}
	@Test
	public void testIsFinitaSenzaCfu() {
		p.getGiocatore().setCFU(0);
		assertTrue(p.isFinita());
	}
	@Test
	public void testIsFinitaVinta() {
		p.getLabirinto().setStanzaCorrente(p.getLabirinto().getStanzaVincente());
		assertTrue(p.isFinita());
	}

}
