package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoluntarioTest {
	Voluntario voluntario;
	Voluntario voluntarioEsperado;
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
		voluntarioEsperado=new Voluntario("esperado", "33333333", "asdasd@adsd", "5555555", "calle 45", null);
		
		envio1=new Envio(null, null, null, null);
		envio2=new Envio(null, null, null, null);
		envio3=new Envio(null, null, null, null);
		envio4=new Envio(null, null, null, null);
		envio5=new Envio(null, null, null, null);
				
		
		traslado1=new Traslado("traslado1", envio1, null, null);
		traslado2=new Traslado("traslado2", envio2, null, null);
		traslado3=new Traslado("traslado3", envio3, null, null);
		traslado4=new Traslado("traslado4", envio4, null, null);
		traslado5=new Traslado("traslado1", envio5, null, null);
		
		voluntario.asignarTraslado(envio1, "comentario", null, 0);
		voluntario.asignarTraslado(envio2, "comentario", null, 0);
		voluntario.getTraslados().get(voluntario.getTraslados().size()-1).cambiarEstadoDeEnvio("estadonuevo");
		voluntario.asignarTraslado(envio3, "comentario", null, 0);
		voluntario.asignarTraslado(envio4, "comentario", null, 0);
		voluntario.asignarTraslado(envio5, "comentario", null, 0);
		
		voluntarioEsperado.asignarTraslado(envio1, "comentario", null, 0);
		voluntarioEsperado.asignarTraslado(envio3, "comentario", null, 0);
		voluntarioEsperado.asignarTraslado(envio4, "comentario", null, 0);
		voluntarioEsperado.asignarTraslado(envio5, "comentario", null, 0);
		
		
		
	}
	@Test
	public void testGetTrasladosPendientes() {
		//assertArrayEquals(voluntarioEsperado.getTraslados().toArray(),voluntario.getTrasladosPendientes().toArray() );
		assertEquals(voluntario.getTrasladosPendientes());
	}

}
