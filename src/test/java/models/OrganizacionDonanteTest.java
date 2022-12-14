package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.OrganizacionDonante;
import models.Vehiculo;
import models.Volumen;
import models.Voluntario;

public class OrganizacionDonanteTest {
	//------------------------------producto------------------
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	private Producto producto5;
	//---------------------lista de productos----
	private List<Producto> lista1;
	private List<Producto> lista2;
	//------------------------------resumen de envios---------
	private ResumenEnvio resumen1;
	private ResumenEnvio resumen2;
	private ResumenEnvio resumen3;
	private ResumenEnvio resumen4;
	private ResumenEnvio resumen5;
	private ResumenEnvio resumen6;
	//------------lista de resumen de envio-------------------
	private List<ResumenEnvio> listaResumen1;
	//---------------------donacion--------------------------
	private Donacion donacion1;
	private Donacion donacion2;
	//----------------------descripcion de donacion
	private DescripcionDetallada detallada;
	//-------------------------envios-------------------------
	private Envio envio1;
	private Envio envio2;
	private Envio envio3;
	private Envio envio4;
	//------------------------voluntarios--------------------
	private Voluntario voluntario1;
	private Voluntario voluntario2;
	private Voluntario voluntario3;
	private Voluntario voluntario4;
	//-----------------------vehiculos-----------------------
	private Vehiculo vehiculo1;
	private Vehiculo vehiculo2;
	private Vehiculo vehiculo3;
	//----------------------volumen--------------------------
	private Volumen volumen1;
	private Volumen volumen2;
	private Volumen volumen3;
	//-------------------organizacion donante--------------
	private OrganizacionDonante orgDonante;
	//--------------------Generado para comparar en test
	private Volumen volumenSolicitado;
	private List<Voluntario> esperado;
	private List<Voluntario> esperado2;
	
	
	

	@BeforeEach
	public void setup() {
		//-----------------------productos------------
		producto1=new Producto("pan", 48);
		producto2=new Producto("chorizo", 64);
		producto3=new Producto("huevo", 135);
		producto4=new Producto("bondiola", 524);
		producto5=new Producto("salmon", 22);
		//--------------------lista de productos------
		lista1=new ArrayList<Producto>();
		lista2=new ArrayList<Producto>();
		lista1.add(producto2);
		lista1.add(producto4);
		lista2.add(producto1);
		lista2.add(producto3);
		lista2.add(producto5);
		//--------------------------------------------resumen--------
		resumen1=new ResumenEnvio("pan", 15.3);
		resumen2=new ResumenEnvio("chorizo", 4.0);
		resumen3=new ResumenEnvio("huevo",6.0);
		resumen4=new ResumenEnvio("bondiola",65.5);
		resumen5=new ResumenEnvio("salmon",9.4);
		resumen6=new ResumenEnvio("carbon",23.6);
		//-------------------------------listados de resumenes ------
		listaResumen1=new ArrayList<ResumenEnvio>();
		//----------------
		listaResumen1.add(resumen1);
		listaResumen1.add(resumen2);
		listaResumen1.add(resumen6);
		listaResumen1.add(resumen3);
		listaResumen1.add(resumen4);
		listaResumen1.add(resumen5);
		//--------------------descripcion------------
		detallada=new DescripcionDetallada(lista1);
		//--------------------volumen-----------------		
		volumen1 = new Volumen(1.0, 1.0, 1.0);			//1
		volumen2 = new Volumen(2.0, 99.0, 5.0);			//990
		volumen3 = new Volumen(3.0, 3.0, 3.0);			//27
		volumenSolicitado = new Volumen(3.0, 3.0, 4.0);	//36
		//--------------------donaciones-------------
		donacion1=new Donacion("estado", null/*una fecha*/,detallada);
		//--------------------envios------------------
		envio1=new Envio(lista1, donacion1, volumen1, listaResumen1);
		envio2=new Envio(lista2, donacion2, volumen1, listaResumen1);
		//--------------------vehiculos--------------		
		vehiculo1 = new Vehiculo("Fiat", "Torino", "abc123", volumen1);
		vehiculo2 = new Vehiculo("ford", "falcon", "sdf548", volumen2);
		vehiculo3 = new Vehiculo("peugeot", "306", "fkj423", volumen3);
		//--------------------voluntarios------------
		voluntario1 = new Voluntario("Voluntario1", "1234", "a@a", "1234", "", null);
		voluntario2 = new Voluntario("Voluntario2", "1234", "a@a", "1234", "", vehiculo1);
		voluntario3 = new Voluntario("Voluntario3", "1234", "a@a", "1234", "", vehiculo2);
		voluntario4 = new Voluntario("Voluntario4", "1234", "a@a", "1234", "", vehiculo3);
		voluntario1 = new Voluntario("Voluntario1", "1234", "a@a", "1234", "", null);
		voluntario2 = new Voluntario("Voluntario2", "1234", "a@a", "1234", "", vehiculo1);
		voluntario3 = new Voluntario("Voluntario3", "1234", "a@a", "1234", "", vehiculo2);
		voluntario4 = new Voluntario("Voluntario4", "1234", "a@a", "1234", "", vehiculo3);
		voluntario3 = new Voluntario("Voluntario3", "1234", "a@a", "1234", "", vehiculo2);
		voluntario4 = new Voluntario("Voluntario4", "1234", "a@a", "1234", "", vehiculo3);
		
		//-----------		
		voluntario1.asignarTraslado(envio1, null, null, 45.1);		
		voluntario2.asignarTraslado(envio2, null, null, 13.9);
		voluntario3.asignarTraslado(envio1, null, null, 0);
		voluntario4.asignarTraslado(envio2, null, null, 0);
		voluntario1.getTraslados().get(0).cambiarEstadoDeEnvio("cambio de estado voluntario1");
		//--------------Organizacion donante--------
		orgDonante = new OrganizacionDonante("Walmart", "0000", "5 y 48");
		//--------
		orgDonante.altaVoluntario(voluntario1);
		orgDonante.altaVoluntario(voluntario2);
		orgDonante.altaVoluntario(voluntario3);
		orgDonante.altaVoluntario(voluntario4);	
		//le asigno a esperado al voluntario2 quien es el que posee el vehiculo y comparo con el resultado del metodo
		esperado=new ArrayList<Voluntario>();
		esperado2=new ArrayList<Voluntario>();		
		esperado.add(voluntario2);
		esperado.add(voluntario3);
		esperado.add(voluntario4);
		esperado2.add(voluntario2);
		esperado2.add(voluntario4);
		voluntario1.asignarPuntos(voluntario1.getTraslados().get(0));
		//-----------------------------------
		
		
	}
	
	@Test
	public void testGetVoluntariosConVehiculo() {
		assertArrayEquals(esperado.toArray(), orgDonante.getVoluntariosConVehiculo().toArray());
	}
	
	@Test
	public void testGetVoluntariosParaTraslado() {
		assertArrayEquals(esperado2.toArray(), orgDonante.getVoluntariosParaTraslado(volumenSolicitado).toArray());
	}
	
	@Test
	public void testGetTrasladosPendientesTotal() {
		assertEquals(orgDonante.getTrasladosPendientesTotal().size(),2);
	}
	
	@Test
	public void testAsignarPuntos() {
		//el peso es de 123,8 y la distancia es de 45.1
		//el resultado es 5.583,38
		assertEquals(voluntario1.getPuntuacion(), 5584);
	}
	
	@Test
	public void testTop10Voluntarios() {
		
	}

}
