package co.edu.udistrital.model;

public class Moneda {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void conversionmoneda() {

		double dolar = valor / 2950;
		double euro = valor / 3450;
		System.out.println(valor + " pesos colombianos son: " + dolar);
		System.out.println(valor + " pesos colombianos son: " + euro);

	}

}
