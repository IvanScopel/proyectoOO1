package models;

import java.util.ArrayList;
import java.util.List;

public class OrganizacionDonante {

	
	private String razon_social;
	private String cuil;
	private String direccion;
	private List<Contacto> contactos;
	private List<Voluntario> voluntarios;
	private List<Donacion> donaciones;
	
	private OrganizacionDonante(String razon_social, String cuil, String direccion, List<Contacto> contactos) {
		this.razon_social = razon_social;
		this.cuil = cuil;
		this.direccion = direccion;
		this.contactos = new ArrayList<Contacto>();
		this.donaciones = new ArrayList<Donacion>();
	}
	
	public OrganizacionDonante altaOrganizacionDonante(String razon_social, String cuil, String direccion, List<Contacto> contactos) {
		return new OrganizacionDonante(razon_social, cuil, direccion, contactos);
	}
	
	public Donacion agregarDonacion(Donacion donacion) {
		donaciones.add(donacion);
		return donacion;
	}
	
}
