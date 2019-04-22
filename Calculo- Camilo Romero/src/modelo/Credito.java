package modelo;

import javax.swing.JOptionPane;

import vista.*;


public class Credito {	
	private interfaz gui ;
	private double tEfectiva;
	private double vAnual;
	private double vCuota;
	private double intereses;
	private double Amortizacion;
	private int periodo;
	private double monto;
	public Credito () {
		gui = new interfaz();
		
		}
	public interfaz getInterfaz() {
		return gui;
	}
	public void setPeriodo(int periodo) {
		
		this.periodo = periodo;
		
	}
	public void setMonto(double monto) {
		
		this.monto = monto;
		
	}
	
		public double darTasaEfectiva() {
	   tEfectiva = (Math.pow( 1 + Double.parseDouble(gui.pedirDato2()), 0.083 ) -1);
	   return tEfectiva;
	
		}
	
	public double darValorAnual() {
		vAnual = ((1- Math.pow(1+tEfectiva, - periodo))/tEfectiva);
		return vAnual;
	}
	public double darValorCuota() {
		vCuota = monto/vAnual;
		return vCuota;
	}

	
	
	
	public  String [][] tabla(){
		
		String[][] tabla1 = new String [periodo+1][5];
		double total = monto;
		double cup= getvCuota();
		double intereses=0;
		double amortizacion=0;
		String resultado[][];
		
			for (int i = 0; i < periodo+1; i++) {
				if (i==0) {
					tabla1[i][0]=i+"";
					tabla1[i][1]=total+"";
					tabla1[i][2]="";
					tabla1[i][3]="";
					tabla1[i][4]="";
				}else {
					intereses= total*gettEfectiva();
					amortizacion = cup-intereses;
					total = total- amortizacion;
					tabla1[i][0]=i+"";
					tabla1[i][1]=total+"";
					tabla1[i][2]=cup+"";
					tabla1[i][3]=intereses+"";
					tabla1[i][4]=amortizacion+"";
				}
			}
	for (int i = 0; i < periodo+1; i++) {
		for (int j = 0; j < 5; j++) {
			
			System.out.println( tabla1[i][j]+ "     ");
			}
		System.out.println("");
	}
	resultado = tabla1;
	return tabla1;
	
	}
	
	
	public double gettEfectiva() {
		return tEfectiva;
	}


	public void settEfectiva(double tEfectiva) {
		this.tEfectiva = tEfectiva;
	}


	public double getvAnual() {
		return vAnual;
	}


	public void setvAnual(double vAnual) {
		this.vAnual = vAnual;
	}


	public double getvCuota() {
		return vCuota;
	}


	public void setvCuota(double vCuota) {
		this.vCuota = vCuota;
	}


	public double getIntereses() {
		return intereses;
	}


	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}


	public double getAmortizacion() {
		return Amortizacion;
	}


	public void setAmortizacion(double amortizacion) {
		Amortizacion = amortizacion;
	}	
	public int getPeriodo() {
		return periodo;
	}
	public double getMonto() {
		return monto;
	}
}
