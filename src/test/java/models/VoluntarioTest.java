package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoluntarioTest {
	Voluntario voluntario;

	Traslado traslado1;
	Traslado traslado2;
	Traslado traslado3;
	Traslado traslado4;
	Traslado traslado5;
	
	Envio envio1;
	Envio envio2;
	Envio envio3;
	Envio envio4;
	Envio envio5;

	
	@BeforeEach
	public void setup() {
		voluntario=new Voluntario("Juan", "000000000","a@a", "2214333333", "en el barrrio", null);
	
		
		envio1=new Envio(null, null, null, null);
		envio2=new Envio(null, null, null, null);
		envio3=new Envio(null, null, null, null);
		envio4=new Envio(null, null, null, null);
		envio5=new Envio(null, null, null, null);
				
		
		voluntario.asignarTraslado(envio1, "comentario", null, 0);
		voluntario.asignarTraslado(envio2, "comentario", null, 0);
		voluntario.asignarTraslado(envio3, "comentario", null, 0);
		voluntario.asignarTraslado(envio4, "comentario", null, 0);
		voluntario.getTraslados().get(0).cambiarEstadoDeEnvio("nuevovoluntario.getTrasladosPendientes()");
		voluntario.asignarTraslado(envio5, "traslado5", null, 0);
		
		
		
	}
	@Test
	public void testGetTrasladosPendientes() {
		assertEquals(voluntario.getTrasladosPendientes().size(),4);
		
	}

}
