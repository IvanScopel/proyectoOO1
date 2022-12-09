package models;

import java.util.Date;

public class Donacion {
	
	private String estado;
	private Date fechaDisponible;
	private Descripcion descripcion;
	
	public Donacion(String estado, Date fechaDisponible, Descripcion descripcion) {
		this.estado=estado;
		this.fechaDisponible=fechaDisponible;
		this.descripcion=descripcion;
	}
	
	
	public void cambiarEstado(String estado) {
		this.estado = estado;
	}
	

}
