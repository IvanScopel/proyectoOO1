package models;

public class General implements Descripcion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	private General( Volumen volumen, String caracteristicas) {
		
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}


}
