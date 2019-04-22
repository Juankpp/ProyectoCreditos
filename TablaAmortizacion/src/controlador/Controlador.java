package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.Tabla;
import vista.Interfaz;
import vista.InterfazGUI;

public class Controlador implements ActionListener {
public Mundo bd;
//public Interfaz gui;
private InterfazGUI gui;
private Tabla tabla;
public Controlador()
{
	bd= new Mundo();
	gui= new InterfazGUI(this);
	
	gui.setVisible(true);
	
	//gui= new Interfaz();
	
	/*bd.getC().setIntereses(Double.parseDouble(gui.pedirIntereses()));
	bd.getC().setInversion(Double.parseDouble(gui.pedirInversion()));
	bd.getC().setPeriodo(Double.parseDouble(gui.pedirPeriodo()));
	gui.mostrar(bd.getC().tasaEfectiva(bd.getC().getIntereses()));
	gui.mostrar(bd.getC().Anualidad(bd.getC().getTasaEfectiva(), bd.getC().getPeriodo()));
	gui.mostrar(bd.getC().cuota());
	*/
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getActionCommand().equalsIgnoreCase(gui.getPanelEntrada().getConvertir()))
{
	bd.getC().setIntereses(Double.parseDouble((gui.getPanelEntrada().getTxtnumero().getText())));
	bd.getC().setPeriodo(Double.parseDouble(gui.getPanelEntrada().getTxtnumero3().getText()));
	bd.getC().setInversion(Double.parseDouble(gui.getPanelEntrada().getTxtnumero2().getText()));
	gui.getPanelResultados().getTxtMonto().setText(""+bd.getC().tasaEfectiva(bd.getC().getIntereses())+"%");
	gui.getPanelResultados().getTxtMonto2().setText(""+bd.getC().Anualidad(bd.getC().getTasaEfectiva(), bd.getC().getPeriodo())+"%");
	gui.getPanelResultados().getTxtMonto3().setText("$"+bd.getC().cuota());
	bd.getT().columna1(bd.getC().getPeriodo(), bd.getC().getCuota(), bd.getC().getInversion(), bd.getC().getIntereses(), bd.getC().getTasaEfectiva());
	tabla= new Tabla(bd.getT().getTabla());
	tabla.setVisible(true);
}
}
}
