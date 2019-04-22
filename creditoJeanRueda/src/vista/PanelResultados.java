package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel labTe;
	private JTextField txtTe;
	private JLabel labMonto;
	private JTextField txtMonto;
	private JLabel labM;
	private JTextField txtM;
	private JLabel labInteres;
	private JTextField txtInteres;
	private JLabel labAn;
	private JTextField txtAn;
	
	
	public PanelResultados() {
		setLayout(new GridLayout(4, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labTe = new JLabel("Tasa Efectiva:");
		txtTe = new JTextField("");
		labMonto = new JLabel("Para pagar: ");
		txtMonto = new JTextField("");
		labM = new JLabel("Mensualidad");
		txtM = new JTextField("");
		labInteres = new JLabel("Tasa de interes(En %)");
		txtInteres = new JTextField("");
		labAn = new JLabel("Anualidad:");
		txtAn = new JTextField("");
		
		add(labMonto);
		add(txtMonto);
		add(labTe);
		add(txtTe);
		add(labAn);
		add(txtAn);
		add(labM);
		add(txtM);
	
		
	}


	public JTextField getTxtTe() {
		return txtTe;
	}


	public void setTxtTe(JTextField txtTe) {
		this.txtTe = txtTe;
	}


	public JTextField getTxtMonto() {
		return txtMonto;
	}


	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}


	public JTextField getTxtM() {
		return txtM;
	}


	public void setTxtM(JTextField txtM) {
		this.txtM = txtM;
	}


	public JTextField getTxtInteres() {
		return txtInteres;
	}


	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}


	public JTextField getTxtAn() {
		return txtAn;
	}


	public void setTxtAn(JTextField txtAn) {
		this.txtAn = txtAn;
	}
	
	

	
	

}
