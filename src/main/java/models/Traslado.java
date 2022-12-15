package models;

import java.time.LocalDate;

public class Traslado {
	private String comentario;
	private LocalDate fechaAsignacion;
	private LocalDate fechaTraslado;
	private LocalDate trasladoEfectuado;
	private Envio envio;
	private Double distancia;
	//el volumen lo saca de envio
	public Traslado(String comentario, Envio envio, LocalDate fechaTraslado, Double distancia) {
		this.comentario = comentario;
		this.fechaAsignacion = LocalDate.now();
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

	public String getComentario() {
		return comentario;
	}

	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}

	public LocalDate getFechaTraslado() {
		return fechaTraslado;
	}

	public LocalDate getTrasladoEfectuado() {
		return trasladoEfectuado;
	}
	
	
	//el enunciado pide un método que devuelva la distancia entre dos coordenadas.
	//tomamos en cuenta este caso, pero lo resolvimos con un atributo "distancia" 
	//para que no sea un unico resultado en caso de instanciar varios traslados
	public int calcularDistancia(Double[] latLongDesde, Double[] latLonghasta) {
		return  (int) Math.random()*15;
	}
	
	
	
	
	
}
