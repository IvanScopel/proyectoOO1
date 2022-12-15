package models;

import java.time.LocalDate;

public class Insignia {

	private TipoInsignia tipoInsignia;
	private LocalDate fechaOtorgada;
	private LocalDate fechaVencimiento;
	
	public Insignia(TipoInsignia tipoInsignia, LocalDate fechaOtorgada, LocalDate fechaVencimiento) {
		this.tipoInsignia = tipoInsignia;
		this.fechaOtorgada = fechaOtorgada;
		this.fechaVencimiento = fechaVencimiento;
	}

	
	//para testing
	public TipoInsignia getTipoInsignia() {
		return tipoInsignia;
	}

	public LocalDate getFechaOtorgada() {
		return fechaOtorgada;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	
}