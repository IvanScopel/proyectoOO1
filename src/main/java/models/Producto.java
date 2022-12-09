package models;

public class Producto {

	private String descripcion;
	private double kilosXUnidad;
	private int cantidad;
	
	
	
	public Producto(String descripcion, double kilos, int cantidad) {
		this.descripcion=descripcion;
		this.kilosXUnidad=kilos;
		this.cantidad = cantidad;
	}
	
}
