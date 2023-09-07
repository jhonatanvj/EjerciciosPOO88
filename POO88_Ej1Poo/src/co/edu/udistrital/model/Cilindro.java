package co.edu.udistrital.model;

public class Cilindro {

	private double radio;
	private double altura;
	private double volumen;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return volumen;
	}

	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + ", volumen=" + volumen + "]";
	}

	public void calcularVolumen() {
		volumen = ((Math.PI) * (Math.pow(radio, 2)) * (altura));

	}

}
