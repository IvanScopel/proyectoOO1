package models;

import java.util.List;

public class Detallada extends Descripcion {
	
	private List<Alimento> alimentos;
	
	private Detallada(String estado, String fechaDisponible, List<Alimento> alimento) {
		this.alimentos = alimento;
	}
	
	public Detallada altaDescripcionDetallada(String estado, String fechaDisponible, List<Alimento> alimento) {
		return new Detallada(estado, fechaDisponible, alimento);
	}
	
	public void altaAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
}
