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
	public Envio(List<Producto> productos, Donacion donacion, Volumen volumen, List<ResumenEnvio> resumenEnvio) {
		this.productos = productos;
		this.donacion = donacion;
		this.volumen = volumen;
		this.estado = "pendiente de retiro";
		this.resumenEnvio = resumenEnvio;
		this.id = contador;
		contador++;
		
	};
	
	
	//setter
	private void setEstado(String estado) {
		this.estado = estado;
	}
	//getter
	public String getEstado() {
		return estado;
	}
	
	//para test---------------------------------------
	public Donacion getDonacion() {
		return donacion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public Volumen getVolumen() {
		return volumen;
	}
	public List<ResumenEnvio> getResumenEnvio() {
		return resumenEnvio;
	}

	public int getId() {
		return id;
	}
	
	//cambia de estado al envio y si tiene donacion tambien
	public void cambiarEstado(String estado) {
		 this.setEstado(estado);
		if (this.donacion != null) {
			donacion.cambiarEstado(estado);
		}
	}
	
	//Este metodo obtiene el peso del envio sumando el resumen de envio y le reduce los decimales
		public double obtenerElPesoDelEnvio() {
			return Math.round(resumenEnvio.stream().mapToDouble(ResumenEnvio::getKilos).sum() * 100.0) / 100.0;
		}
	
	
}
