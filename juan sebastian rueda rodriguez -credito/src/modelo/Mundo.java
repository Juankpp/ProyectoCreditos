package modelo;

import modelo.Archivo;
import java.text.DecimalFormat;

public class Mundo extends Calculo {
	
	private Archivo ar; 

	private int periodo;
	private double interes;
	private double inversion;
	private double tasaE;
	private double anualidad;
	private double cuota;
	private double amortizacion;
	private double saldo;
	private String tabla;
	private String tabla2;
	private String tabla3;
	private String cu;
	private String sa;
	private String cuP;
	private String in;
	private String amo;
	private int contador;
	DecimalFormat formato;
	DecimalFormat formato1;
	

	public Mundo() {
		
		ar = new Archivo();
		
		periodo = 0;
		inversion = 0;
		interes = 0;
		tasaE = 0;
		anualidad = 0;
		cuota = 0;
		saldo = 0;
		cu = "cuota ";
		sa = "saldo pesos ";
		cuP = "cuota pesos ";
		in = "intereses ";
		amo = "amortizacion ";
		contador = 0;
		formato = new DecimalFormat("#.##");
		formato1 = new DecimalFormat("#.#####");
		tabla = "";
		tabla2 = null;
		tabla3 = null;

	}

	public String calcularTasaEfectiva() throws InteresException
	
	{
		if (interes <= 0 || interes > 100 ) 
		{
				throw new InteresException();			
		}
		else 
		{
			interes = interes / 100;
			tasaE = Math.pow(1 + interes, 0.083333333) - 1;
			double tasaE2 = tasaE * 100;
			mTasaE = formato.format(tasaE2);

		}
		
		
		return mTasaE;
	}

	public String calcularValorAnualidad()  throws PeriodoException
	{
		if (periodo > 240 || periodo <= 0) 
		{
				throw new PeriodoException();			
		}
		else 
		{
			anualidad = (1 - (Math.pow((1 + tasaE), (-1 * periodo)))) / tasaE;
			mAnualidad = formato1.format(anualidad);

		}
		
		

		return mAnualidad;
	}

	public String calcularValorCuota() throws InversionException
	{
		if (inversion <= 0) 
		{
				throw new InversionException();			
		}
		else 
		{
			cuota = inversion / anualidad;
		    int cuota2 = (int)( Math.round(cuota));
			mCuota = String.valueOf(cuota2);

		}
		return mCuota;
	}
	
	public String cuotaPesos() {
		mCuota2 = formato.format(cuota);
		return mCuota2;
	}
	
	public String creacionDeTabla() 
	{
	      
		for(int i = 0; i < 1 ; i++) 
		{
			interes = inversion * tasaE;
			mInteres = formato.format(interes);
			
			amortizacion = cuota - interes;
			mAmortizacion = formato.format(amortizacion);
		
			
			saldo = inversion - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			
			contador++;
			
			tabla2 =  cu + contador + "  " + sa + mSaldo + "  "+ cuP + mCuota+ "  " + in + mInteres+ "  " + amo + mAmortizacion + "\n" ;
			
		}
		
		
		for(int i = 0; i < periodo-1 ; i++) 
		{
			interes = saldo * tasaE;
			mInteres = formato.format(interes);
			
			amortizacion = cuota - interes;
			mAmortizacion = formato.format(amortizacion);
		
			
			saldo = saldo - amortizacion;
			int saldo2 = (int) (Math.round(saldo));
			mSaldo = String.valueOf(saldo2);
			contador++;
			
			tabla +=  cu + contador + "  " + sa + mSaldo + "  "+ cuP + mCuota+ "  " + in + mInteres+ "  " + amo + mAmortizacion + "\n" ;
			
		}
		
		tabla3 = tabla2 + tabla;
		
	return tabla3;	
	
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

	public double getTasaE() {
		return tasaE;
	}

	public void setTasaE(double tasaE) {
		this.tasaE = tasaE;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Archivo getAr() {
		return ar;
	}

	public void setAr(Archivo ar) {
		this.ar = ar;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getCu() {
		return cu;
	}

	public void setCu(String cu) {
		this.cu = cu;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getCuP() {
		return cuP;
	}

	public void setCuP(String cuP) {
		this.cuP = cuP;
	}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getAmo() {
		return amo;
	}

	public void setAmo(String amo) {
		this.amo = amo;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	

}
