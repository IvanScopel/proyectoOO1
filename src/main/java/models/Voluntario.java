package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Voluntario {

	private String dni;
	private String nombre;
	private String email;
	private String telefono;
	private String direccion_estable;
	private Vehiculo vehiculo;
	private List<Traslado> traslados;
	private List<Insignia> insignias;
	private int puntuacion;
	
	public Voluntario(String nombre, String dni, String email, String telefono, String direccion_estable, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.direccion_estable = direccion_estable;
		this.vehiculo = vehiculo;
		this.traslados = new ArrayList<Traslado>();
		this.puntuacion = 0;
	}
		
	
	//retorna si posee vehiculo en caso contrario retorna null
	public Vehiculo getVehiculo(){
		return vehiculo;
	}
	
	public Integer getPuntuacion() {
		return puntuacion;
	}
	
	//asigna un envio y su respectivo comentario a el voluntario
	public void asignarTraslado(Traslado nuevoTraslado) {
		traslados.add(nuevoTraslado);
		nuevoTraslado.cambiarEstadoDeEnvio("en traslado");
	}
	
	//------------------------------
	public List<Traslado> getTrasladosPendientes(){
		return traslados.stream().filter(each -> each.getEnvio().getEstado() == "en traslado").collect(Collectors.toList());
		 
	}
	
	//Asigna puntos a una organizacion dado el peso del envio 
	public void asignarPuntos(Traslado traslado){//traslado y ver casteo para redondeo/ agregar  en voluntario /agregar) {
			puntuacion += (int) Math.ceil(traslado.getDistancia()*traslado.getEnvio().obtenerElPesoDelEnvio());		
	}


	public List<Traslado> getTraslados() {
			return traslados;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
		
		
	
}
