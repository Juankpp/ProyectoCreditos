package controlador;


import java.awt.event.ActionListener;

import modelo.Credito;
import vista.Interfaz;


public class Controlador  {
	
	
	private Credito credito;
	private Interfaz interfaz;

	public Controlador () {
	
		interfaz = new Interfaz();
		credito = new Credito(interfaz.pedirInversion(), interfaz.pedirPeriodo(), interfaz.pedirInteres());
		credito.calcularTasaEfectiva();
		credito.calcularValorAnualidad();
		credito.calcularCuota();

		
		interfaz.imprimirTabla(credito.mostrarTabla());
		
		
	}
	
	

}
