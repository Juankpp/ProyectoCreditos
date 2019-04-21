package Modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Credito {
	
	private double valorCredito;
	private double valorAnualidad;
	private int time;
	private double intereses;
	private double tasaEfectiva;
	private double []cConstante;
	private double cuota;
	public Credito(double vCredito, int time, double intereses )
	{
		this.valorCredito=vCredito;
		this.time=time;
		this.intereses=intereses/100;
		cConstante= new double[5];
		
		
		tasaEfectiva=calcularTasaEfectiva();
		valorAnualidad=calcularValorAnual();
		this.cuota=calcularCuota();
	}
	public double calcularTasaEfectiva() {
		double rta=0;
		rta=(1+this.intereses);
		rta=(double)Math.pow(rta, 0.083333333);
		return rta-1;
	}
	public double calcularValorAnual() {
		double rta=0;
		
		rta=1+this.tasaEfectiva;
		rta=Math.pow(rta, -1*this.time);
		rta=(1-rta)/this.tasaEfectiva;
		
		return rta;
		
	}
	public double calcularCuota() {
		double rta =0;
		rta=valorCredito/valorAnualidad;
		return rta;
	}
	public double calcularElInteres(double saldoPesos)
	{
		double rta=0;
		rta=saldoPesos*tasaEfectiva;
		return rta;
	}
	public double calcularAmortizacion(double saldo,double interest) {
		double rta=0;
		rta=saldo-interest;
		return rta;
	}
	public double calcularSaldoPesos(double saldoAnterior,double amortizacion) {
		double rta=0;
		rta=saldoAnterior-amortizacion;
		return rta;
	}
	public String calcularCutaConstante() {
		NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
		NumberFormat f2 = NumberFormat.getNumberInstance();
		
		double aux=0;
		double amort =0;
		String rta="";
		int i=0;
		double costo=this.valorCredito;
		rta+="[0]"+"\t"+"["+formatoImporte.format(this.valorCredito)+"]"+"\r\n";
		while(i<this.time) {
		
			
			cConstante[0]=i+1;
			cConstante[3]=calcularElInteres(costo);
			cConstante[2]=this.cuota;
			aux=calcularElInteres(costo);
			cConstante[4]=calcularAmortizacion(cuota,aux );
			amort=calcularAmortizacion(cuota,aux );
			cConstante[1]=calcularSaldoPesos(costo, amort);
			costo=cConstante[1]=calcularSaldoPesos(costo, amort);
			i++;
			rta+="["+f2.format(cConstante[0])+"]" +"\t"+ "["+formatoImporte.format(cConstante[1])+"]" +"\t"+ "["+formatoImporte.format(cConstante[2])+"]" +"\t"+ "["+formatoImporte.format(cConstante[3])+"]" +"\t"+ "["+formatoImporte.format(cConstante[4])+"]"+"\r\n";
			
			
			}
		
		return rta;
	}
	public String imprimirCredito(){
		NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
		NumberFormat formatoper = NumberFormat.getPercentInstance();
		DecimalFormat dc = new DecimalFormat("#0.00");
		String rta="";
		
		rta+="periodo : "+this.time+"\r\n";
		rta+="intereses : "+dc.format(this.intereses*100)+"%"+"\r\n";
		rta+="inversion : "+formatoImporte.format(this.valorCredito)+"\r\n";
		
		
		rta+="tasa Efectiva : "+dc.format(this.tasaEfectiva*100)+"%"+"\r\n";
		rta+="valor anualidad : "+formatoImporte.format(this.valorAnualidad)+"\r\n";
		rta+="valor Cuota : "+formatoImporte.format(this.cuota)+"\r\n";
		//rta+="CUOTA"+"\t"+"SALDO PESOS"+"\t"+"CUOTA PESOS"+"\t"+"INTERESES"+"\t"+"AMORTIZACION"+"\r\n";
		rta+=calcularCutaConstante();
		System.out.println(rta);
		return rta;
	}
	
}
