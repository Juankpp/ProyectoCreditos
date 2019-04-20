package Modelo;

import java.text.DecimalFormat;

public class Credito {
	 private double efectiva;
	 private double anualidad;
	 private double couta;
	
	// valores iniciales
	 
	 private double periodo;
	 private double interes;
	 private double inversion;
	 
	 
	 // tabla de credito
	 double [][] tabla;
	 String [][] tablaMostrar;
	 
	 
	 
	 public Credito(double pPeriodo, double pInteres, double pInversion) {
		 this.periodo = pPeriodo;
		 this.interes = pInteres;
		 this.inversion = pInversion;
	 }
	 
	 
	
	
	
	public double efectiva() {
		
		double p1 = 1+this.interes;
		double p2 = 1.0/12.0;
		double operacion  = Math.pow(p1, p2);
		double sol = operacion-1;
		
		this.efectiva = sol;
		return sol;
		
		
		
	}
	
	public double anualidad() {
		double p1 = 1 + this.efectiva;
		double p2 = this.periodo*-1;
		double operacion = Math.pow(p1, p2);
		double s1 = 1- operacion;
		double s2 = s1/this.efectiva;
		
		this.anualidad = s2;
		
		return s2;
	}
	
	public void valor() {
		
		double operacion = this.inversion/this.anualidad;
		DecimalFormat df = new DecimalFormat("#");
		//System.out.println("$"+ df.format(operacion));
		this.couta = operacion;
		long prub = (long) operacion;
		System.out.println(operacion);
		
		
	}
	
	public String[][] IniciarMatriz() {
		
		this.tabla = new double[(int) (this.periodo)][5];
		this.tablaMostrar = new String[(int)this.periodo][5];
		/*for(int i = 0; i< (int)this.periodo;i++) {
			this.tabla[i][2] = this.couta;
		}
		for(int i = 0; i< (int)this.periodo;i++) {
			this.tabla[i][0] = (double)i;
		}
		*/
		System.out.println("aca empieza la tabla");
		int var = (int) this.periodo;
		System.out.println(var);
		for(int i = 0; i< var; i++) {
			for(int j = 0; j< 5; j++) {
				if(j == 0) {
					this.tabla[i][0] = (double)i;
				}
				if(j == 2) {
					this.tabla[i][2] = this.couta;
				}
				
			}
		}
		
		for(int i= 0 ;i < var;i++) {
			if(i == 0) {
				this.tabla[i][1]= this.inversion;
				this.tabla[i][2] = 0.0;
				this.tabla[i][3] = 0.0;
				this.tabla[i][4] = 0.0;
			}
			else {
				this.tabla[i][3] = this.tabla[i-1][1]* this.efectiva;
				this.tabla[i][4] = this.tabla[i][2] - this.tabla[i][3];
				this.tabla[i][1] = this.tabla[i][1]= this.tabla[i-1][1] - this.tabla[i][4];
				
			}
			
			
		}
		
		for(int i = 0; i < var;i++) {
			for(int j = 0; j< 5; j++) {
				this.tablaMostrar[i][j] = String.valueOf(this.tabla[i][j]);
				System.out.println(this.tablaMostrar[i][j]);
			}
			
		}
		
		
		/*for(int i =0; i <var; i++) {
			for(int j =0;j < 5; j++) {
				System.out.println(this.tabla[i][j]);
			}
			}
			*/
		return this.tablaMostrar;
		
	}

}
