package controlador;
import modelo.*;
import vista.interfaz;

import javax.swing.*;

public class Controlador {
	private interfaz gui;
	private Credito bd;
	
	public Controlador() {
		bd = new Credito();
		gui = new interfaz();
		
		bd.setPeriodo(Integer.parseInt(bd.getInterfaz().pedirDato()));
		bd.setMonto(Double.parseDouble(bd.getInterfaz().pedirDato3()));
		bd.darTasaEfectiva();
		
		bd.darValorAnual();
		bd.darValorCuota();
			bd.tabla();
			
	}
	
	


}
