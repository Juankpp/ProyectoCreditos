package vista;

import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Interfaz {
	
	
	
	public Interfaz () {
		
	}
	
	public double pedirInversion() {
		JOptionPane.showMessageDialog(null, "¡Bienvenido al Calculo de Creditos!", "SISTEMA DE CALCULOS DE CREDITOS", JOptionPane.INFORMATION_MESSAGE);
		
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la Inversion que desea: ", "Inversion: ", JOptionPane.INFORMATION_MESSAGE));
	}
	
	public int pedirPeriodo() {
		
		return Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero de cuotas que desea pagar: ", "Periodo: ", JOptionPane.INFORMATION_MESSAGE));
	}
	
	public double pedirInteres() {
		
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Interes que desea pagar: ", "Interes: ", JOptionPane.INFORMATION_MESSAGE));
	}
	
	public void imprimirTabla(String tabla) {
		JTextArea textArea = new JTextArea(tabla);
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
		
		JOptionPane.showMessageDialog(null, scrollPane, "cotizacion", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
