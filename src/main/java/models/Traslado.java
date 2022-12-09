package models;

import java.util.Date;

public class Traslado {
	private String comentario;
	private Date fechaAsignacion;
	private Date fechaTraslado;
	private Date trasladoEfectuado;
	private Envio envio;
	//el volumen lo saca de envio
	public Traslado(String comentario, Envio envio, Date fechaTraslado) {
		this.comentario = comentario;
		this.fechaAsignacion = new Date();
		this.fechaTraslado = fechaTraslado;
		this.envio = envio;
	}
	
}
