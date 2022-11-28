package models;

public class Donacion {
	
	private String estado;
	private String fechaDisponible;
	private Descripcion descripcion;
	
	private Donacion(String estado, String fechaDisponible, Descripcion descripcion) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
		this.descripcion=descripcion;
	}
	
	public Donacion altaDonacion(String estado, String fechaDisponible, Descripcion descripcion) {
		return new Donacion(estado ,fechaDisponible, descripcion);
	}
	
	
}
