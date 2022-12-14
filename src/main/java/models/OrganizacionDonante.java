package models;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrganizacionDonante {

	
	private String razon_social;
	private String cuil;
	private String direccion;
	private List<Contacto> contactos;
	private List<Voluntario> voluntarios;
	private List<Donacion> donaciones;
	private List<Insignia> insignias;
	private Integer puntuacion;
	
	public OrganizacionDonante(String razon_social, String cuil, String direccion) {
		this.razon_social = razon_social;
		this.cuil = cuil;
		this.direccion = direccion;
		this.contactos = new ArrayList<Contacto>();
		this.donaciones = new ArrayList<Donacion>();
		this.voluntarios = new ArrayList<Voluntario>();
		this.insignias = new ArrayList<Insignia>();
		this.puntuacion = 0;
	}
	
	
	//agrega un contacto a el listado de contacto de la organizacion
	public void altaContacto(Contacto contacto) {
		contactos.add(contacto);
	}
	
	//una organizacion da de alta una donacion y le establece su estado
	public Donacion altaDonacion(Donacion donacion) {
		donacion.cambiarEstado("pendiente de retiro");
		donaciones.add(donacion);
		return donacion;
	}
	
	//agrega un voluntario a el listado de voluntarios de la organizacion
	public void altaVoluntario(Voluntario voluntario) {
		voluntarios.add(voluntario);
	}
	
	//retorna un listado con los voluntarios que posean vehiculos
	public List<Voluntario> getVoluntariosConVehiculo(){
		List<Voluntario> lista = new ArrayList<Voluntario>();
		voluntarios.stream().forEach((p)-> {
			if((p.getVehiculo())!=null) {
				lista.add(p);}});
		
		return lista;
	}
	
	//retorna una lista de voluntarios con vehiculos que tengan el suficiente espacio para el volumen dado
	public List<Voluntario> getVoluntariosParaTraslado(Volumen volumen){
		List<Voluntario>lista = getVoluntariosConVehiculo();		
		return lista.stream().filter(x -> x.getVehiculo().getVolumen() < volumen.getVolumen()).collect(Collectors.toList());
	}
	
	
	//retorna la lista de todas las donaciones o envios que se encuentran en "pendiente de retiro"
	//para que una donacion se encuentre en estado "en traslado", si o si tiene que estar asignada a un traslado, por ende tmb a un envio
	public List<Traslado> getTrasladosPendientesTotal(){
		 return voluntarios.stream().flatMap(each -> each.getTrasladosPendientes().stream()).collect(Collectors.toList());
	}
	
	//Asigna puntos a una organizacion dado el peso del envio 
	public void asignarPuntos(Traslado traslado){
		puntuacion += (int) Math.round(traslado.getDistancia());		
	}
	
	public List<Voluntario> top10Voluntarios(){
		return voluntarios.stream().sorted((v1, v2) -> v1.getPuntuacion().compareTo(v2.getPuntuacion())).limit(10).collect(Collectors.toList());
	}
	
	public void agregarInsignia(Insignia insignia) {
		insignias.add(insignia);
	}


	public List<Insignia> getInsignias() {
		return insignias;
	}
	
}
