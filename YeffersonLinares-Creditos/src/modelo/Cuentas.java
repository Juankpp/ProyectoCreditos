package modelo;

import java.text.NumberFormat;

public class Cuentas 
{

	private double amortizacion;
	private double interes;
	private double tasaEfectiva;
	private double anualidad;
	private double cuota;
	private double saldo;
	private double inversion;
	private int periodo;
	private String datosTabla[][];
	private String[] titulos;
	
	public Cuentas()
	{
		titulos = new String[] {"Cuota","Saldo pesos", "Cuota pesos","Interes","Amortización"};
	}
	
	public String[] getTitulos()
	{
		return titulos;
	}
	
	public double calcularTasaefectiva(double interes)
	{
		if(interes>100 || interes<0)
		{
			tasaEfectiva = -1;
		}
		else
		{
			interes/=100;
			interes+=1;
			tasaEfectiva = Math.pow(interes,1/12.0);
			tasaEfectiva-=1;
			tasaEfectiva*=100;
		}
		return tasaEfectiva;
	}
	
	public double calcularAnualidad(int periodo)
	{
		if(periodo>240 || periodo<0)
		{
			anualidad=-1;
		}
		else
		{
			double efectiva = tasaEfectiva;
			efectiva /=100;
			this.periodo = periodo;
			anualidad = efectiva+1;
			anualidad = Math.pow(anualidad, -periodo);
			anualidad=1-anualidad;
			anualidad/=efectiva;
		}
		return anualidad;
	}
	
	public double calcularCuota(double inversion)
	{
		if(inversion<0)
		{
			cuota = -1;
		}
		else
		{
			this.saldo = inversion;
			cuota = inversion/this.calcularAnualidad(this.periodo);
		}
		return cuota;
	}
	
	
	public String[][] calcularTabla()
	{
		datosTabla = new String[periodo+1][5];
		double efectiva = this.tasaEfectiva;
		efectiva/=100;
		datosTabla[0][0] = "  0";
		datosTabla[0][1] = String.format("%.2f %n", saldo);
		for(int x=1;x<=periodo;x++)
		{
			interes = saldo*efectiva; 
			amortizacion = cuota-interes;  
			saldo-=amortizacion;
			datosTabla[x][0] = "  "+x;
			datosTabla[x][1] = String.format("%.2f %n", saldo);
			datosTabla[x][2] = String.format("%.2f %n", cuota);
			datosTabla[x][3] = String.format("%.2f %n", interes);
			datosTabla[x][4] = String.format("%.2f %n", amortizacion);
		}
		return datosTabla;
	}
	
	
	/*	public String calcularTabla()
	{
		String[][] matriz = new String[periodo][5];
		String sas = "";
		int a = 0;
		double efectiva = this.tasaEfectiva;
		efectiva/=100;
		String pro = String.format("%.3f", saldo);
		tabla = "   "+"Cuota"+"\t";
		tabla += "Saldo pesos:"+"\t"+"\t";
		tabla+= "Cuota pesos"+"\t"+"\t";
		tabla += "Interes:"+"\t"+"           ";
		tabla +="Amortización:"+"\n";
		tabla+="   "+"0"+"\t";
		tabla+=String.format("%.3f%n", saldo)+"\n";
		for(int x=0;x<periodo;x++)
		{      
			interes = saldo*efectiva; 
			amortizacion = cuota-interes;  
			saldo-=amortizacion;
			a = x+1;
			tabla+="   "+a+"\t";
			tabla+=String.format("%.3f %n", saldo)+"\t"+"\t";    
			tabla+=String.format("%.3f %n", cuota)+"\t"+"\t";
			tabla+=String.format("%.3f %n", interes)+"\t"+"           ";                    
			tabla+=String.format("%.3f %n",amortizacion);  
			tabla+="\n";
			
		}
		return tabla;
	}	*/	
}