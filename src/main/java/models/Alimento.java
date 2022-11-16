package models;

public class Alimento {
	
	private String descripcion;
	private double kilos;
	
	private Alimento(String descripcion, double kilos) {
		this.descripcion = descripcion;
		this.kilos = kilos;
	}
	
	public Alimento altaAlimento(String descripcion, double kilos) {
		return new Alimento(descripcion,  kilos);
	}

}
