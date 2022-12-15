package models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeneficiarioTest {
	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	private List<Producto> lista1;
	
	private DescripcionDetallada detallada1;
	
	private LocalDate fechaDisponible1;
	
	private Donacion donacion1;
	
	private Volumen volumen1;
	
	private ResumenEnvio resumen1;
	private ResumenEnvio resumen2;
	private ResumenEnvio resumen3;
	
	private List<ResumenEnvio> listaResumen1;
	
	private Beneficiario beneficiario;
	
	private Envio envio;
	
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
		detallada1=new DescripcionDetallada(lista1);
		donacion1=new Donacion("estado", fechaDisponible1,detallada1);
		//-------
		resumen1=new ResumenEnvio("pan", 15.3);
		resumen2=new ResumenEnvio("chorizo", 4.0);
		resumen3=new ResumenEnvio("huevo",6.0);
		//-------------------------------listados de resumenes ------
		listaResumen1=new ArrayList<ResumenEnvio>();
		//----------------
		listaResumen1.add(resumen1);
		listaResumen1.add(resumen2);
		listaResumen1.add(resumen3);
		
	    //--------------------------------crear beneficiario-------
		beneficiario=new Beneficiario("cara sucia", "la plata 1900", 6);
		
		volumen1=new Volumen(1.0, 4.0, 9.50);
		
		
	}
	
	
	@Test
	public void testConstructor() {
		assertEquals(this.beneficiario.getNombre(), "cara sucia");
		assertEquals(this.beneficiario.getDireccion(), "la plata 1900");
		assertEquals(this.beneficiario.getCantPersonas(), 6);
		assertEquals(this.beneficiario.getEnvios().size(),0);
	}
	
	@Test
	public void testAltaEnvio(){

		this.envio = new Envio(lista1, donacion1, volumen1, listaResumen1);
		beneficiario.altaEnvio(envio);
		assertEquals(this.beneficiario.getEnvios().size(), 1);
		assertTrue(this.beneficiario.getEnvios().contains(this.envio));
		
		
	}

}
