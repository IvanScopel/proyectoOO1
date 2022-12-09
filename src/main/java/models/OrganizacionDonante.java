package models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OrganizacionDonante {

	
	private String razon_social;
	private String cuil;
	private String direccion;
	private List<Contacto> contactos;
	private List<Voluntario> voluntarios;
	private List<Donacion> donaciones;
	
	public OrganizacionDonante(String razon_social, String cuil, String direccion) {
		this.razon_social = razon_social;
		this.cuil = cuil;
		this.direccion = direccion;
		this.contactos = new ArrayList<Contacto>();
		this.donaciones = new ArrayList<Donacion>();
		this.voluntarios = new ArrayList<Voluntario>();
	}
	
	
	
	public void altaContacto(Contacto contacto) {
		contactos.add(contacto);
	}
	
	public Donacion altaDonacion(Donacion donacion) {
		donacion.cambiarEstado("pendiente de retiro");
		donaciones.add(donacion);
		return donacion;
	}
	
	public void altaVoluntario(Voluntario voluntario) {
		voluntarios.add(voluntario);
	}
	
	//retorna un listado con los voluntarios con vehiculos
	private List<Voluntario> voluntariosConVehiculo(){
		List<Voluntario> lista = new ArrayList<Voluntario>();
		voluntarios.stream().forEach((p)-> {
			if(p.getVehiculo() != null) {
				lista.add(p);}});	
		return lista;
	}
	
	//retorna una lista de voluntarios con vehiculos que tengan el suficiente espacio para el volumen dado
	public List<Voluntario> voluntariosParaTraslado(Volumen volumen){
		List<Voluntario>lista = voluntariosConVehiculo();
		
		lista.stream().forEach((p)-> {
			if((p.getVehiculo()).getVolumen() < volumen.getVolumen()) {
				lista.remove(p);
			}});
		return lista;
	}

}
