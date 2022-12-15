package models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DonacionTest {
	
	Donacion donacion;
	LocalDate fecha;
	
	@BeforeEach
	public void setup() {
		donacion=new Donacion("estado", fecha, null/*descripcion*/);
	}
	
	@Test
	public void testSetEstado() {
		donacion.cambiarEstado("mi estado nuevo");
		assertEquals(donacion.getEstado(), "mi estado nuevo");
	}
	
	@Test
	public void testCambiarEstado() {
		
	}

}
