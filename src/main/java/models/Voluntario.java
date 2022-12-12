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
	
	public Voluntario(String nombre, String dni, String email, String telefono, String direccion_estable, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.direccion_estable = direccion_estable;
		this.vehiculo = vehiculo;
		this.traslados = new ArrayList<Traslado>();
	}
		
	
	//retorna si posee vehiculo en caso contrario retorna null
	public Vehiculo getVehiculo(){
		if(vehiculo!=null) return vehiculo;
		return null;
	}
	
	//asigna un envio y su respectivo comentario a el voluntario
	public void asignarTraslado(Envio envio, String comentario, Date fechaTraslado, double distancia) {
		Traslado nuevoTraslado = new Traslado(comentario,envio, fechaTraslado,distancia);
		traslados.add(nuevoTraslado);
		nuevoTraslado.cambiarEstadoDeEnvio("en traslado");
	}
	
	
	public List<Traslado> getTrasladosPendientes(){
		return traslados.stream().filter(each -> each.getEnvio().getEstado() == "pendiente de retiro").collect(Collectors.toList());
		 
	}
	
	//Asigna puntos a una organizacion dado el peso del envio 
		public int asignarPuntos(Traslado traslado){//traslado y ver casteo para redondeo/ agregar  en voluntario /agregar) {
			return  (int) Math.ceil(traslado.getDistancia()*traslado.getEnvio().obtenerElPesoDelEnvio());		
		}
	
}
