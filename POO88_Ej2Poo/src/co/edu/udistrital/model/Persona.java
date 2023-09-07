package co.edu.udistrital.model;

public class Persona {
private double prestamo;

public double getPrestamo() {
	return prestamo;
}

public void setPrestamo(double prestamo) {
	this.prestamo = prestamo;
}

public void sacarResultado() {
	double interesanio = (prestamo * 27) / 100;
	
	double interesmes = interesanio / 12;
	double tpagar = prestamo + interesanio;
	System.out.println("La persona debera pagar mensual: " + interesmes);
	System.out.println("El total a pagar de la persona es: " + tpagar);
}







}
