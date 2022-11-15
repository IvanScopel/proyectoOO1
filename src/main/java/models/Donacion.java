package models;

public class Donacion {
	
	private String estado;
	private String fechaDisponible;
	
	private Donacion(String estado, String fechaDisponible) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
	}
	
	public Donacion altaDonacion(String estado, String fechaDisponible) {
		return new Donacion(estado ,fechaDisponible);
	}
	
	
}
