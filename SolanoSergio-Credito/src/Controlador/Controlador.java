package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador implements ActionListener{
	
	private Mundo mun;
	private Interfaz gui;
	
	public Controlador() {
		
		gui = new Interfaz(this);
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equalsIgnoreCase(gui.getEntrada().datos)){
			int peri = Integer.parseInt(gui.getEntrada().getPeri().getText());
			double interes = (Double.parseDouble(gui.getEntrada().getInte().getText()))/100.00;
			double inversion = Double.parseDouble(gui.getEntrada().getInver().getText());
			mun = new Mundo(peri,interes,inversion);
			String valores = mun.construirValores();
			gui.generarCalculos(valores);
			gui.getEntrada().cambiarEstadoCampos(false);
			gui.getCalculos().cambiarEstadoBoton(true);
			gui.getEntrada().reiniciarValores();
		}
		else if(evento.getActionCommand().equalsIgnoreCase(gui.getCalculos().regresar)){
			gui.getEntrada().cambiarEstadoCampos(true);
			gui.getCalculos().cambiarEstadoBoton(false);
			gui.getCalculos().regresarResultados();
		}
		else{
			String calculo = mun.calcularTabla();
			gui.escribirTabla(calculo);
			gui.getCalculos().cambiarEstadoBotonTabla(false);
		}
		
	}

}
