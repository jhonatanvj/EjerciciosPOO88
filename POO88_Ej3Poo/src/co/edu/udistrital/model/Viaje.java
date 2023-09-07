package co.edu.udistrital.model;

public class Viaje {
	private double km;
	private double precio;

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getPrecio() {
		return precio;
	}

	public void sacarPrecio() {

		precio = km * 120;
		System.out.println("El precio del viaje es: "+precio);

	}

}
