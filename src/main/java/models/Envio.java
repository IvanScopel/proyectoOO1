package models;

import java.util.ArrayList;
import java.util.List;

public class Envio {

	private List<Producto> productos;
	private Donacion donacion;
	private Volumen volumen;
	private String estado;
	private ResumenEnvio resumenEnvio; 
	private static int contador;
	private int id;
	
	public Envio(ArrayList<Producto> productos, Donacion donacion, Volumen volumen, ResumenEnvio resumenEnvio) {
		this.productos = productos;
		this.donacion = donacion;
		this.volumen = volumen;
		this.estado = "pendiente de retiro";
		this.resumenEnvio = resumenEnvio;
		this.id = contador;
		contador++;
		
	};
	
	public void cambiarEstado(String estado) {
		this.estado = estado;
		if (donacion != null) {
			donacion.cambiarEstado(estado);
		}
	}
	
	public String getEstado() {
		return estado;
	}
}
