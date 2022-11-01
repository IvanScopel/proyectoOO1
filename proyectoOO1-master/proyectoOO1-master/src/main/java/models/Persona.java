package models;

public abstract class Persona {

	private String nombre;
	private String dni;
	private String email;
	
	
	public Persona(String nombre, String dni, String email) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
	}
	
	
}
