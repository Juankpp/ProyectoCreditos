package modelo;

public class InversionException extends Exception
{

	
	private static final long serialVersionUID = 1L;

	
	public InversionException()
	{
		super("la inversion no puede ser igual o menor a 0");
	}
}
