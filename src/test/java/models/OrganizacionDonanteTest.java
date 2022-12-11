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
	
	private OrganizacionDonante orgDonante;
	
	private Voluntario voluntario1;
	private Voluntario voluntario2;
	private Voluntario voluntario3;
	private Voluntario voluntario4;
	private List<Voluntario> esperado=new ArrayList<Voluntario>();;
	
	private Vehiculo vehiculo;
	private Volumen volumen;
	
	@BeforeEach
	public void setup() {
		
		
		volumen = new Volumen(4.0, 5.0, 6.0);
		vehiculo = new Vehiculo("Fiat", "Torino", "abc123", volumen);
		
		voluntario1 = new Voluntario("Asd", "1234", "a@a", "1234", "", null);
		voluntario2 = new Voluntario("Asd", "1234", "a@a", "1234", "", vehiculo);

		orgDonante = new OrganizacionDonante("Walmart", "0000", "5 y 48");
		
		orgDonante.altaVoluntario(voluntario1);
		orgDonante.altaVoluntario(voluntario2);
		//le asigno a esperado al voluntario2 quien es el que posee el vehiculo y comparo con el resultado del metodo
		esperado.add(voluntario2);
	}
	
	@Test
	public void testVoluntariosConVehiculo() {
		assertEquals(1, orgDonante.getVoluntariosParaTraslado(volumen).size());
		assertIterableEquals(esperado, orgDonante.getVoluntariosParaTraslado(volumen));
		
		
	}
	
	

}
