package models;

import java.util.Date;

public class Donacion {
	
	private String estado;
	private Date fechaDisponible;
	private Descripcion descripcion;
	//hace falta ponerle estado?
	public Donacion(String estado, Date fechaDisponible, Descripcion descripcion) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
		this.descripcion=descripcion;
	}
	
	//setter
	public void setEstado(String estado) {
		this.estado = estado;
	}

	//cambia el estado de la donacion
	public void cambiarEstado(String estado) {
		this.setEstado(estado);
	}
	

}
