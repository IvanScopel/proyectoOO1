package models;

import java.util.List;

public class Detallada implements Descripcion {
	
	private List<Alimento> alimentos;
	
	private Detallada(String estado, String fechaDisponible, List<Alimento> alimento) {
		this.alimentos = alimento;
	}
	
	
	
	public void altaAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
}
