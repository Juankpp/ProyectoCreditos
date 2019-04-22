package Modelo;

public class Mundo 
{
	private Credito c;
	private Calculo cu;
	
	public Mundo() 
	{
		super();
		c = new Credito();
		cu = new Calculo();
	}

	public Credito getC() 
	{
		return c;
	}

	public void setC(Credito c) 
	{
		this.c = c;
	}

	public Calculo getCu() 
	{
		return cu;
	}

	public void setCu(Calculo cu) 
	{
		this.cu = cu;
	}
	
	
	
}
