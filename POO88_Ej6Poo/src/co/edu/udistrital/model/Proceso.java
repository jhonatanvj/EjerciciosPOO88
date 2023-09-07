package co.edu.udistrital.model;

public class Proceso {
	private int horas;
	private int minutos;
	private int segundos;
	private double precio;
	private int tsegundos;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public double getPrecio() {
		return precio;
	}

	public void pasarunidadesYSumar() {

		int has = horas * 3600;
		int mas = minutos * 60;
		tsegundos = has + mas + segundos;

	}

	public void calcularPrecio() {

		precio = tsegundos * 3.25;

	}

}
