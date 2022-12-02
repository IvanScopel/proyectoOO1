package models;

public class Beneficiario {
	
	private String nombre;
	private String direccion;
	private int cantPersonas;
	
	public Beneficiario(String nombre, String direccion, int cantPersonas) {
		this.nombre  = nombre;
		this.direccion = direccion;
		this.cantPersonas = cantPersonas;
	}

	public Beneficiario altaBeneficiario(String nombre, String direccion, int cantPersonas) {
		return new Beneficiario(nombre, direccion, cantPersonas);
	}
}
