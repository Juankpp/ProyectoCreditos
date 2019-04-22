package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Credito;
import vista.Interfaz;
import vista.Ventana;

public class Controlador implements ActionListener {
	
	private Ventana gui;
	private Credito c;
	private Interfaz in;
    public Controlador() {
		// TODO Auto-generated constructor stub
    	
    	c = new Credito();
    	in = new Interfaz();
    	
       // c.ingresarDatos();
		
		//in.escribirDato(c.getN(),c.getInteres(),c.convertir(),c.calcularTasaEfec(),c.calcularAnualidad(),c.calcularCuota());
    	
    	gui = new Ventana(this);
    	gui.setVisible(true);
    	
	}
	
	

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(gui.getPe().CALCULAR)) {
			
			
			
			c.convertir(Double.parseDouble(gui.getPe().getTxtMonto().getText()));
			c.setN(Integer.parseInt(gui.getPe().getTxtCuota().getText()));
			c.setInteres(Double.parseDouble(gui.getPe().getTxtInteres().getText()));
			gui.getPr().getTxtMonto().setText("$"+String.valueOf(c.convertir(Double.parseDouble(gui.getPe().getTxtMonto().getText()))));
			gui.getPr().getTxtInteres().setText(String.valueOf(c.getInteres()));
			gui.getPr().getTxtTe().setText(String.valueOf(c.calcularTasaEfec()+"%"));
			gui.getPr().getTxtAn().setText(String.valueOf(c.calcularAnualidad()));
			gui.getPr().getTxtM().setText(String.valueOf("$"+c.calcularCuota(Double.parseDouble(gui.getPe().getTxtMonto().getText()))));
			
			
			
		}
		
	}

}
