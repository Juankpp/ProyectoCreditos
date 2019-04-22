package modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Credito {
	private double n;
	private double interes;
	private double monto;
	private double efec;
	private double anual;
	private double cuota;
	
	
	public Credito() {
		this.n = n;
		this.interes = interes;
		this.monto = monto;
		
	}
	
	
	
	public double getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public double getInteres() {
		return interes;
	}



	public void setInteres(double interes) {
		this.interes = interes;
	}



	public double getMonto() {
		
		return monto;
	}



	public void setMonto(int monto) {
		this.monto = monto;
	}



	public double getEfec() {
		return efec;
	}



	public void setEfec(double efec) {
		this.efec = calcularTasaEfec();
	}



	public double getAnual() {
		return anual;
	}



	public void setAnual(int anual) {
		this.anual = anual;
	}



	public double getCuota() {
		return cuota;
	}



	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	
	public void ingresarDatos() {
		
		
		
		monto = Double.parseDouble( JOptionPane.showInputDialog(null, "ESTA MONDÁ ES UNA CALCULADORA DE CRÉDITO"+"\n"+
		"¡¡¡USELO BAJO SU PROPIO RIESGO!!!!"+"\n"+"Ingrese un monto(en $COP)"));
		n = Double.parseDouble( JOptionPane.showInputDialog(null,"¿A cuantas cuotas mi rey? :v"));
		interes = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una tasa de interés(en %)"));
		
		
	}
	
	public String convertir(double monto) {
		
		DecimalFormat num = new DecimalFormat("#,###");
		
		
		
		return num.format(monto);
	}
	public double calcularInteres() {
		return interes/100;
	}



	public double calcularTasaEfec() {
		
		double ef = Math.pow((1+interes/100), (0.08333333));
		efec = ef-1;
		double ec = efec*100;
		double te = Math.round(ec*100)/100d;
		return te;
		
	}
	public String calcularAnualidad() {
		
		DecimalFormat num = new DecimalFormat("#,###,00");
		double d = Math.pow(1+efec, -n );
		double d1 = 1-d;
		double an = d1/efec;
		anual = an;
		
		
		return num.format(anual);
		

		
	}
	
	public String calcularCuota(double monto) {
		double c = monto/anual;
		cuota = c;
		double cm = Math.round(c);
		DecimalFormat num = new DecimalFormat("#,###");
		return num.format(cm);
		
		
	}
	
	
}
