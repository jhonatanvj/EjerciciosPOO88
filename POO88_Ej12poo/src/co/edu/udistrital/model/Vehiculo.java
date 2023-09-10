package co.edu.udistrital.model;

public class Vehiculo {
	private double distancia, aceleracion, tiempo;

	public double getDistancia() {
		return distancia;
	}

	public void setAceleracion(double aceleracion) {
		this.aceleracion = aceleracion;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public void calcularDistancia() {
		distancia = (0.5) * (aceleracion) * (Math.pow(tiempo, 2));

		System.out.println("La distancia recorrida por el vehiculo es de: " + distancia);

	}

}
