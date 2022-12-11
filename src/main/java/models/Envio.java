package models;

import java.util.ArrayList;
import java.util.List;

public class Envio {

	private List<Producto> productos;
	private Donacion donacion;
	private Volumen volumen;
	private String estado;
	private List<ResumenEnvio> resumenEnvio; 
	private static int contador;
	private int id;
	
	//constructor
	public Envio(ArrayList<Producto> productos, Donacion donacion, Volumen volumen, ArrayList<ResumenEnvio> resumenEnvio) {
		this.productos = productos;
		this.donacion = donacion;
		this.volumen = volumen;
		this.estado = "pendiente de retiro";
		this.resumenEnvio = resumenEnvio;
		this.id = contador;
		contador++;
		
	};
	
	//
	public void cambiarEstado(String estado) {
		 this.setEstado(estado);
		if (donacion != null) {
			donacion.cambiarEstado(estado);
		}
	}
	
	private void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
	
	public double obtenerElPesoDelEnvio() {
		return resumenEnvio.stream().mapToDouble(ResumenEnvio::getKilos).sum();
		
		 
	}
}
