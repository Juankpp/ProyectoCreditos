package Vista;

import javax.swing.JOptionPane;


public class Interfaz
{
  public Interfaz()
  {
	  
  }
  

	public String pedirPeriodo() { 
	return (JOptionPane.showInputDialog(null,"Ingrese el periodo.","PROGRAMA CREDITO",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirInteres() {
	return (JOptionPane.showInputDialog(null,"Ingrese el interes.","PROGRAMA CREDITO",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	public String pedirInversion() {
		return (JOptionPane.showInputDialog(null,"Ingrese la inversion.","PROGRAMA CREDITO",JOptionPane.INFORMATION_MESSAGE));
	}
		
	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Credito ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void escribirDato2(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Tasa efectiva ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void escribirDato3(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Anualidad ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void escribirDato4(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, " Cuota ", JOptionPane.INFORMATION_MESSAGE);
	}


}
