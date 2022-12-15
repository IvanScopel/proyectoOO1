package models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrasladoTest {
	private Traslado traslado, trasladoTest;
	private Envio envio;
	
	@BeforeEach
	public void setup() {
		envio=new Envio(null/*listaDeEnvio*/, null/*donacion*/, null/*volumen*/, null/*resumenEnvio*/);
		traslado=new Traslado("se traslada a un comedor", envio,null/*fecha*/ , 12.1); 
	}
	
	
	@Test
	public void testConstructor() {
		this.trasladoTest = new Traslado("comentario de traslado", envio, LocalDate.of(2023, 2, 1), 5.0);
		assertEquals(this.trasladoTest.getComentario(), "comentario de traslado");
		assertEquals(this.trasladoTest.getEnvio(), envio);
		assertEquals(this.trasladoTest.getFechaAsignacion(), LocalDate.now());
		assertEquals(this.trasladoTest.getFechaTraslado(), LocalDate.of(2023, 2, 1));
		assertEquals(this.trasladoTest.getDistancia(), 5.0);
	}
	
	@Test
	public void testConfirmarTraslado() {
		assertEquals(traslado.getEnvio().getEstado(), "pendiente de retiro");
		this.traslado.confirmarTraslado();
		assertEquals(this.traslado.getEnvio().getEstado(), "entregado");
	}
	
	@Test
	public void testCambiarEstadoDeEnvio() {
		traslado.getEnvio().cambiarEstado("estado nuevo");
		assertEquals(traslado.getEnvio().getEstado(), "estado nuevo");
	}

}
