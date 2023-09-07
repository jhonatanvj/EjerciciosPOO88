package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Empresa;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		Empresa a=new Empresa();
		
		System.out.println("Ingrese el monto presupuestal: ");
		a.setPresu(leer.nextDouble());
		a.sacarPresupuesto();
		
		leer.close();
		

	}

}
