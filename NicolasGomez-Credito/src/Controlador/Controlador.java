package Controlador;
import Vista.Interfaz;

import Modelo.Credito;


public class Controlador 
{
  private Credito cr;
  private Interfaz in;
  private String tabla;
  
 public Controlador() 
 {
	 cr = new Credito();
	 in = new Interfaz();
	 tabla = " ";
	    	 
	
	cr.setPeriodo(Integer.parseInt(in.pedirPeriodo()));
	cr.setInversion(Double.parseDouble(in.pedirInversion()));
	cr.setInteres(Double.parseDouble(in.pedirInteres()));

	
		in.escribirDato2(cr.calcularTasaEfectiva());
	
		in.escribirDato3(cr.calcularValorAnualidad());
	
		in.escribirDato4(cr.calcularValorCuota());
	
	cr.hacerTablas();
	    	cr.devolverTablas();
	    	in.escribirDato(cr.getTabla1());
	       	in.escribirDato(cr.getTabla2());
	       	in.escribirDato(cr.getTabla3());
	       	in.escribirDato(cr.getTabla4());
	       	in.escribirDato(cr.getTabla5());
	       	in.escribirDato(cr.getTabla6());
	       	in.escribirDato(cr.getTabla7());
	       	in.escribirDato(cr.getTabla8());
	   	 
 }
}
