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

	
	
	
	// getters para testing
	public String getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	
}

