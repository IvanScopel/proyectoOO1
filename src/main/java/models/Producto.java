package models;

public class Producto {

	private String descripcion;
	private int cantidad;
	
	
	
	public Producto(String descripcion, int cantidad) {
		this.descripcion=descripcion;
		this.cantidad = cantidad;
	}



	public String getDescripcion() {
		return descripcion;
	}


	public int getCantidad() {
		return cantidad;
	}
	
	
	
}
