package models;

public class ResumenEnvio {

	private String descripcion;
	private Double kilos;
	
	
	ResumenEnvio(String descripcion, Double kilos){
		this.descripcion = descripcion;
		this.kilos = kilos;
	}


	//para testing
	public Double getKilos() {
		return kilos;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
