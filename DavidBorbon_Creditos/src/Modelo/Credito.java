package Modelo;

public class Credito
{
	int periodo;
	double interes;
	double inversion;
	double tasaEf;
	double vanualidad;
	double vcuota;
	
	
	public Credito()
	{
		
	}
	
	
	public double devtasaEfctiva()
	{
		return tasaEf;
	}
	
	public void tasaEfctiva (double tefe)
	{
		tasaEf = tefe + Math.pow((1+interes),(1/12))-1;
	}	
	
	public void valorCuota (double d)
	{
		vcuota = d+ inversion/vanualidad;
	}
	
	public void valorAnualidad(double c)
	{
		vanualidad =c+ 1-+ Math.pow((1+tasaEf),-periodo)/tasaEf;
	}
	
}
