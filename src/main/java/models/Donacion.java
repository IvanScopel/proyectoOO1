package models;

import java.time.LocalDate;

public class Donacion {
	
	private String estado;
	private LocalDate fechaDisponible;
	private Descripcion descripcion;
	
	public Donacion(String estado, LocalDate fechaDisponible, Descripcion descripcion) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
		this.descripcion=descripcion;
	}
	
	//setter
	private void setEstado(String estado) {
		this.estado = estado;
	}

	//getter para testing
	public String getEstado() {
		return estado;
	}
		
	//cambia el estado de la donacion
	public void cambiarEstado(String estado) {
		this.setEstado(estado);
	}

	
	
	
	
	

}
