package Vista;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel periodo;
	private JLabel interes;
	private JLabel inversion;
	private JTextField txtPeriodo;
	private JTextField txtInteres;
	private JTextField txtInversion;
	private JButton butConvertir;
	public static final String CALCULAR = "Calcular";
	
	public PanelEntrada() {
		setLayout(new GridLayout(4,2));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		periodo= new JLabel("Ingrese el periodo");
		interes = new JLabel("Ingrese el interes");
		inversion = new JLabel("Ingrese su inversion");
		txtPeriodo = new JTextField("");
		txtPeriodo.setForeground(Color.BLACK);
		txtPeriodo.setBackground(Color.WHITE);
		txtInteres = new JTextField("");
		txtInteres.setForeground(Color.BLACK);
		txtInteres.setBackground(Color.WHITE);
		txtInversion = new JTextField("");
		txtInversion.setForeground(Color.BLACK);
		txtInversion.setBackground(Color.WHITE);
		butConvertir = new JButton("Calcular");
		butConvertir.setActionCommand(CALCULAR);
		add(periodo);
		add(txtPeriodo);
		add(interes);
		add(txtInteres);
		add(inversion);
		add(txtInversion);
		add(new JLabel(""));
		add(butConvertir);		
	}

	

	public JLabel getPeriodo() {
		return periodo;
	}



	public void setPeriodo(JLabel periodo) {
		this.periodo = periodo;
	}



	public JLabel getInteres() {
		return interes;
	}



	public void setInteres(JLabel interes) {
		this.interes = interes;
	}



	public JLabel getInversion() {
		return inversion;
	}



	public void setInversion(JLabel inversion) {
		this.inversion = inversion;
	}



	public JTextField getTxtPeriodo() {
		return txtPeriodo;
	}



	public void setTxtPeriodo(JTextField txtPeriodo) {
		this.txtPeriodo = txtPeriodo;
	}



	public JTextField getTxtInteres() {
		return txtInteres;
	}



	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}



	public JTextField getTxtInversion() {
		return txtInversion;
	}



	public void setTxtInversion(JTextField txtInversion) {
		this.txtInversion = txtInversion;
	}



	

	public JButton getButConvertir() {
		return butConvertir;
	}



	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getCalcular() {
		return CALCULAR;
	}
	
}