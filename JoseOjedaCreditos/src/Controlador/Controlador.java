package Controlador;


import Modelo.Mundo;

import Vista.Interfaz;


public class Controlador {

	private Mundo bd;

	private Interfaz gui;

	public Controlador() {

		bd = new Mundo();
		gui = new Interfaz();	  

	    bd.setPeriodo(Integer.parseInt(gui.pedirDato()));
	    bd.setInteres(Double.parseDouble(gui.pedirDato2()));
	    bd.setInversion(Integer.parseInt(gui.pedirDato3()));
	   	gui.escribirDato1(Double.toString(bd.getTasaEfectiva()) + "%");
	 	gui.escribirDato3(Double.toString(bd.getValorAnualidad()));
	 	gui.escribirDato4(Integer.toString(bd.getValorCuota()));
	 	gui.escribitDato2("TABLA \n saldos  cuotas  intereses  amortizacion \n" +bd.getSaldo());

	}

}
