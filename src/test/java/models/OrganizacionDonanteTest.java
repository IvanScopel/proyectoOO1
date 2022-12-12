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
	private List<Voluntario> esperado;
	private List<Voluntario> esperado2;
	
	private Vehiculo vehiculo1;
	private Vehiculo vehiculo2;
	private Vehiculo vehiculo3;
	private Volumen volumen1;
	private Volumen volumen2;
	private Volumen volumen3;
	private Volumen volumenSolicitado;
	
	@BeforeEach
	public void setup() {
		
		
		volumen1 = new Volumen(1.0, 1.0, 1.0);			//1
		volumen2 = new Volumen(2.0, 99.0, 5.0);			//990
		volumen3 = new Volumen(3.0, 3.0, 3.0);			//27
		volumenSolicitado = new Volumen(3.0, 3.0, 4.0);	//36
		
		vehiculo1 = new Vehiculo("Fiat", "Torino", "abc123", volumen1);
		vehiculo2 = new Vehiculo("Fiat", "Torino", "abc123", volumen2);
		vehiculo3 = new Vehiculo("Fiat", "Torino", "abc123", volumen3);
		
		voluntario1 = new Voluntario("Voluntario1", "1234", "a@a", "1234", "", null);
		voluntario2 = new Voluntario("Voluntario2", "1234", "a@a", "1234", "", vehiculo1);
		voluntario3 = new Voluntario("Voluntario3", "1234", "a@a", "1234", "", vehiculo2);
		voluntario4 = new Voluntario("Voluntario4", "1234", "a@a", "1234", "", vehiculo3);

		orgDonante = new OrganizacionDonante("Walmart", "0000", "5 y 48");
		
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
	}
	
	@Test
	public void testVoluntariosConVehiculo() {
		assertArrayEquals(esperado.toArray(), orgDonante.getVoluntariosConVehiculo().toArray());
	}
	
	@Test
	public void testGetVoluntariosParaTraslado() {
		assertArrayEquals(esperado2.toArray(), orgDonante.getVoluntariosParaTraslado(volumenSolicitado).toArray());
	}
	
	

}
