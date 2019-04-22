package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	// Atributos que vienen del Modelo (mundo)
	private Mundo mu;

	// Atributos que vienen de Vista
	private Interfaz gui;

	public Controlador() {

		// aqui van los constructores tanto de Mundo, como de Vista

		mu = new Mundo();
		gui = new Interfaz();

		// aqui van los métodos que se invocan de Modelo (Mundo) y de Vista y que
		// ejecutarán el programa.

//primera tabla ______________________________________________________________________________________________________
		gui.escribirDato(mu.getPt().interes(), "interes");
		gui.escribirDato(mu.getPt().inversion(), "inversion");
		gui.escribirDato(mu.getPt().tasaEfectiva(), "tasa efectiva");
		gui.escribirDato(mu.getPt().valorAnualidad(), "valor anualidad");
		gui.escribirDato(mu.getPt().valorCuota(), "valor cuota");
//segundaTabla(mundo)_________________________________________________________________________________________________	 	
		mu.tablaCuota();
		mu.prueba();
		gui.escribirDato(mu.prueba(), "tabla");

	}

}
