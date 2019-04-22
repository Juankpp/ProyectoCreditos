package vista;

import javax.swing.JOptionPane;

public class Interfaz {
public Interfaz()
{
	
}
public String pedirIntereses()
{
	return JOptionPane.showInputDialog("ingrese los intereses");
}
public String pedirInversion()
{
	return JOptionPane.showInputDialog("ingrese la inversion");
}
public String pedirPeriodo()
{
	return JOptionPane.showInputDialog("ingrese el periodo en meses");
}
public void mostrar(double a)
{
	JOptionPane.showMessageDialog(null, a);
}
}
