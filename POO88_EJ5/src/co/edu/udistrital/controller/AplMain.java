package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		double radio, altura, volumen;
		
		radio = 0.0;
		altura = 0.0;
		volumen = 0.0;
		
		System.out.println("Digite radio: ");
		radio = leer.nextDouble();
		
		System.out.println("Digite altura: ");
		altura = leer.nextDouble();
		
		volumen = (Math.PI * Math.pow(radio, 2) * altura);
		
		System.out.println("El volumen del cilindro es " + volumen);
		
	}

}








