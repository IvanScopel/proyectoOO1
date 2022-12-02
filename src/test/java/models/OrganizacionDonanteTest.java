package models;

import static org.junit.jupiter.api.Assertions.*;

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
	
	private Vehiculo vehiculo;
	private Volumen volumen;
	
	@BeforeEach
	public void setup() {
		
		
		this.volumen = volumen.altaVolumen(4.0, 5.0, 6.0);
		this.vehiculo = this.vehiculo.altaVehiculo("Fiat", "Torino", "abc123", volumen);
		
		this.voluntario1 = this.voluntario1.altaVoluntario("Asd", "1234", "a@a", "1234", "", null);
		this.voluntario2 = this.voluntario2.altaVoluntario("Asd", "1234", "a@a", "1234", "", vehiculo);

		this.orgDonante = this.orgDonante.altaOrganizacionDonante("Walmart", "0000", "5 y 48");
		
		orgDonante.altaVoluntario(voluntario1);
		orgDonante.altaVoluntario(voluntario2);

	}
	
	@Test
	public void testVoluntariosConVehiculo() {
		assertEquals(1, this.orgDonante.voluntariosParaTraslado(volumen).size());
		}

}
