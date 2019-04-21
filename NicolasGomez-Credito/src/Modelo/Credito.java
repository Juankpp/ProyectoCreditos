package Modelo;


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Credito {

	private int periodo;
	private double interes;
	private double inversion;
	private double tasaEfec;
	private double valAnualidad;
	private double calCuota;
	private double amortizacion;
	private double saldo;
	private String tabla,tabla1,tabla2,tabla3,tabla4,tabla5,tabla6,tabla7,tabla8;
	private int contador;
	DecimalFormat formato1;
	DecimalFormat formato2;
	protected String mPeriodo,mInteres,mInversion,mTasaE,mAnualidad,mCuota1,mCuota2,mAmortizacion,mSaldo;


	public Credito() {
		mPeriodo = null;
		mInteres = null;
		mInversion = null;
		mTasaE = null;
		mAnualidad = null;
		mCuota1 = null;
		mCuota2 = null;
		mAmortizacion = null;
		mSaldo = null;
		periodo = 0;
		inversion = 0;
		interes = 0;
		tasaEfec = 0;
		valAnualidad = 0;
		calCuota = 0;
		saldo = 0;
		contador = 0;
		formato1 = new DecimalFormat("#.##");
		formato2 = new DecimalFormat("#.#####");
		tabla8 = "";
		tabla1 = "";
		tabla2 = "";
		tabla3 = "";
		tabla4 = "";
		tabla5 = "";
		tabla6 = "";
		tabla7 = "";
		
	}

	public String calcularTasaEfectiva() 
	
	{
			tasaEfec = Math.pow(1 + (interes/100), 0.083333333) - 1;
			mTasaE = formato1.format(tasaEfec*100);
		return mTasaE;
	}

	public String calcularValorAnualidad()  
	{
			valAnualidad = (1 - (Math.pow((1 + tasaEfec), (-1 * periodo)))) / tasaEfec;
			mAnualidad = formato2.format(valAnualidad);

		return mAnualidad;
	}

	public String calcularValorCuota() 
	{	
			calCuota = inversion / valAnualidad;
			mCuota1 = formato1.format(calCuota);
		
		return mCuota1;
	}

	public void hacerTablas() 
	{
	      
		for(int i = 0; i < 1 ; i++) 
		{
			interes = inversion * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = inversion - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			
			contador++;
			
			tabla =  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
		
	}
	
	public void devolverTablas() {
		
		int tab1 = periodo-1;//200
		int tab2 = tab1/2;//100
		int tab3 = tab2/2;//50
		int tab4 = tab3/2;//25
		int tab5 = tab2+tab3;//150
		int tab6 = tab5 + tab4;//175
		int tab7 = tab3+tab4;//75
		int tab8 = tab2+tab4;//125
		
		for (int i = 0; i < tab4; i++) {
			
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla1 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
		tabla1 = tabla + tabla1;
	
		
		for (int i = tab4; i < tab3 ; i++) {
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla2 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
	
		for (int i = tab3; i < tab7; i++) {
			
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla3 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
	
		for (int i = tab7; i < tab2; i++) {
			
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla4 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
	
		for (int i = tab2; i < tab8; i++) {
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla5 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
	
		for (int i = tab8; i < tab5; i++) {
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla6 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
		
		for (int i = tab5; i < tab6; i++) {
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla7 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
			
		}
	
		for (int i = tab6; i < tab1; i++) {
			interes = saldo * tasaEfec;
			mInteres = formato1.format(interes);
			
			amortizacion = calCuota - interes;
			mAmortizacion = formato1.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla8 +=  "Cuota" + contador + "  " + "Saldo pesos " + mSaldo + "  "+ "Cuota pesos " + mCuota1+ "  " + "Intereses " + mInteres+ "  " + "Amortizacion " + mAmortizacion + "\n" ;
		}
		
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

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}



	public String getTabla1() {
		return tabla1;
	}
	public String getTabla2() {
		return tabla2;
	}
	public String getTabla3() {
		return tabla3;
	}
	public String getTabla4() {
		return tabla4;
	}
	public String getTabla5() {
		return tabla5;
	}
	public String getTabla6() {
		return tabla6;
	}
	public String getTabla7() {
		return tabla7;
	}
	public String getTabla8() {
		return tabla8;
	}
	
	

}
