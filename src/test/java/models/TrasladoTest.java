package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrasladoTest {
	Traslado traslado;
	Envio envio;
	
	@BeforeEach
	public void setup() {
		envio=new Envio(null/*listaDeEnvio*/, null/*donacion*/, null/*volumen*/, null/*resumenEnvio*/);
		traslado=new Traslado("se traslada a un comedor", envio,null/*fecha*/ , 12.1); 
	}
	
	@Test
	public void testGetDistancia() {
		assertEquals(traslado.getDistancia(), 12.1);
	}
	@Test
	public void testGetEnvio() {
		assertEquals(traslado.getEnvio(), envio);
	}
	@Test
	public void testConfirmarTraslado() {
		assertEquals(traslado.getEnvio().getEstado(), "pendiente de retiro");
		assertNotEquals(traslado.getEnvio().getEstado(), "no entregado");
	}
	
	@Test
	public void testCambiarEstadoDeEnvio() {
		traslado.getEnvio().cambiarEstado("estado nuevo");
		assertEquals(traslado.getEnvio().getEstado(), "estado nuevo");
	}

}
