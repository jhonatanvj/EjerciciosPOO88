package co.edu.udistrital.model;

public class Masa {
	private double kilos, gramos, libras, toneladas;

	public void conversionUnidades() {

		gramos = kilos * 1000;
		libras = kilos * 2.205;
		toneladas = kilos / 1000;
		System.out.println("El valor de " + kilos + " a gramos es: " + gramos);
		System.out.println("El valor de " + kilos + " a libras es: " + libras);
		System.out.println("El valor de " + kilos + " a toneladas es: " + toneladas);

	}

	public double getKilos() {
		return kilos;
	}

	public void setKilos(double kilos) {
		this.kilos = kilos;
	}

	public double getGramos() {
		return gramos;
	}

	public double getLibras() {
		return libras;
	}

	public double getToneladas() {
		return toneladas;
	}

}
