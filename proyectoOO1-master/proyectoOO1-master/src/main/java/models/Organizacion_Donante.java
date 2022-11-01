package models;

import java.util.List;

public class Organizacion_Donante {

	
	private String razon_social;
	private String cuil;
	private String direccion;
	private List<Contacto> contactos;

	public Organizacion_Donante(String razon_social, String cuil, String direccion, List<Contacto> contactos) {
		this.razon_social = razon_social;
		this.cuil = cuil;
		this.direccion = direccion;
		this.contactos = contactos;
	}
}
