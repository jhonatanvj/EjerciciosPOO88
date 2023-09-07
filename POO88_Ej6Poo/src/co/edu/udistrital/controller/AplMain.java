package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Proceso;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Proceso a = new Proceso();

		System.out.println("Ingrese la cantidad de horas del proceso: ");
		a.setHoras(leer.nextInt());
		leer.nextLine();
		System.out.println("Ingrese la cantidad de minutos del proceso: ");
		a.setMinutos(leer.nextInt());
		leer.nextLine();
		System.out.println("Ingrese la cantidad de segundos del proceso: ");
		a.setSegundos(leer.nextInt());
		leer.nextLine();
		a.pasarunidadesYSumar();
		a.calcularPrecio();
		System.out.println("El costo total de proceso es: " + a.getPrecio());
		leer.close();
	}

}
