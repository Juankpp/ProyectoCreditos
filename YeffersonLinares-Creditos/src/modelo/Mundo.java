package modelo;

public class Mundo 
{

	private Cuentas cuentas;
	
	public Mundo()
	{
		this.cuentas = new Cuentas();
	}
	
	public Cuentas getCuentas()
	{
		return this.cuentas;
	}
}