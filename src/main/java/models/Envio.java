package models;

import java.util.ArrayList;
import java.util.List;

public class Envio {

	public List<Producto> productos;
	public Donacion donacion;
	public Volumen volumen;
	private static int contador;
	private int id;
	
	public Envio(ArrayList<Producto> productos, Donacion donacion, Volumen volumen) {
		this.productos = productos;
		this.donacion = donacion;
		this.volumen = volumen;
		this.id = contador;
		contador++;
		
	};
}
