package Modelo;

import java.text.DecimalFormat;

public class Mundo {
	
	private int periodo;
	private double interesTotal;
	private double inversion;
	private double tasaEfectiva;
	private double valorAnualidad;
	private double cuota;
	private double intereses;
	private double saldoPesos; 
	private double amortizacion;
	
	public Mundo(int periodo, double interes, double inversion) {
		
		this.interesTotal = interes;
		this.periodo = periodo;
		this.inversion = inversion;
		saldoPesos = inversion;
		calcularTasaEfectiva();
		calcularAnualidad();
		calcularValorCuota();
		
	}
	
	public void calcularTasaEfectiva() {
		
		tasaEfectiva = (Math.pow(1.0+interesTotal, 1.0/12.0))-1.0;
	}
	
	
	public void calcularAnualidad() {
		
		valorAnualidad = (1.0-(Math.pow(1.0+tasaEfectiva, -periodo*1.0)))/tasaEfectiva;
	}
	
	public void calcularValorCuota() {
		
		cuota = this.inversion/this.valorAnualidad;
	}
	
	public void calcularIntereses() {
		
		intereses = saldoPesos*tasaEfectiva;
	}
	
	public void calcularAmortizacion() {
		
		amortizacion = cuota-intereses;
	}

	public void setSaldoPesos() {
		
		this.saldoPesos = saldoPesos-amortizacion;
	}
	
	public String construirValores(){
		
		DecimalFormat df = new DecimalFormat("#.00");
		String valores;
		valores = periodo + " " + df.format(interesTotal*100)+"%" + " " +"$"+df.format(inversion) + " " + df.format(tasaEfectiva*100)+"%"+ " " + df.format(valorAnualidad)+" "+"$"+df.format(cuota);  
		return valores; 
	}
	
	public String calcularTabla(){
		
		DecimalFormat df = new DecimalFormat("#.00");
		String tabla;
		tabla = " --Cuota-- " + " --Saldo Pesos-- " + " --cuota Pesos-- " + " --Intereses-- " + " --Amortizacion-- " + "\n";
		tabla += "  0 ---- " + df.format(saldoPesos) + " ----------- " + " --------- " + " ------------ "+"\n";
		for(int i = 1; i<=periodo;i++){
			calcularIntereses();
			calcularAmortizacion();
			setSaldoPesos();
			tabla += i + " ----- " + df.format(saldoPesos) + " ---- "+ df.format(cuota) + " ---- " + df.format(intereses) + " ---- " +df.format(amortizacion) + "\n"; 
		}
		return tabla;
		
	}
}
