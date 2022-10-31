package models;

public class Beneficiario {
	
	private String nombre;
	private String direccion;
	private int cantPersonas;
	
	private Beneficiario(String nombre, String direccion) {
		this.nombre  = nombre;
		this.direccion = direccion;
		cantPersonas = 0;
	}

	public Beneficiario altaBeneficiario(String nombre, String direccion) {
		return new Beneficiario(nombre, direccion);
	}
}
