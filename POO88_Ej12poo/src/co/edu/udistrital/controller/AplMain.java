package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Vehiculo;

public class AplMain {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		Vehiculo carro1 = new Vehiculo();

		System.out.println("Ingrese la aceleracion de vehiculo: ");
		carro1.setAceleracion(leer.nextDouble());
		System.out.println("Ingrese el tiempo del vehiculo; ");
		carro1.setTiempo(leer.nextDouble());

		carro1.calcularDistancia();

		leer.close();

	}

}
