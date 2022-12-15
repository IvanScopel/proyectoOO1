package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResumenEnvioTest {
 
	private ResumenEnvio resumenEnvio;
	


	@Test
	public void testConstructor() {
		this.resumenEnvio = new ResumenEnvio("unaDescripcion", 20.0);
		assertEquals(this.resumenEnvio.getDescripcion(), "unaDescripcion");
		assertEquals(this.resumenEnvio.getKilos(), 20.0);
	}

}
