package models;

public class Descripcion_general extends Descripcion {
	
	private String caracteristicas;
	
	public Descripcion_general(String estado, String fechaDisponible,String caracteristicas) {
		super(estado, fechaDisponible);
		this.caracteristicas=caracteristicas;
	}

	

}
