package Controlador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import Modelo.Credito;
import Vista.InterfazGUI;

public class Controlador {

	
	private InterfazGUI gui;
	
	public Controlador() {
		
		
		String sPeriodo = JOptionPane.showInputDialog("Ingrese el periodo: ");
		double periodo = Double.parseDouble(sPeriodo);
		String sInteres = JOptionPane.showInputDialog("Ingrese el interes: ");
		double interes = Double.parseDouble(sInteres)/100.0;
		String sInversion = JOptionPane.showInputDialog("ingrese la inversión: ");
		int iInversion = Integer.parseInt(sInversion);
		System.out.println(iInversion);
		double inversion = iInversion *1.0;
		System.out.println((long)inversion);
		
		
		Credito cre = new Credito(periodo,interes,inversion);
		System.out.println(cre.efectiva());
		System.out.println(cre.anualidad());
		cre.valor();
		//cre.IniciarMatriz();
		
		
		gui = new InterfazGUI(this,cre.IniciarMatriz());
		gui.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent evento) {
		
	}
}
