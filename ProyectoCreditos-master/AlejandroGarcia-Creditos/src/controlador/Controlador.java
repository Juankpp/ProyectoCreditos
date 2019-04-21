package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import modelo.Mundo;
import modelo.Tabla;
import vista.Ventana;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Controlador implements ActionListener{
	private Mundo mundo;
	private Ventana vista;
	DecimalFormat porcen = new DecimalFormat("#,##%");
	DecimalFormat dineros = new DecimalFormat("\u00A5###,###.#");

	public Controlador() {
		vista = new Ventana(this);
		mundo = new Mundo();
		
		vista.setVisible(true);
	}
	
	public void llenarDatos() {
		
		try {
			double intereses=  Double.parseDouble(vista.getPanelDatos().getTxtIntereses().getText());
			int periodo = Integer.parseInt(vista.getPanelDatos().getTxtNumCuotas().getText());
			double dinero = Double.parseDouble(vista.getPanelDatos().getTxtInvercion().getText());
			
			mundo.getCredito().setInvercion(dinero);
			mundo.getCredito().setPeriodo(periodo);
			double tazaEf = mundo.calTazaEf(intereses);//qutar la variable y
			double ValAnual = mundo.calValorAnual(tazaEf, periodo);//qutar la variable y 
			double ValCuota = mundo.calValorCuota(dinero, ValAnual);//qutar la variable y 

			vista.getPanelDatos().getLbrTasaEfectiva().setText(porcen.format(tazaEf));//setText(mundo.getCredito().getTazaEfectiva())
			vista.getPanelDatos().getLbrValorAnual().setText(String.valueOf((ValAnual)));//setText(mundo.getCredito().getTazaEfectiva())
			vista.getPanelDatos().getLbrCuota().setText(dineros.format(ValCuota));//setText(mundo.getCredito().getTazaEfectiva())
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "si usa decimales use puntos ","ERROR",2);
		}
		
		
	}
	public void llenarTabla() {
		mundo.iniciarFila0();
		while( mundo.getTabla().getPeriodo()<= mundo.getCredito().getPeriodo()) {		
		String[] fila =mundo.getFilas();
		
		vista.getPanelTabla().getDtm().addRow(fila);
		mundo.calFilas();
		

		
		}
		
	}
	
	public void limpiarTabla() {
		int i = 0;
		while(0==i) {
			try {
				vista.getPanelTabla().getDtm().removeRow(i);
				mundo.iniciarTabla();
			} catch (ArrayIndexOutOfBoundsException e) {
				i++;
			}
		}	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals(vista.SALIR)) {
			limpiarTabla();
			llenarDatos();
			llenarTabla();
			 
		}
		
	}
	

}
