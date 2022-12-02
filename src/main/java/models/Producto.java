package models;

public class Producto {

	private String descripcion;
	private double kilos;
	private int cantidad;
	
	
	
	private Producto(String descripcion, double kilos, int cantidad) {
		this.descripcion=descripcion;
		this.kilos=kilos;
		this.cantidad = cantidad;
	}
	
	public Producto altaProducto(String descripcion, double kilos, int cantidad) {
		return new Producto(descripcion, kilos, cantidad);
	}
}
