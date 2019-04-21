package controlador;
import vista.Interfaz;
import modelo.InteresException;
import modelo.InversionException;
import modelo.Mundo;
import modelo.PeriodoException;

public class Controlador 
{
  private Mundo mu;
  private Interfaz in;
  private String tabla;
  
 public Controlador() 
 {
	 mu = new Mundo();
	 in = new Interfaz();
	 tabla = " ";
	    	 
	
	mu.setPeriodo(in.pedirPeriodo());
	mu.setInversion(in.pedirInversion());
	mu.setInteres(in.pedirInteres());
	

	try {
		in.escribirDato(mu.calcularTasaEfectiva());
	} catch (InteresException e) {

		e.printStackTrace();
	}
	
	try {
		in.escribirDato(mu.calcularValorAnualidad());
	} catch (PeriodoException e) {
		
		e.printStackTrace();
	}
	
	try {
		in.escribirDato(mu.calcularValorCuota());
	} catch (InversionException e) {
		
		e.printStackTrace();
		System.out.println("error");
	}
	
	
	
	tabla = mu.creacionDeTabla();
	mu.getAr().escribirArchivo(tabla);
	in.escribirDato5(mu.getAr().leerArchivo());
	 

	    	 
	    	
	 
 }
}
