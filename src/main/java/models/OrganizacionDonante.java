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
	
	public void altaContacto(Contacto contacto) {
		contactos.add(contacto);
	}
	
	public void altaDonacion(Donacion donacion) {
		donaciones.add(donacion);
	}
	
	public void altaVoluntario(Voluntario voluntario) {
		voluntarios.add(voluntario);
	}
	
	//retorna un listado con los voluntarios con vehiculos
	private List<Voluntario> voluntariosConVehiculo(){
		List<Voluntario> lista = new ArrayList<Voluntario>();
		for(Voluntario voluntario :voluntarios) {
			if(voluntario.getVehiculo() != null) {
				lista.add(voluntario);
			}
		}
		return lista;
	}
	
	//retorna una lista de voluntarios con vehiculos que tengan el suficiente espacio para el volumen dado
	public List<Voluntario> voluntariosParaTraslado(Volumen volumen){
		List<Voluntario>lista = voluntariosConVehiculo();
		for(Voluntario voluntario :voluntarios) {
			if((voluntario.getVehiculo()).getVolumen() >= volumen.getVolumen()) {
				lista.add(voluntario);
			}
		}
		return lista;
	}
	
	
}
