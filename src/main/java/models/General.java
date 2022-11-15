package models;

public class General extends Descripcion {
	
	private Volumen volumen;
	private String caracteristicas;
	
	private General( Volumen volumen, String caracteristicas) {
		
		this.volumen=volumen;
		this.caracteristicas=caracteristicas;
	}


	public General crearDescripcionGeneral(String estado, String fechaDisponible, Volumen volumen, String caracteristicas) {
		return new General(volumen, caracteristicas);
	}


}
