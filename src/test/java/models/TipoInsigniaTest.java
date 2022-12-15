package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TipoInsigniaTest {

	private TipoInsignia tipoInisgnia;
	
	@Test
	public void testConstructor() {
		this.tipoInisgnia = new TipoInsignia("nuevo tipoInsignia");
		assertEquals(this.tipoInisgnia.getNombre(), "nuevo tipoInsignia");
	}

}
