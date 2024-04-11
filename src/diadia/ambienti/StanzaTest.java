package diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import diadia.attrezzi.Attrezzo;

class StanzaTest {
	Stanza s1=new Stanza("s1");
	Stanza s2=new Stanza("s2");
	Attrezzo s=new Attrezzo("spada",10);
	@Test
	public void testImpostaStanzaAdiacente() {
		s1.impostaStanzaAdiacente("sud",s2);
		assertEquals(s2,s1.getStanzaAdiacente("sud"));
	}
	@Test
	public void testGetStanzaAdiacente() {
		assertNull(s1.getStanzaAdiacente("sud"));
	}
	@Test
	public void testAddAttrezzo() {
		assertTrue(s1.addAttrezzo(s));
	}
}
