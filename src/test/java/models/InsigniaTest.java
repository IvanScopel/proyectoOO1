package models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsigniaTest {

	private Insignia insignia;
	private TipoInsignia tipoInsignia;
	
	@BeforeEach
	public void setUp() {
		this.tipoInsignia = new TipoInsignia("nombre Insignia");
	}
	
	@Test
	public void testConstructor() {
		this.insignia = new Insignia(this.tipoInsignia, LocalDate.now(), null);
		assertEquals(this.insignia.getTipoInsignia(), this.tipoInsignia);
		assertEquals(this.insignia.getFechaOtorgada(), LocalDate.now());
		assertEquals(this.insignia.getFechaVencimiento(), null);
	}
}
