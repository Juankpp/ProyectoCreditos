package Vista;

import javax.swing.JOptionPane;

public class Interfaz
{
	public Interfaz()
	{
		
	}
	
	public String pedirTasaEf()
	{
		return (JOptionPane.showInputDialog(null,"Ingresé la tasa efectiva","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirValorCuota()
	{
		return (JOptionPane.showInputDialog(null,"Ingresé el valor de la cuota","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirValorAnualidad()
	{
		return (JOptionPane.showInputDialog(null,"Ingresé el valor de anual","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	
	public void mostrarTasaEf(double a) 
	{
		Object TasaEf = null;
		JOptionPane.showMessageDialog(null, TasaEf, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarValorCuota(double b) 
	{
		Object vcuota = null;
		JOptionPane.showMessageDialog(null, vcuota, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarValorAnualidad(double c) 
	{
		Object vanualidad = null;
		JOptionPane.showMessageDialog(null, vanualidad, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}

}
