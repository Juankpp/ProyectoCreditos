package vista;
/**
 * @author Alejandro Garcia olarte
 *
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{
	
	private JLabel lbNumCuotas;
	private JLabel lbIntereses;
	private JLabel lbInvercion;
	private JLabel lbTasaEfectiva;
	private JLabel lbValorAnual;
	private JLabel lbCuota;


	private JTextField txtNumCuotas;
	private JTextField txtIntereses;
	private JTextField txtInvercion;
	private JLabel lbrTasaEfectiva;
	private JLabel lbrValorAnual;
	private JLabel lbrCuota;


	private Ventana vista;
	
	public PanelDatos(Ventana pVista) {
		vista = pVista;
		setLayout(null);
		setBorder(new TitledBorder("Ingrese sus datos"));
		
		lbNumCuotas = new JLabel("Periodo:");
		lbIntereses = new JLabel("Interes:");
		lbInvercion = new JLabel("Invercion:");
		lbTasaEfectiva = new JLabel("Tasa Efectiva:");
		lbValorAnual = new JLabel("Valor Anual:");
		lbCuota = new JLabel("Cuota:");

		txtNumCuotas = new JTextField("");
		txtIntereses = new JTextField("");
		txtInvercion = new JTextField("");
		lbrTasaEfectiva = new JLabel("");
		lbrValorAnual = new JLabel("");
		lbrCuota = new JLabel("");
		
		int y = 30;
		int x = 10;
		
		add(lbNumCuotas);
		lbNumCuotas.setBounds(x, y, 120, 20);
		add(txtNumCuotas);
		txtNumCuotas.setBounds(x*7, y, 190, 20);
		
		add(lbIntereses);
		lbIntereses.setBounds(x, y*2, 120, 20);
		add(txtIntereses);
		txtIntereses.setBounds(x*7, y*2, 190, 20);
		
		add(lbInvercion);
		lbInvercion.setBounds(x, y*3, 120, 20);
		add(txtInvercion);
		txtInvercion.setBounds(x*7, y*3, 190, 20);
		
		add(lbTasaEfectiva);
		lbTasaEfectiva.setBounds(x, y*4, 120, 20);
		add(lbrTasaEfectiva);
		lbrTasaEfectiva.setBounds(x*10, y*4, 190, 20);
		
		add(lbValorAnual);
		lbValorAnual.setBounds(x, y*5, 120, 20);
		add(lbrValorAnual);
		lbrValorAnual.setBounds(x*10, y*5, 190, 20);
		
		add(lbCuota);
		lbCuota.setBounds(x, y*6, 120, 20);
		add(lbrCuota);
		lbrCuota.setBounds(x*10, y*6, 190, 20);


	}

	public JLabel getLbNumCuotas() {
		return lbNumCuotas;
	}

	public void setLbNumCuotas(JLabel lbNumCuotas) {
		this.lbNumCuotas = lbNumCuotas;
	}

	public JLabel getLbIntereses() {
		return lbIntereses;
	}

	public void setLbIntereses(JLabel lbIntereses) {
		this.lbIntereses = lbIntereses;
	}

	public JLabel getLbInvercion() {
		return lbInvercion;
	}

	public void setLbInvercion(JLabel lbInvercion) {
		this.lbInvercion = lbInvercion;
	}

	public JLabel getLbTasaEfectiva() {
		return lbTasaEfectiva;
	}

	public void setLbTasaEfectiva(JLabel lbTasaEfectiva) {
		this.lbTasaEfectiva = lbTasaEfectiva;
	}

	public JLabel getLbValorAnual() {
		return lbValorAnual;
	}

	public void setLbValorAnual(JLabel lbValorAnual) {
		this.lbValorAnual = lbValorAnual;
	}

	public JLabel getLbCuota() {
		return lbCuota;
	}

	public void setLbCuota(JLabel lbCuota) {
		this.lbCuota = lbCuota;
	}

	public JTextField getTxtNumCuotas() {
		return txtNumCuotas;
	}

	public void setTxtNumCuotas(JTextField txtNumCuotas) {
		this.txtNumCuotas = txtNumCuotas;
	}

	public JTextField getTxtIntereses() {
		return txtIntereses;
	}

	public void setTxtIntereses(JTextField txtIntereses) {
		this.txtIntereses = txtIntereses;
	}

	public JTextField getTxtInvercion() {
		return txtInvercion;
	}

	public void setTxtInvercion(JTextField txtInvercion) {
		this.txtInvercion = txtInvercion;
	}

	public JLabel getLbrTasaEfectiva() {
		return lbrTasaEfectiva;
	}

	public void setLbrTasaEfectiva(JLabel lbrTasaEfectiva) {
		this.lbrTasaEfectiva = lbrTasaEfectiva;
	}

	public JLabel getLbrValorAnual() {
		return lbrValorAnual;
	}

	public void setLbrValorAnual(JLabel lbrValorAnual) {
		this.lbrValorAnual = lbrValorAnual;
	}

	public JLabel getLbrCuota() {
		return lbrCuota;
	}

	public void setLbrCuota(JLabel lbrCuota) {
		this.lbrCuota = lbrCuota;
	}
	

}
