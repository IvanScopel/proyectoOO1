package models;

public class DescripcionGeneral implements Descripcion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	private DescripcionGeneral( Volumen volumen, String caracteristicas) {
		
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}
	
	public DescripcionGeneral altaDescripcionGeneral(Volumen volumen, String caracteristicas) {
		return new DescripcionGeneral(volumen, caracteristicas);
	}

}
