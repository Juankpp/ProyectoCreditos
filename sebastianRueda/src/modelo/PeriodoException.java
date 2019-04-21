package modelo;

public class PeriodoException extends Exception
{
	private static final long serialVersionUID = 1L;

	
	public PeriodoException()
	{
		super("el periodo no puede superar los 240 meses y no puede ser menor o igual a 0");
	}
}
