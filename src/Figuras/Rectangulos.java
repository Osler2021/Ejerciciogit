package Figuras;

public class Rectangulos {

	private double ancho;
	private double alto;

	public Rectangulos(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}


	@Override
	public String toString() {
		return "Rectangulos [ancho=" + ancho + ", alto=" + alto + "]";
	}


	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
}
	public double getArea() {
		return this.alto + this.ancho;
	}
}
