package Modelo;

public class Credito {

	private double interes;
	private int periodo;
	private double inversion;
	private double tef;
	private double anualidad;
	private double cuota;
	private double saldoPesos ;
	private double  interesCuota; 
	private double amortizacion;
	
	public Credito() {
		interes=0;
		periodo=0;
		inversion=0;
		tef=0;
		anualidad=0;
		cuota=0;
		
	}
	

	public double getSaldoPesos() {
		return saldoPesos;
	}


	public void setSaldoPesos(double saldoPesos) {
		this.saldoPesos = saldoPesos;
	}


	public double getInteresCuota() {
		return interesCuota;
	}


	public void setInteresCuota(double interesCuota) {
		this.interesCuota = interesCuota;
	}


	public double getAmortizacion() {
		return amortizacion;
	}


	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}


	public double getTef() {
		return tef;
	}


	public void setTef(double tef) {
		this.tef = tef;
	}


	public double getAnualidad() {
		return anualidad;
	}


	public void setAnualidad(double anualidad) {
		this.anualidad = anualidad;
	}


	public double getCuota() {
		return cuota;
	}


	public void setCuota(double cuota) {
		this.cuota = cuota;
	}


	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getInversion() {
		return inversion;
	}
	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

}
