package models;

public class Volumen {
	private double x;
	private double y;
	private double z;
	
	public Volumen(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Volumen altaVolumen(double x, double y, double z) {
		return new Volumen( x,  y,  z);
	}
	
	//retorna el volumen de un prisma rectangular
	public double getVolumen() {
		return x*y*z;
	}
	
}
