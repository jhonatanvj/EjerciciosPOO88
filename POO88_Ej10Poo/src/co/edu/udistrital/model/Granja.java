package co.edu.udistrital.model;

public class Granja {
	
	private double pollos,vacas,totalanimales,totalpatas;

	public double getTotalanimales() {
		return totalanimales;
	}

	public void setTotalanimales(double totalanimales) {
		this.totalanimales = totalanimales;
	}

	public double getTotalpatas() {
		return totalpatas;
	}

	public void setTotalpatas(double totalpatas) {
		this.totalpatas = totalpatas;
	}

	public double getPollos() {
		return pollos;
	}

	public double getVacas() {
		return vacas;
	}
	
	
	public void calculoAnimales() {
		
		vacas = (totalpatas - (totalanimales * 2)) / 2;
		pollos = totalanimales - vacas;

		if (pollos >= 0 && vacas >= 0) {
			System.out.println("Número de pollos: " + pollos);
			System.out.println("Número de vacas: " + vacas);
		} else {
			System.out.println("No se encontró una solución válida.");
		}
		
		
		
	}
	
	
	

}
