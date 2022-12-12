package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeneficiarioTest {
	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	private Producto producto5;
	
	private List<Producto> lista1;
	private List<Producto> lista2;
	
	private DescripcionDetallada detallada1;
	private DescripcionDetallada detallada2;
	private DescripcionGeneral general1;
	
	private Date fechaDisponible1;
	private Date fechaDisponible2;
	private Date fechaDisponible3;
	
	private Donacion donacion1;
	private Donacion donacion2;
	private Donacion donacion3;
	
	private Volumen volumen1;
	private Volumen volumen2;

	private ResumenEnvio resumen1;
	private ResumenEnvio resumen2;
	private ResumenEnvio resumen3;
	private ResumenEnvio resumen4;
	private ResumenEnvio resumen5;
	private ResumenEnvio resumen6;
	
	private List<ResumenEnvio> listaResumen1;
	private List<ResumenEnvio> listaResumen2;
	
	private Beneficiario benefi1;
	private Beneficiario benefi2;
	
	private ResumenEnvio listaResumenEsperada;
	private List<Producto> listaEsperada;
	
	@BeforeEach
	public void setup() {
		
		producto1=new Producto("pan", 48);
		producto2=new Producto("chorizo", 64);
		producto3=new Producto("huevo", 135);
		producto4=new Producto("bondiola", 524);
		producto5=new Producto("salmon", 22);
		//----------------------------------------------
		lista1=new ArrayList<Producto>();
		lista2=new ArrayList<Producto>();
		//productos con final par
		lista1.add(producto2);
		lista1.add(producto4);
		//------
		lista2.add(producto1);
		lista2.add(producto3);
		lista2.add(producto5);
		//----------------------------------------------donaciones---
		fechaDisponible1=new Date(2022, 10, 23);
		detallada1=new DescripcionDetallada(lista1);
		donacion1=new Donacion("estado", fechaDisponible1,detallada1);
		//-------
		fechaDisponible2=new Date(2022, 9, 23);
		detallada2=new DescripcionDetallada(lista2);
		donacion1=new Donacion("estado", fechaDisponible2,detallada2);
		//------
		fechaDisponible3=new Date(2022, 10, 23);
		general1=new DescripcionGeneral(volumen1,"caracteristicas");
		donacion1=new Donacion("estado", fechaDisponible3,general1);
		//--------------------------------------------resumen--------
		resumen1=new ResumenEnvio("pan", 15.3);
		resumen2=new ResumenEnvio("chorizo", 4.0);
		resumen3=new ResumenEnvio("huevo",6.0);
		resumen4=new ResumenEnvio("bondiola",65.5);
		resumen5=new ResumenEnvio("salmon",9.4);
		resumen6=new ResumenEnvio("carbon",23.6);
		//-------------------------------listados de resumenes ------
		listaResumen1=new ArrayList<ResumenEnvio>();
		listaResumen2=new ArrayList<ResumenEnvio>();
		//----------------
		listaResumen1.add(resumen1);
		listaResumen1.add(resumen2);
		listaResumen1.add(resumen6);
		//-------------------
		listaResumen2.add(resumen3);
		listaResumen2.add(resumen4);
		listaResumen2.add(resumen5);
	    //--------------------------------crear beneficiarios-------
		benefi1=new Beneficiario("cara sucia", "la plata 1900", 6);
		benefi2=new Beneficiario("copa de leche", "berisso", 26);
		
		volumen1=new Volumen(1.0, 4.0, 9.50);
		//crea un envio y lo agrega a la lista de envios----------
		benefi1.altaEnvio(lista1, donacion1, volumen1, listaResumen1);
		benefi2.altaEnvio(lista2, donacion2, volumen2, listaResumen2);
	}
	
	@Test
	public void testAltaEnvio(){
		//aux
		Envio ultimoElementoBenefi1=benefi1.getEnvios().get(benefi1.getEnvios().size()-1);
		Envio ultimoElementoBenefi2=benefi2.getEnvios().get(benefi2.getEnvios().size()-1);
		//se probo qye la lista de productos posee los productos agregados
		assertEquals(ultimoElementoBenefi1.getProductos().get(ultimoElementoBenefi1.getProductos().size()-1),producto4);
		assertEquals(ultimoElementoBenefi2.getProductos().get(0),producto1);
		assertNotEquals(ultimoElementoBenefi1.getProductos().get(ultimoElementoBenefi1.getProductos().size()-1),producto2);
		
		//se probo que la donacion es la misma
		assertEquals(ultimoElementoBenefi1.getDonacion(), donacion1);
		assertNull(ultimoElementoBenefi2.getDonacion());
		
		//se probo que volumen se alla agregado bien
		assertEquals(ultimoElementoBenefi1.getVolumen(),volumen1);
		assertNull(ultimoElementoBenefi2.getVolumen());
		
		//se probo que listaResumen se alla agragado bien
		assertEquals(ultimoElementoBenefi1.getResumenEnvio().get(ultimoElementoBenefi1.getResumenEnvio().size()-1),resumen6);
		
	}

}
