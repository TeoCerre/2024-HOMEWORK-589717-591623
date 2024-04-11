package diadia.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiocatoreTest {
	Giocatore g=new Giocatore();
	@Test
	public void testGetCFU() {
		assertEquals(20,g.getCFU());
	}
	@Test
	public void testSetCFU() {
		g.setCFU(0);
		assertEquals(0,g.getCFU());
	}
	@Test
	public void testGetBorsaNotNull() {
		assertNotNull(g.getBorsa());
	}
	
	

}
