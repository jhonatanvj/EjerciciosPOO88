package co.edu.udistrital.controler;

import java.util.Scanner;

import co.edu.udistrital.model.Viaje;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		Viaje a = new Viaje();

		System.out.println("Ingrese la cantidad de km del viaje: ");
		a.setKm(leer.nextDouble());
		a.sacarPrecio();

		leer.close();

	}

}
