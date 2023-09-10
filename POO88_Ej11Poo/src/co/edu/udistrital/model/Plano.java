package co.edu.udistrital.model;

public class Plano {
	private double x1, x2, y1, y2, distancia;

	public double getDistancia() {
		return distancia;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public void calcularDistancia() {

		distancia = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)), 0.5);

		System.out.println("La distancia entre los dos puntos es: " + distancia);

	}

}
