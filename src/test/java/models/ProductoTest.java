package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private Producto producto;
	

	
	@Test
	public void testConstructor() {
		this.producto = new Producto("descripcionProd", 5);
		assertEquals(this.producto.getDescripcion(), "descripcionProd");
		assertEquals(this.producto.getCantidad(), 5);
	}
}
