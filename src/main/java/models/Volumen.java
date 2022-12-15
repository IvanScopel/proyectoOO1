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
	
	
	
	// para test
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	//retorna el volumen de un prisma rectangular
	public double getVolumen() {
		return x*y*z;
	}
	
}
