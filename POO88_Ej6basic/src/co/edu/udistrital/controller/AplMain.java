package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de horas del proceso: ");
		int horas = leer.nextInt();
		leer.nextLine();
		System.out.println("Ingrese la cantidad de minutos del proceso: ");
		int minutos = leer.nextInt();
		leer.nextLine();
		System.out.println("Ingrese la cantidad de segundos del proceso: ");
		int segundos = leer.nextInt();
		leer.nextLine();
		int has = horas * 3600;
		int mas = minutos * 60;
		int tsegundos = has + mas + segundos;
		double precio = tsegundos * 3.25;
		System.out.println("El costo total de proceso es: " + precio);
		leer.close();
	}

}
