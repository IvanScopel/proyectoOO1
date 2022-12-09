package models;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String patente;
	private Volumen volumen;
	
	public Vehiculo(String marca, String modelo, String patente, Volumen volumen) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.volumen = volumen;
	}
	
	
	
	public double getVolumen() {
		return volumen.getVolumen();
	}
}