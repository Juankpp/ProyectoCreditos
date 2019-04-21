package Vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public Interfaz() {
		
	}
	
	public String escribirPeriodo() {
		return JOptionPane.showInputDialog(null,"Ingrese tu periodo","Creditos", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String escribirInteres() {
		return JOptionPane.showInputDialog(null,"Ingrese tu interes","Creditos", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String escribirInversion() {
		return JOptionPane.showInputDialog(null,"Ingrese tu inversion","Creditos", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public  void mostrarResultado(String d) {
		 JOptionPane.showMessageDialog(null,d, "Creditos", JOptionPane.INFORMATION_MESSAGE);
		 
	}
}
