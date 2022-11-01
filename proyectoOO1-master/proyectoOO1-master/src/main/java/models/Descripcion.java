package models;

public abstract class Descripcion {
	private String estado;
	private String fechaDisponible;
	
	public Descripcion(String estado, String fechaDisponible) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
	}
}
