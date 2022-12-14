package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto producto;
	
	@BeforeEach
	public void setup() {
		producto=new Producto("pera", 5);
	}
	@Test
	public void testGetDescripcion() {
		assertEquals(producto.getDescripcion(), "pera");
	}
	@Test
	public void testGetCantidad() {
		assertEquals(producto.getCantidad(), 5);
	}

}
