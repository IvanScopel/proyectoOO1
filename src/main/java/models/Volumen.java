package models;

public class Volumen {
	private Float x;
	private Float y;
	private Float Z;
	
	private Volumen(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.Z = z;
	}
	
	public Volumen altaVolumen(Float x, Float y, Float z) {
		return new Volumen( x,  y,  z);
	}
	
	
}
