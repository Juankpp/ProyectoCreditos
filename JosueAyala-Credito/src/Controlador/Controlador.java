package Controlador;
import Modelo.Mundo;
import Vista.Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	
	private Mundo mundo;
	private Interfaz gui;
	public Controlador() {
		
		gui= new Interfaz();		
		mundo = new Mundo(Integer.parseInt(gui.pedirPeriodo()),Double.parseDouble(gui.pedirInteres()),Double.parseDouble(gui.pedirInversion()));
		mundo.calcularValores();
		gui.escribirTabla(mundo.tabla());
		
		
	}

}