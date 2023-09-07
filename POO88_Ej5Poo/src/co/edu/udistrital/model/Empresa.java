package co.edu.udistrital.model;

public class Empresa {
	private double presu;

	public double getPresu() {
		return presu;
	}

	public void setPresu(double presu) {
		this.presu = presu;
	}
	
	public void sacarPresupuesto() {
		
		double urgencias=(presu*0.37);
		double pedriatia=(presu*0.42);
		double traumatologia=(presu*0.21);
		System.out.println("El presupuesto de urgencias es de:"+urgencias);
		System.out.println("El presupuesto de predriatia es de:"+pedriatia);
		System.out.println("El presupuesto de traumatologia es de:"+traumatologia);
		
		
		
	}
	
	

}
