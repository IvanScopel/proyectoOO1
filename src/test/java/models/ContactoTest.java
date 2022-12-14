package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactoTest {

	private Contacto contacto;
	
	@BeforeEach
	public void setUp() {
		
		this.contacto = new Contacto("123456789", "mail@example.com", "2215559999", "nombre", "apellido");
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals("123456789",this.contacto.getDni());
		assertEquals("mail@example.com",this.contacto.getEmail());
		assertEquals("2215559999",this.contacto.getTelefono());
		assertEquals("nombre",this.contacto.getNombre());
		assertEquals("apellido",this.contacto.getApellido());
	}
	
}
