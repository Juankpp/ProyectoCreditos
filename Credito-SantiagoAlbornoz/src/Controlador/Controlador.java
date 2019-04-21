package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new Interfaz();
		try {
		gui.escribirDato(bd.newCredit(Double.parseDouble(gui.pedirDato("INGRESE LA INVERSION")), Double.parseDouble(gui.pedirDato("INGRESE EL INTERES")), Integer.parseInt(gui.pedirDato("INGRESE EL PERIODO"))));
		}catch(Exception e) {
			gui.escribirDato("ingrese un dato valido");
		}
		
		
	}

}
