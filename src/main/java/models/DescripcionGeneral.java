package models;

public class DescripcionGeneral implements Descripcion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	public DescripcionGeneral( Volumen volumen, String caracteristicas) {
		
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}
	
	

}
