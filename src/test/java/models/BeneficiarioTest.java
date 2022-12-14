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
	
	private Envio envio;
	private Envio envio2;
	
	@BeforeEach
	public void setUp() {
		
		producto1=new Producto("pan", 48);
		producto2=new Producto("chorizo", 64);
		producto3=new Producto("huevo", 135);
		//----------------------------------------------
		lista1=new ArrayList<Producto>();
		
		lista1.add(producto1);
		lista1.add(producto2);
		lista1.add(producto3);
		//----------------------------------------------donaciones---
		fechaDisponible1=new Date(2022, 10, 23);
		detallada1=new DescripcionDetallada(lista1);
		donacion1=new Donacion("estado", fechaDisponible1,detallada1);
		//-------
		//------
		
		resumen1=new ResumenEnvio("pan", 15.3);
		resumen2=new ResumenEnvio("chorizo", 4.0);
		resumen3=new ResumenEnvio("huevo",6.0);
		//-------------------------------listados de resumenes ------
		listaResumen1=new ArrayList<ResumenEnvio>();
		//----------------
		listaResumen1.add(resumen1);
		listaResumen1.add(resumen2);
		listaResumen1.add(resumen3);
		
	    //--------------------------------crear beneficiarios-------
		benefi1=new Beneficiario("cara sucia", "la plata 1900", 6);
		
		volumen1=new Volumen(1.0, 4.0, 9.50);
		
		//crea un envio y lo agrega a la lista de envios----------
	}
	
	@Test
	public void testAltaEnvio(){

		this.envio = new Envio(lista1, donacion1, volumen1, listaResumen1);
		benefi1.altaEnvio(envio);
		assertEquals(this.benefi1.getEnvios().size(), 1);
		assertTrue(this.benefi1.getEnvios().contains(this.envio));
		
		
	}

}
