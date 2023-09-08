package co.edu.udistrital.model;

public class Longitud {

	private double metros;
	private double pies;
	private double pulgadas;

	public void conversionUnidad() {

		pies = metros * 3.281;
		pulgadas = metros * 39.37;
		System.out.println("La convercion de " + metros + " a pies es: " + pies);
		System.out.println("La convercion de " + metros + " a pulgadas es: " + pulgadas);

	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public double getPies() {
		return pies;
	}

	public double getPulgadas() {
		return pulgadas;
	}

}
