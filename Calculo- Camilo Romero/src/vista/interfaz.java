package vista;

import javax.swing.JOptionPane;

public class interfaz {
	
	
	
	public interfaz() {
		
	}
	
	public String pedirDato() {
		
		return JOptionPane.showInputDialog("ingrese el periodo de prestamo");
	}
	
	public String pedirDato2() {
		
		return JOptionPane.showInputDialog("ingrese los intereses del prestamo");
	}
	
	public String pedirDato3() {
		
		return JOptionPane.showInputDialog("ingrese el monto del prestamo");
	}

}
