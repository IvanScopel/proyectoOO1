package models;

import java.util.List;

public class Descripcion_detallada extends Donacion {
	
	private List<Producto> productos;
	
	private Descripcion_detallada(String estado, String fechaDisponible, List<Producto> productos) {
		super(estado, fechaDisponible);
		this.productos = productos;
	}
	
	public Descripcion_detallada crearDonacionDetallada(String estado, String fechaDisponible, List<Producto> productos) {
		return new Descripcion_detallada(estado, fechaDisponible, productos);
	}
}
