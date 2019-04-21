package modelo;

public class InteresException extends Exception
{

	
	private static final long serialVersionUID = 1L;
	public InteresException()
	{
		super("el interes no puede ser menor o igual a 0 o mayor a 100");
	}

}
