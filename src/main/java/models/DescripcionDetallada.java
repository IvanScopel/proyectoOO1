package models;

import java.util.List;

public class DescripcionDetallada implements Descripcion {
	
	private List<Producto> productos;
	
	public DescripcionDetallada(List<Producto> productos) {
		this.productos = productos;
	}
		
	//agrega un alimento a la lista de alimentos
	public void altaAlimento(Producto producto) {
		productos.add(producto);
	}
	
}
