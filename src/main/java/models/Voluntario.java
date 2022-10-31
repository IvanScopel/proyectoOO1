package models;

public class Voluntario extends Persona {

	private String whatsapp;
	private String direccion_estable;
	
	public Voluntario(String nombre, String dni, String email, String whatsapp, String direccion_estable) {
		super(nombre, dni, email);
		this.whatsapp = whatsapp;
		this.direccion_estable = direccion_estable;
		
	}
	public Voluntario altaVoluntario(String nombre, String dni, String email, String whatsapp, String direccion_estable) {
		return new Voluntario(nombre,dni,email,whatsapp,direccion_estable);
	}

}
