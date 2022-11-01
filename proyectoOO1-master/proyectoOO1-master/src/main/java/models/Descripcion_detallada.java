package models;

public class Descripcion_detallada extends Descripcion {
	
	private	Volumen volumen;
	private String caracteristicas;
	
	public Descripcion_detallada(String estado, String fechaDisponible, Volumen volumen, String caracteristicas) {
		super(estado, fechaDisponible);
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}
}
