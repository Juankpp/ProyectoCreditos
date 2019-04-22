package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador
{
	private Mundo mun;
	private Interfaz inz;
	
	public Controlador() 
	{

		inz = new Interfaz();
		mun = new Mundo();
		
		
		mun.getC().tasaEfctiva(Double.parseDouble(inz.pedirTasaEf()));
		mun.getC().valorCuota(Double.parseDouble(inz.pedirValorCuota()));
		mun.getC().valorAnualidad(Double.parseDouble(inz.pedirValorAnualidad()));
			
		inz.mostrarTasaEf(a);
		inz.mostrarValorCuota(b);
		inz.mostrarValorAnualidad(c);
	}
}
