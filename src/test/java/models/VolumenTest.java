package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VolumenTest {
	
	private Volumen volumen, volumenTest;
	
	@BeforeEach
	public void setUp() {
		volumen=new Volumen(2.0, 4.0, 5.0);
	}
	
	@Test
	public void testConstructor() {
		this.volumenTest = new Volumen(2.0, 3.0, 4.0);
		assertEquals(this.volumenTest.getX(), 2.0);
		assertEquals(this.volumenTest.getY(), 3.0);
		assertEquals(this.volumenTest.getZ(), 4.0);
		this.volumenTest = new Volumen(4.0, 5.0, 6.0);
		assertEquals(this.volumenTest.getX(), 4.0);
		assertEquals(this.volumenTest.getY(), 5.0);
		assertEquals(this.volumenTest.getZ(), 6.0);
		
	}
	@Test
	public void testGetVolumen() {
		assertEquals(volumen.getVolumen(), 40);
	}

}
