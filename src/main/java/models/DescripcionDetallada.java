package models;

import java.util.List;

public class DescripcionDetallada implements Descripcion {
	
	private List<Producto> productos;
	
	private DescripcionDetallada(List<Producto> productos) {
		this.productos = productos;
	}
	
	//Crea un detalle y lo retorna
	public DescripcionDetallada altaDescripcionDetallada(List<Producto> productos) {
		return new DescripcionDetallada(productos );
	}
	
	
	//agrega un alimento a la lista de alimentos
	public void altaAlimento(Producto producto) {
		productos.add(producto);
	}
	
}
