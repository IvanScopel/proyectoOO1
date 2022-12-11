package models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeneficiarioTest {
	
	//private String nombre;
	//private String direccion;
	//private int cantPersonas;
	//private List<Envio> envios;
	
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
	
	
	
	@BeforeEach
	public void setup() {
		//ArrayList<Producto> productos, Donacion donacion, Volumen volumen, ArrayList<ResumenEnvio> resumenEnvio
		producto1=new Producto("calle 48", 48);
		producto2=new Producto("calle 64", 64);
		producto3=new Producto("calle 135", 135);
		producto4=new Producto("calle 524", 524);
		producto5=new Producto("calle 22", 22);
		//----------------------------------------------
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
		
	}
	
	@Test
	public void testAltaEnvio(){
		
	}

}
