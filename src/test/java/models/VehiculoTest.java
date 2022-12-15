package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	private Vehiculo vehiculo;
	private Volumen volumen;
	
	@Test
	public void testVehiculo() {
		this.volumen = new Volumen(1.0, 2.0, 3.0);
		this.vehiculo = new Vehiculo("Volkswagen", "Gol", "abc123", volumen);
		assertEquals(this.vehiculo.getMarca(), "Volkswagen");
		assertEquals(this.vehiculo.getModelo(), "Gol");
		assertEquals(this.vehiculo.getPatente(), "abc123");
		assertEquals(this.vehiculo.getVolumenVar(), volumen);
	}

}
