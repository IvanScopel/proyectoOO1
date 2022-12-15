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
}