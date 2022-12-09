package models;

import java.util.ArrayList;
import java.util.List;

public class Beneficiario {
	
	private String nombre;
	private String direccion;
	private int cantPersonas;
	private List<Envio> envios;
	
	public Beneficiario(String nombre, String direccion, int cantPersonas) {
		this.nombre  = nombre;
		this.direccion = direccion;
		this.cantPersonas = cantPersonas;
		envios = new ArrayList<Envio>();
	}

	
	public void altaEnvio(ArrayList<Producto> productos, Donacion donacion, Volumen volumen) {
		envios.add(new Envio(productos, donacion, volumen));
		
	}
}
