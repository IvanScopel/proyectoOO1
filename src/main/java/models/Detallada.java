package models;

import java.util.List;

public class Detallada extends Descripcion {
	
	private List<Producto> productos;
	
	private Detallada(String estado, String fechaDisponible, List<Producto> productos) {
		this.productos = productos;
	}
	
	public Detallada altaDescripcionDetallada(String estado, String fechaDisponible, List<Producto> productos) {
		return new Detallada(estado, fechaDisponible, productos);
	}
}
