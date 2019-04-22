package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador implements ActionListener {
	private Mundo bd;
	private InterfazGUI gui;
	
	public Controlador() throws IOException {
		bd = new Mundo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		try {
			
		if(evento.getActionCommand().equals(gui.getPanelEntrada().CALCULAR)) {
			bd.getCalculo().setPeriodo(Integer.parseInt(gui.getPanelEntrada().getTxtPeriodo().getText()));
			bd.getCalculo().setInteres(Double.parseDouble(gui.getPanelEntrada().getTxtInteres().getText()));
			bd.getCalculo().setInversion(Double.parseDouble(gui.getPanelEntrada().getTxtInversion().getText()));
			
			
			gui.getPanelResultados().getTxtTasa().setText(String.valueOf(bd.getCalculo().calcularTasa(Double.parseDouble(gui.getPanelEntrada()
					.getTxtInteres().getText()))) + "%");
			gui.getPanelResultados().getTxtAnualidad().setText(String.valueOf(bd.getCalculo().calcularAnualidad(
					bd.getCalculo().getTasaEfectiva(), Integer.parseInt(gui.getPanelEntrada().getTxtPeriodo().getText()))));
			
			gui.getPanelResultados().getTxtCuota().setText(String.valueOf(bd.getCalculo().calcularCuota(
					Double.parseDouble(gui.getPanelEntrada().getTxtInversion().getText()), bd.getCalculo().getValorAnualidad())));
			
			gui.getPanelEntrada().getButConvertir().setEnabled(false);
			gui.getPanelResultados().getButCalculo().setEnabled(true);
			gui.getPanelEntrada().getTxtInteres().setEditable(false);
			gui.getPanelEntrada().getTxtInversion().setEditable(false);
			gui.getPanelEntrada().getTxtPeriodo().setEditable(false);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(evento.getActionCommand().equals(gui.getPanelResultados().RESULTADOS)) {
			
			gui.getPanelResultado().getModelo().addRow(new Object[] {
					"0",bd.getCalculo().calcularSaldoResta()
			});
			
			for (int i = 1; i < Integer.parseInt(gui.getPanelEntrada().getTxtPeriodo().getText()) ; i++) {
				bd.getCalculo().calcularAmortizacion();
				gui.getPanelResultado().getModelo().addRow(new Object[] {
						String.valueOf(i),bd.getCalculo().calcularSaldoResta(),bd.getCalculo().getCuota(),
						bd.getCalculo().calcularValorInteres(), bd.getCalculo().calcularAmortizacion()
				});
			
				
			}
			gui.getPanelResultado().getModelo().addRow(new Object[] {
					bd.getCalculo().getPeriodo(),"0",bd.getCalculo().getCuota(),
					bd.getCalculo().calcularValorInteres(), bd.getCalculo().calcularAmortizacion()
			});
			gui.getPanelResultados().getButCalculo().setEnabled(false);
			
		}
		}
	}

