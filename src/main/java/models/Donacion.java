package models;

public abstract class Donacion {
	
	private String estado;
	private String fechaDisponible;
	
	public Donacion(String estado, String fechaDisponible) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
	}
	
	
}
