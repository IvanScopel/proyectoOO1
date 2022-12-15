package models;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String patente;
	private Volumen capacidad;
	
	public Vehiculo(String marca, String modelo, String patente, Volumen volumen) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidad = volumen;
	}
	
	
	
	
	// para test
	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getPatente() {
		return patente;
	}

	public Volumen getVolumenVar() {
		return capacidad;
	}

	public double getCapacidad() {
		return capacidad.getVolumen();
	}
}