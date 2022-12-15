package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DescripcionDetalladaTest {

	
	private DescripcionDetallada descripcionDetallada;
	private Producto arroz,tomate,producto3;
	private ArrayList<Producto> lista;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 5);
		tomate = new Producto("tomate", 10);
		
		lista = new ArrayList<Producto>();
		lista.add(tomate);
		lista.add(arroz);
		
	}
	
	@Test
	public void testConstructor() {
		this.descripcionDetallada = new DescripcionDetallada(lista);
		assertEquals(this.descripcionDetallada.getProductos().size(),2);
		assertTrue(this.descripcionDetallada.getProductos().contains(this.tomate));
	}
	
	@Test
	public void testAltaAlimento() {
		this.descripcionDetallada = new DescripcionDetallada(lista);
		this.producto3 = new Producto("producto 3", 5);
		assertEquals(this.descripcionDetallada.getProductos().size(),2);
		this.descripcionDetallada.altaAlimento(producto3);
		assertEquals(this.descripcionDetallada.getProductos().size(),3);
	}


	
}
