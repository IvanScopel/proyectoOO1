package models;

public class Voluntario {

	private String dni;
	private String nombre;
	private String email;
	private String telefono;
	private String direccion_estable;
	private Vehiculo vehiculo;
	
	
	private Voluntario(String nombre, String dni, String email, String telefono, String direccion_estable, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.direccion_estable = direccion_estable;
		this.vehiculo = vehiculo;
	}
		
	public Voluntario altaVoluntario(String nombre, String dni, String email, String whatsapp, String direccion_estable,Vehiculo vehiculo) {
		return new Voluntario(nombre,dni,email,whatsapp,direccion_estable,vehiculo);
	}
	//retorna si posee vehiculo en caso contrario retorna null
	public Vehiculo getVehiculo(){
		if(vehiculo!=null) return vehiculo;
		return null;
	}
	
}
