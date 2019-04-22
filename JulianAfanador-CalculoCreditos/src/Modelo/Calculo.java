package Modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class Calculo {

	private NumberFormat formato;
	private int periodo;
	private double interes;
	private double valorAnualidad;
	private double inversion;
	private double cuota;
	private double unDoceavo;
	private double tasaEfectiva;
	private String moneda;
	private double saldoResta;
	private double valorInteres;
	private double amortizacion;
	
	public Calculo() {
		formato = NumberFormat.getCurrencyInstance(Locale.US);
		periodo = 0;
		interes = 0;
		valorAnualidad = 0;
		inversion = 0;
		cuota = 0;
		unDoceavo = 0.083333333;
		tasaEfectiva = 0;
		moneda = null;
		
		valorInteres = 0;
		
		saldoResta = inversion;
		amortizacion = 0;
	}
	
	public double calcularTasa(double interes) {
		interes = interes/100;
		tasaEfectiva = (Math.pow((1+interes), (unDoceavo)))-1;
		double resultado = tasaEfectiva * 100;
		resultado = Math.round(resultado * 100d)/100d;
		return resultado ;
	}
	
	public double calcularAnualidad(double tasaEfectiva, int periodo) {
		valorAnualidad = (1-(Math.pow(1+(tasaEfectiva), -1*periodo)));
		valorAnualidad = valorAnualidad/tasaEfectiva;
		
		return valorAnualidad;
	}
	public String calcularCuota(double inversion,double valorAnualidad) {
		cuota = inversion/valorAnualidad;
		moneda = formato.format(cuota);
		return moneda;
	}
	
	public double calcularValorInteres() {
		valorInteres = inversion * tasaEfectiva;
		return valorInteres;
	}
	public double calcularSaldoResta() {
		
		inversion =  inversion - amortizacion;
		return inversion;
	}
	public double calcularAmortizacion() {
		amortizacion = cuota - valorInteres;
		return amortizacion;
	}
	
	
	
	
	public double getSaldoResta() {
		return saldoResta;
	}


	public double getValorInteres() {
		return valorInteres;
	}


	public double getAmortizacion() {
		return amortizacion;
	}


	public NumberFormat getFormato() {
		return formato;
	}

	public void setFormato(NumberFormat formato) {
		this.formato = formato;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getUnDoceavo() {
		return unDoceavo;
	}

	public void setUnDoceavo(double unDoceavo) {
		this.unDoceavo = unDoceavo;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
