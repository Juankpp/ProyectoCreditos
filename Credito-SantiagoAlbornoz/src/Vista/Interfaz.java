package Vista;

import java.awt.TextArea;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	
	
	public String pedirDato(String title) 
	{
		return (JOptionPane.showInputDialog(null,title,"Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, new TextArea(dato), "CUOTA CONSTANTE EN PESOS", JOptionPane.INFORMATION_MESSAGE);
	}
}
