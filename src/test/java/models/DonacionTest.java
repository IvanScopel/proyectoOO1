package models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DonacionTest {
	
	private Donacion donacion;
	private LocalDate fecha;
	
	@BeforeEach
	public void setup() {
		donacion=new Donacion("estado", fecha, null/*descripcion*/);
	}
	
	@Test
	public void testCambiarEstado() {
		assertNotEquals(this.donacion.getEstado(), "estado nuevo");
		donacion.cambiarEstado("estado nuevo");
		assertEquals(donacion.getEstado(), "estado nuevo");
	}

}
