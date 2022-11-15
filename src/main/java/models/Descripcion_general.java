package models;

public class Descripcion_general extends Donacion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	private Descripcion_general(String estado, String fechaDisponible, Volumen volumen, String caracteristicas) {
		super(estado, fechaDisponible);
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}


	public Descripcion_general crearDonacionGeneral(String estado, String fechaDisponible, Volumen volumen, String caracteristicas) {
		return new Descripcion_general(estado, fechaDisponible, volumen, caracteristicas);
	}


}
