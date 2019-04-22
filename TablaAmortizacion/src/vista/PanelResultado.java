package vista;

import java.awt.*;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel {
	private static final long serialVersionUID=1L;
	private JLabel labResultado;
	private JLabel labResultado2;
	private JLabel labResultado3;
	private JTextField txtMonto;
	private JTextField txtMonto2;
	private JTextField txtMonto3;
	
	public PanelResultado() {
		setLayout(new GridLayout(3, 2));
		TitledBorder border= BorderFactory.createTitledBorder("resultados");
		border.setTitleColor(Color.black);
		setBorder(border);
		labResultado= new JLabel("La Anualidad es:");
		labResultado2= new JLabel("La tasa efectiva es:");
		labResultado3= new JLabel("La cuota es:");
		txtMonto= new JTextField("");
		txtMonto.setForeground(Color.black);
		txtMonto.setBackground(Color.white);
		txtMonto2= new JTextField("");
		txtMonto2.setForeground(Color.black);
		txtMonto2.setBackground(Color.white);
		txtMonto3= new JTextField("");
		txtMonto3.setForeground(Color.black);
		txtMonto3.setBackground(Color.white);
		add(labResultado);
		add(txtMonto);
		add(labResultado2);
		add(txtMonto2);
		add(labResultado3);
		add(txtMonto3);
		
	}
	public JLabel getLabResultado() {
		return labResultado;
	}
	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}
	public JTextField getTxtMonto() {
		return txtMonto;
	}
	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
}
	public JLabel getLabResultado2() {
		return labResultado2;
	}
	public void setLabResultado2(JLabel labResultado2) {
		this.labResultado2 = labResultado2;
	}
	public JLabel getLabResultado3() {
		return labResultado3;
	}
	public void setLabResultado3(JLabel labResultado3) {
		this.labResultado3 = labResultado3;
	}
	public JTextField getTxtMonto2() {
		return txtMonto2;
	}
	public void setTxtMonto2(JTextField txtMonto2) {
		this.txtMonto2 = txtMonto2;
	}
	public JTextField getTxtMonto3() {
		return txtMonto3;
	}
	public void setTxtMonto3(JTextField txtMonto3) {
		this.txtMonto3 = txtMonto3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

