package models;

import java.util.Date;

public class Insignia {

	private TipoInsignia tipoInsignia;
	private Date fechaOtorgada;
	private Date fechaVencimiento;
	
	public Insignia(TipoInsignia tipoInsignia, Date fechaOtorgada, Date fechaVencimiento) {
		this.tipoInsignia = tipoInsignia;
		this.fechaOtorgada = fechaOtorgada;
		this.fechaVencimiento = fechaVencimiento;
	}
}