package models;

import java.util.List;

public class Contacto {

	private String dni;
	private String email;
	private String telefono;
	private String nombre;
	private String apellido;
	
	public Contacto(String dni, String email, String telefono, String nombre, String apellido) {
		this.dni = dni;
		this.email = email;
		this.telefono= telefono;
		this.nombre = nombre;
		this.apellido= apellido;
	}
	
	public Contacto altaContacto(String dni, String email, String telefono, String nombre, String apellido) {
		return new Contacto(dni,  email,  telefono,  nombre,  apellido);
	}
	
}

