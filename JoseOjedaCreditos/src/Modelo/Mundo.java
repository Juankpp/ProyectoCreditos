package Modelo;

import java.text.DecimalFormat;


public class Mundo {

	private int inversion, periodo, cuota;

	private double interes, tef, an, porcentaje;
	
	public double getInteres() {
		return interes;
	}
	
	public void setInteres(double pInteres) {
		this.interes = pInteres;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int pPeriodo) {
		this.periodo = pPeriodo;
	}
	
	public int getInversion() {
		return inversion;
	}

	public void setInversion(int pInversion) {
		this.inversion = pInversion;
	}
	public double getTasaEfectiva() {
		double fraction = (double) 1/12;
		tef=(Math.pow((1+(interes/100)), fraction))-1;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		porcentaje=Double.parseDouble(numberFormat.format(tef*100));
		
		return porcentaje;
	}
	public double getValorAnualidad() {
		an=(1-Math.pow((1+(porcentaje/100)),-periodo))/(porcentaje/100);
		return an;
	}
	public int getValorCuota(){
		
		cuota=(int) (inversion/an);
	
		return cuota;
	}
		
	public String getSaldo() {
		int[][] saldo = new int[periodo+1][4];
		saldo[0][0]=inversion;
		for(int i= 1; i<saldo.length; i++){
		
			    saldo[i][1]=(int) cuota;
				saldo[i][2]=(int) (saldo[i-1][0]*(porcentaje/100));
				saldo[i][3]=(int) (cuota-saldo[i][2]);
				saldo[i][0]=saldo[i-1][0]-saldo[i][3];
				if(saldo[i][0]<0) {
					saldo[i][0]=0;
				}
		}
		
		String row = "";

	    for (int f=0; f<saldo.length; f++) {
	        row+="\n";
	        for (int j = 0; j<saldo[f].length; j++) {
	            row += saldo[f][j] + "  ";
	        }
	    }
	   
		return row;
	}

	
}
