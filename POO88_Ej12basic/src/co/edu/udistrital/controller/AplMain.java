package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		double distancia, tiempo, aceleracion;

		System.out.println("Ingrese la aceleracion de vehiculo: ");
		aceleracion = leer.nextDouble();
		System.out.println("Ingrese el tiempo del vehiculo; ");
		tiempo = leer.nextDouble();

		distancia = (0.5) * (aceleracion) * (Math.pow(tiempo, 2));

		System.out.println("La distancia recorrida por el vehiculo es de: " + distancia);

		leer.close();
	}

}
