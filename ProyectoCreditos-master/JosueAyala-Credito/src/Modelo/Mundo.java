package Modelo;

public class Mundo {
	
	private Credito credito;
	
	
	public Mundo(int periodo,double interes,double inversion) {
		
		credito=new Credito(periodo, interes, inversion);		
	}	

	public void calcularValores() {
		credito.calcularTasaEfectiva();
		credito.calcularValorAnual();
		credito.calcularValorCuota();
		credito.calcularIntereses();
		credito.calcularArmotizacion();				
	}
	
	public String tabla() {
		return credito.hacerTabla();
	}
	
	


}
