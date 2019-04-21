package Modelo;

import java.text.DecimalFormat;

public class Credito {
	
	private int inversion;
	private double interes;
	private double tasasEfectivo; 
	private double valorAnualidad;
	private int cuota;
	private int periodo;
	private double amortizacion;
	private double cuotasPesos;
	private double interesPesos;
	private int saldo;
	
	public Credito() {
		interes=0.2343;
		periodo=48;
		inversion=28070000;
	}
	
	public double calcularTasaEfectivo() {
		String c="%";
		tasasEfectivo= Math.pow(+(1+interes), 0.0833333333)-1; // 1/2 da 0.8333333....
		System.out.println("Tasa Efectivo: "+tasasEfectivo*100+c);
		return tasasEfectivo; 
	}
	
	public double calcularValorAnualidad() {
		valorAnualidad = (1-(Math.pow(1+tasasEfectivo,-periodo)))/tasasEfectivo;
		System.out.println("Valor Anualidad: "+valorAnualidad);
		return valorAnualidad;
	}
	
	public int calcularCuota() {
		cuota = (int) (inversion/valorAnualidad);
		System.out.println("Valor Cuota: "+cuota);
		return cuota;
	}
	
	public double cuotaPesos() {
		
		tasasEfectivo= Math.pow(+(1+interes), 0.083333333)-1;
		valorAnualidad = (1-(Math.pow(1+tasasEfectivo,-periodo)))/(tasasEfectivo);
		cuotasPesos = inversion/valorAnualidad;
		System.out.println(cuotasPesos);
		return cuotasPesos;
	}
	
	public int saldoPesos() {
		saldo =  (int) ((int) inversion - amortizacion);
		System.out.println(saldo);
		return saldo;
	}
	
	
	public double calcularAmortizacion(){			
		amortizacion = cuotasPesos-interesPesos;
		
		System.out.println(amortizacion);
		return amortizacion;
		
	}
	
	public double interes() {
		
		tasasEfectivo= Math.pow(+(1+interes), 0.083333333)-1;
		interesPesos = inversion*tasasEfectivo;
		System.out.println(interesPesos);
		return interesPesos;
	}
	
	public void tablasCuotas() {
		int [] sp = new int[periodo+1];
		double [] cp = new double[periodo+1];
		double [] in = new double[periodo+1];
		double [] am = new double [periodo+1];
		DecimalFormat df2 = new DecimalFormat("#.##");
		sp[0]=inversion;
		System.out.println("Cuotas\t Saldos Pesos\t Cuota Pesos\t Intereses\t  Amortización  ");
		System.out.println("0"+"\t"+sp[0]);
		for (int i = 1; i <=periodo; i++) {
			cp[i]= (inversion/valorAnualidad);
			in[i]=sp[i-1]*tasasEfectivo;
			am[i]= cp[i]-in[i];
			sp[i]= (int) (sp[i-1]-am[i]);
			System.out.println(i+"\t"+sp[i]+"\t\t"+df2.format(cp[i])+"\t\t"+df2.format(in[i])+"\t\t"+df2.format(am[i]));
		}

	}
	
	public int getInversion() {
		return inversion;
	}

	public void setInversion(int inversion) {
		this.inversion = inversion;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getTasasEfectivo() {
		return tasasEfectivo;
	}

	public void setTasasEfectivo(double tasasEfectivo) {
		this.tasasEfectivo = tasasEfectivo;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getCuotasPesos() {
		return cuotasPesos;
	}

	public void setCuotasPesos(double cuotasPesos) {
		this.cuotasPesos = cuotasPesos;
	}

	public double getInteresPesos() {
		return interesPesos;
	}

	public void setInteresPesos(double interesPesos) {
		this.interesPesos = interesPesos;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	

}
