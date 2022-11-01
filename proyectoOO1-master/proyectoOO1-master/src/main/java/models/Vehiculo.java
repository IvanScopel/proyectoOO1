package models;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String patente;
	private Volumen volumen;
	
	public Vehiculo(String marca, String modelo, String patente,Float x, Float y, Float z) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.volumen = new Volumen(x,y,z);
	}
	
	
}
