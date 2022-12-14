package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResumenEnvioTest {
 
	private ResumenEnvio resumenEnvio;
	
	@BeforeEach
	public void setUp() {
		resumenEnvio= new ResumenEnvio("papeles", 11.0);
	}
	@Test
	public void testGetKilos() {
		assertEquals(resumenEnvio.getKilos(), 11.0);
	}

}
