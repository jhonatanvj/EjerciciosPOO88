package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Longitud;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Longitud medida1=new Longitud();
		


		System.out.println("Ingrese la cantidad de metros: ");
		medida1.setMetros(leer.nextDouble());
		medida1.conversionUnidad();

		leer.close();

	}

}
