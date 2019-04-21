package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Calculos;
import Vista.InterfazGUI;

public class Controlador implements ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Calculos bd;
	
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	
	public Controlador() {

	//aqui van los constructores tanto de Mundo, como de Vista
		
	bd = new Calculos();
	gui = new InterfazGUI(this);
	gui.setVisible(true);
		
}
	
	public void actionPerformed(ActionEvent evento) {

		if(evento.getActionCommand().equals(gui.getPanelEntrada().CALCULAR))
		{
			String periodos = gui.getPanelEntrada().getTxtPeriodos().getText();		
			String interes = gui.getPanelEntrada().getTxtInteres().getText();
			String inversion = gui.getPanelEntrada().getTxtInversion().getText();
			double tasaefectiva = bd.cal_Tasa(interes);
			double anualidad = bd.cal_Anual(tasaefectiva,periodos);
			double cuota = bd.cal_Cuota(inversion,anualidad); 		
			gui.getPanelEntrada().getTxtTasaEfectiva().setText("" + tasaefectiva);
			gui.getPanelEntrada().getTxtAnualidad().setText("" + anualidad);
			gui.getPanelEntrada().getTxtCuota().setText("" + cuota);
			cal_Tabla(periodos, tasaefectiva, inversion, cuota);			
		}

	}

    public void cal_Tabla(String per, double tasa_ef, String inv, double cuota) {
		double per1 = Double.parseDouble(per);
		double saldo = Double.parseDouble(inv);
    	double interes_per, amortizacion;
    	String resultado,fila;
    	fila="<html><br>Periodo| Saldo ($) |  Cuota ($) | Intereses ($) | Amortización ($) </br>";
    	resultado=fila;
    	for (int i=0;i<=per1;i++){
            if (i==0){
                 fila="<br>"+String.format("%5d",i)+" | "+String.format("%11.2f", saldo)+"</br>";
            } else {
                 interes_per = saldo*tasa_ef;
                 amortizacion = cuota-interes_per;
                 saldo = saldo-amortizacion;
                 fila="<br> "+String.format("%2d",i)+" | "+String.format("%11.2f", saldo)+" | "+String.format("%11.2f", cuota)+" | "+String.format("%11.2f", interes_per)+" | "+String.format("%11.2f", amortizacion)+" </br> ";
            }
            resultado=resultado+fila;
		}
    	resultado=resultado+"</html>";
		gui.getPanelResultados().getFilaSalida().setText("<html><br>"+resultado+"</br></html>");
    }
    
    

}