package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DescripcionGeneralTest {

	private DescripcionGeneral descripcionGeneral;
	private Volumen volumen;
	
	@BeforeEach
	public void setUp() {
		this.volumen = new Volumen(4,5,6);
		this.descripcionGeneral = new DescripcionGeneral(volumen, "caracteristicas");
	}
	
	@Test
	public void testConstructor() {
		assertEquals(this.descripcionGeneral.getCaracteristicas(), "caracteristicas");
		assertEquals(this.descripcionGeneral.getVolumen(), this.volumen);
	}
	
	
}
