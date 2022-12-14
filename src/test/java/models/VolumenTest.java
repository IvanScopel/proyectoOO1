package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VolumenTest {
	
	Volumen volumen;
	
	@BeforeEach
	public void setUp() {
		volumen=new Volumen(2.0, 4.0, 5.0);
	}
	@Test
	public void testGetVolumen() {
		assertEquals(volumen.getVolumen(), 40);
	}

}
