package models;

public class ResumenEnvio {

	private String descripcion;
	private Double kilos;
	
	
	ResumenEnvio(String descripcion, Double kilos){
		this.descripcion = descripcion;
		this.kilos = kilos;
	}


	public Double getKilos() {
		return kilos;
	}
	
	
}
