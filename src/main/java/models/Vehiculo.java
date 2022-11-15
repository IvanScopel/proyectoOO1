package models;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String patente;
	private Volumen volumen;
	
	private Vehiculo(String marca, String modelo, String patente, Volumen volumen) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.volumen = volumen;
	}
	
	public Vehiculo altaVehiculo(String marca, String modelo, String patente, Volumen volumen) {
		return new Vehiculo( marca,  modelo,  patente,  volumen);
	}
	
	
}