package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel labMonto;
	private JTextField txtMonto;
	private JLabel labCuota;
	private JTextField txtCuota;
	private JLabel labInteres;
	private JTextField txtInteres;
	private JButton btCalcular;
	public static final String CALCULAR = "calcular";
	
	public PanelEntrada() {
		setLayout(new GridLayout(4, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labMonto = new JLabel("Monto(En COP$)");
		txtMonto = new JTextField("");
		labCuota = new JLabel("# de Cuotas");
		txtCuota = new JTextField("");
		labInteres = new JLabel("Tasa de interes(En %)");
		txtInteres = new JTextField("");
		btCalcular = new JButton("Calcular");
		btCalcular.setActionCommand(CALCULAR);
		
		add(labMonto);
		add(txtMonto);
		add(labCuota);
		add(txtCuota);
		add(labInteres);
		add(txtInteres);
		add(new JLabel(""));
		add(btCalcular);
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}

	public JTextField getTxtCuota() {
		return txtCuota;
	}

	public void setTxtCuota(JTextField txtCuota) {
		this.txtCuota = txtCuota;
	}

	public JTextField getTxtInteres() {
		return txtInteres;
	}

	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}

	public JButton getBtCalcular() {
		return btCalcular;
	}

	public void setBtCalcular(JButton btCalcular) {
		this.btCalcular = btCalcular;
	}
	
	

}
