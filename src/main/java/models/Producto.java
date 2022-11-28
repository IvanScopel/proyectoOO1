package models;

public class Producto {

	private Alimento alimento;
	private int cantidad;
	
	private Producto(Alimento alimento, int cantidad) {
		this.alimento = alimento;
		this.cantidad = cantidad;
	}
	
	public Producto altaProducto(Alimento alimento, int cantidad) {
		return new Producto(alimento, cantidad);
	}
}
