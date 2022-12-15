package models;

public class DescripcionGeneral implements Descripcion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	public DescripcionGeneral( Volumen volumen, String caracteristicas) {
		
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}

	//getters para testing
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public Volumen getVolumen() {
		return volumen;
	}
	
	

}
