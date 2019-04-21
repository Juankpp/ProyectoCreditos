package vista;

import javax.swing.JOptionPane;


public class Interfaz
{
  public Interfaz()
  {
	  
  }
  

	public int pedirPeriodo() 
	{
		
			String respuesta = JOptionPane.showInputDialog("ingrese el periodo");
			int respuesta1 = Integer.parseInt(respuesta);
			return respuesta1;
	}
	
	public double pedirInteres() 
	{
		String respuesta = JOptionPane.showInputDialog("ingrese el interes");
		double respuesta1 = Double.parseDouble(respuesta);
		return respuesta1;
	}
	
	
	public double pedirInversion() 
	{
		String respuesta = JOptionPane.showInputDialog("ingrese la inversion");
		int respuesta1 = Integer.parseInt(respuesta);
		return respuesta1;
	}
	
	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","PROGRAMA CREDITO",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Intereses ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato2(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Amortizacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato3(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "saldo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato4(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " cuota", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato5(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " tabla ", JOptionPane.INFORMATION_MESSAGE);
	}

}
