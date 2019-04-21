package Vista;


import java.awt.TextArea;

import javax.swing.JOptionPane;



public class Interfaz {

	public Interfaz() 
	{
	
	}
	
	public String pedirPeriodo() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el periodo","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirInteres() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el interes","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirInversion() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese la Inversion","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	public void escribirTabla(String dato) 
	{ 		
		JOptionPane.showMessageDialog(null,  new TextArea(dato), "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
				
	}
	
	
}
