package models;

import java.util.List;

public class Contacto extends Persona {

	private String apellido;
	private String telefono;
	
	public Contacto(String nombre, String dni, String email, String apellido, String telefono) {
		super(nombre, dni, email);
		
		this.apellido= apellido;
		this.telefono= telefono;
		
	}

}
