package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double x1,x2,y1,y2,distancia;
		
		System.out.println("Ingrese los valores del primer punto");
		System.out.println("X1:");
		x1=leer.nextDouble();
		System.out.println("Y1:");
		y1=leer.nextDouble();
		System.out.println("Ingrese los valores del segundo punto");
		System.out.println("X2:");
		x2=leer.nextDouble();
		System.out.println("Y2:");
		y2=leer.nextDouble();
		
		distancia=Math.pow((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)), 0.5);

		System.out.println("La distancia entre los dos puntos es: "+distancia);
		
		leer.close();

	}

}
