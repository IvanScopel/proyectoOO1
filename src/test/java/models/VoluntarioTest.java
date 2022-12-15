package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoluntarioTest {
	private Voluntario voluntario, voluntarioTest;

	private Traslado traslado1,traslado2,traslado3,traslado4,traslado5;
	
	private Envio envio1,envio2,envio3,envio4,envio5;
	
	private Vehiculo vehiculo,vehiculo2;

	private List<Traslado> listaDeTraslado;
	private ResumenEnvio resumen1,resumen2,resumen3;
	
	
	private List<ResumenEnvio> listaResumen1;
	
	
	@BeforeEach
	public void setup() {
		vehiculo=new Vehiculo("fiat", "fiorino", "lmk239", null/*volumen*/);
		vehiculo2=new Vehiculo("ford", "falcon", "lfd639", null/*volumen*/);
		
		voluntario=new Voluntario("Juan", "000000000","a@a", "2214333333", "13 y 32", vehiculo);
		//-------------------------------listados de resumenes ------
		listaResumen1=new ArrayList<ResumenEnvio>();
		//-------------------------------
		resumen1=new ResumenEnvio("pan", 15.3);
		resumen2=new ResumenEnvio("chorizo", 4.0);
		resumen3=new ResumenEnvio("huevo",6.0);
		//----------------
		listaResumen1.add(resumen1);
		listaResumen1.add(resumen2);
		listaResumen1.add(resumen3);
				
		envio1=new Envio(null, null, null, listaResumen1);
		envio2=new Envio(null, null, null, listaResumen1);
		envio3=new Envio(null, null, null, listaResumen1);
		envio4=new Envio(null, null, null, listaResumen1);
		envio5=new Envio(null, null, null, listaResumen1);
				
		traslado1= new Traslado("comentario",envio1,null, 9.0);
		traslado2= new Traslado("comentario",envio2,null, 10.0);
		traslado3= new Traslado("comentario",envio3,null, 11.0);
		traslado4= new Traslado("comentario",envio4,null, 12.0);
		traslado5= new Traslado("comentario",envio5,null, 13.0);
		
		
		voluntario.asignarTraslado(traslado1);
		voluntario.asignarTraslado(traslado2);
		voluntario.asignarTraslado(traslado3);
		voluntario.asignarTraslado(traslado4);

		voluntario.getTraslados().get(0).cambiarEstadoDeEnvio("entregado");
		
		listaDeTraslado=new ArrayList<Traslado>();
		
		listaDeTraslado.add(traslado1);
		listaDeTraslado.add(traslado2);
		listaDeTraslado.add(traslado3);
		listaDeTraslado.add(traslado4);
		listaDeTraslado.add(traslado5);
		
		
		
	}
	
	
	@Test
	public void testConstructor() {
		this.voluntarioTest = new Voluntario("nombreTest", "12345678", "mail@example", "2211112222", "direccion 123", this.vehiculo);
		assertEquals(this.voluntarioTest.getNombre(), "nombreTest");
		assertEquals(this.voluntarioTest.getDni(), "12345678");
		assertEquals(this.voluntarioTest.getEmail(), "mail@example");
		assertEquals(this.voluntarioTest.getTelefono(), "2211112222");
		assertEquals(this.voluntarioTest.getDireccion_estable(), "direccion 123");
		assertEquals(this.voluntarioTest.getVehiculo(),this.vehiculo);
		assertEquals(this.voluntarioTest.getInsignias().size(),0);
		assertEquals(this.voluntarioTest.getPuntuacion(),0);
		assertEquals(this.voluntarioTest.getTraslados().size(),0);
	}
	
	@Test
	public void testGetTrasladosPendientes() {
		assertEquals(voluntario.getTrasladosPendientes().size(),3);
	}
	
	
	@Test
	public void testAsignarTraslado() {
		voluntario.asignarTraslado(traslado5);
		assertTrue(voluntario.getTraslados().contains(traslado5));
	}
	
	
	@Test
	public void testAsignarPuntos() {
		assertEquals(voluntario.getPuntuacion(),0);
		this.voluntario.asignarPuntos(traslado1);
		assertEquals(voluntario.getPuntuacion(),228);
	}
	

}
