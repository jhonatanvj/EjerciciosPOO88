package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Masa;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		Masa persona1=new Masa();
		
			System.out.println("Ingrese la cantidad de kilos de una persona: ");
		persona1.setKilos(leer.nextDouble());
		
		persona1.conversionUnidades();
	
		leer.close();

	}

}
