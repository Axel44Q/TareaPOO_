package Dimensiones;

public class dimension {
	private double ancho, alto, prof;
	
	
	public dimension(double ancho, double alto, double prof) {
		this.ancho = ancho;
		this.alto = alto;
		this.prof = prof;
	}

	public dimension() {
		
		this.ancho = 0;
		this.alto = 0;
		this.prof = 0;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public double getProf() {
		return prof;
	}


	public void setProf(double prof) {
		this.prof = prof;
	}

	public double getVolumen() {
		double devolver = alto * ancho * prof;
		return devolver;
	}
	
	public String toString() {
		String devolver;
		devolver = (alto +" " +ancho+" "+prof);
		return devolver;
	}
	
	
}
