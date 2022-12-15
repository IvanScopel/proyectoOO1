package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DescripcionDetalladaTest {

	
	private DescripcionDetallada descripcionDetallada;
	private Producto arroz,tomate;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 5);
		tomate = new Producto("tomate", 10);
		
		List<Producto> lista = new ArrayList<Producto>();
		lista.add(tomate);
		lista.add(arroz);
		
		this.descripcionDetallada = new DescripcionDetallada(lista);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(this.descripcionDetallada.getProductos().size(),2);
		assertTrue(this.descripcionDetallada.getProductos().contains(this.tomate));
	}


	
}
