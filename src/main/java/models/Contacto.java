package models;

import java.util.List;

public class Contacto {

	private String dni;
	private String email;
	private String telefono;
	private String nombre;
	private String apellido;
	
	private Contacto(String dni, String email, String telefono, String nombre, String apellido) {
		this.dni = dni;
		this.email = email;
		this.telefono= telefono;
		this.nombre = nombre;
		this.apellido= apellido;
	}

}
