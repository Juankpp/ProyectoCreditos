package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labPeriodos;
	private	JTextField txtPeriodos;
	private JLabel labInteres;
	private	JTextField txtInteres;
	private JLabel labInversion;
	private	JTextField txtInversion;
	private	JTextField txtTasaefectiva;
	private JLabel labTasaefectiva;
	private	JTextField txtAnualidad;
	private JLabel labAnualidad;
	private	JTextField txtCuota;
	private JLabel labCuota;
	
	private JButton butCalcular;
	public static final String CALCULAR = "Calcular";
	
	public PanelEntrada() {
		
		setLayout(new GridLayout(7,7));
		TitledBorder border = BorderFactory.createTitledBorder("Datos Básicos");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		labPeriodos = new JLabel ("Periodos:");
		txtPeriodos = new JTextField("");
		txtPeriodos.setForeground(Color.BLACK);
		txtPeriodos.setBackground(Color.WHITE);
		
		labInteres = new JLabel ("Tasa de Interés (%):");
		txtInteres = new JTextField("");
		txtInteres.setForeground(Color.BLACK);
		txtInteres.setBackground(Color.WHITE);

		labInversion = new JLabel ("Inversión:");
		txtInversion = new JTextField("");
		txtInversion.setForeground(Color.BLACK);
		txtInversion.setBackground(Color.WHITE);
		
		butCalcular = new JButton ("Calcular");
		butCalcular.setActionCommand(CALCULAR);
		
		labTasaefectiva = new JLabel ("Tasa Efectiva (%):");
		txtTasaefectiva = new JTextField("");
		txtTasaefectiva.setForeground(Color.BLACK);
		txtTasaefectiva.setBackground(Color.WHITE);
		
		labAnualidad = new JLabel ("Anualidad:");
		txtAnualidad = new JTextField("");
		txtAnualidad.setForeground(Color.BLACK);
		txtAnualidad.setBackground(Color.WHITE);
		
		labCuota = new JLabel ("Cuota Fija:");
		txtCuota = new JTextField("");
		txtCuota.setForeground(Color.BLACK);
		txtCuota.setBackground(Color.WHITE);
		
		add(labPeriodos);
		add(txtPeriodos);

		add(labInteres);
		add(txtInteres);

		add(labInversion);
		add(txtInversion);
		
		add(new JLabel (""));
		add(butCalcular);
		
		add(labTasaefectiva);
		add(txtTasaefectiva);
		
		add(labAnualidad);
		add(txtAnualidad);
		
		add(labCuota);
		add(txtCuota);
	}

	public JTextField getTxtPeriodos() {
		return txtPeriodos;
	}

	public JTextField getTxtInteres() {
		return txtInteres;
	}

	public JTextField getTxtInversion() {
		return txtInversion;
	}
	
	public JTextField getTxtTasaEfectiva() {
		return txtTasaefectiva;
	}
	
	public JTextField getTxtAnualidad() {
		return txtAnualidad;
	}
	
	public JTextField getTxtCuota() {
		return txtCuota;
	}

	public void setTxtPeriodos(JTextField txtPeriodos) {
		this.txtPeriodos = txtPeriodos;
	}
	
	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}
	
	public void setTxtInversion(JTextField txtInversion) {
		this.txtInversion = txtInversion;
	}
	
	public void setTxtTasaEfectiva(JTextField txtTasaefectiva) {
		this.txtTasaefectiva = txtTasaefectiva;
	}
	
	public void setTxtAnualidad(JTextField txtAnualidad) {
		this.txtAnualidad = txtAnualidad;
	}
	
	public void setTxtCuota(JTextField txtCuota) {
		this.txtCuota = txtCuota;
	}

	public void setButCalcular(JButton butCalcular) {
		this.butCalcular = butCalcular;
	}

	public JButton getButCalcular() {
		return butCalcular;
	}
}
