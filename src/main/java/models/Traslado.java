package models;

import java.util.Date;

public class Traslado {
	private String comentario;
	private Date fechaAsignacion;
	private Date fechaTraslado;
	private Date trasladoEfectuado;
	private Envio envio;
	private Double distancia;
	//el volumen lo saca de envio
	public Traslado(String comentario, Envio envio, Date fechaTraslado, Double distancia) {
		this.comentario = comentario;
		this.fechaAsignacion = new Date();
		this.fechaTraslado = fechaTraslado;
		this.envio = envio;
		this.distancia= distancia;
	}
	
	public void cambiarEstadoDeEnvio(String estado){
		envio.cambiarEstado(estado);
	}
	
	public void confirmarTraslado() {
		envio.cambiarEstado("entregado");
	}

	public Envio getEnvio() {
		return envio;
	}
	
	//test
	public Double getDistancia() {
		return distancia;
	}
	
	
	
}
