package models;

import java.util.ArrayList;
import java.util.List;

public class Beneficiario {
	
	private String nombre;
	private String direccion; //asumimos que para esta instancia, no era necesario declararlo por coordenadas
	private int cantPersonas;
	private List<Envio> envios;
	
	public Beneficiario(String nombre, String direccion, int cantPersonas) {
		this.nombre  = nombre;
		this.direccion = direccion;
		this.cantPersonas = cantPersonas;
		envios = new ArrayList<Envio>();
	}

	 
	//getters para testing
	public List<Envio> getEnvios() {
		return envios;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}
	
	//crea un envio y lo agrega al listdo de envios de la organizacion
	public void altaEnvio(Envio envio) {
		envios.add(envio);
		
	}
	
}
