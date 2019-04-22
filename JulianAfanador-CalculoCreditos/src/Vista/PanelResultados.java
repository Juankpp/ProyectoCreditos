package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel tasaEfectiva;
	private JLabel valorAnualidad;
	private JLabel cuota;
	private JTextField txtTasa;
	private JTextField txtAnualidad;
	private JTextField txtCuota;
	private JButton butCalculo;
	public static final String RESULTADOS = "Resultados";
	public PanelResultados() {
		setLayout(new GridLayout(4,2));
		TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
		borde.setTitleColor(Color.BLACK);
		setBorder(borde);
		tasaEfectiva = new JLabel("Tasa efectiva: ");
		valorAnualidad = new JLabel("Valor anualidad: ");
		cuota = new JLabel("Cuota: ");
		txtTasa = new JTextField("");
		txtTasa.setForeground(Color.BLACK);
		txtTasa.setBackground(Color.WHITE);
		txtTasa.setEditable(false);
		txtAnualidad = new JTextField("");
		txtAnualidad.setForeground(Color.BLACK);
		txtAnualidad.setBackground(Color.WHITE);
		txtAnualidad.setEditable(false);
		txtCuota = new JTextField("");
		txtCuota.setForeground(Color.BLACK);
		txtCuota.setBackground(Color.WHITE);
		txtCuota.setEditable(false);
		butCalculo = new JButton("Resultados");
		butCalculo.setActionCommand(RESULTADOS);
		butCalculo.setEnabled(false);
		add(tasaEfectiva);
		add(txtTasa);
		add(valorAnualidad);
		add(txtAnualidad);
		add(cuota);
		add(txtCuota);
		add(new JLabel());
		add(butCalculo);
		
	}

	public JLabel getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(JLabel tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public JLabel getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(JLabel valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public JLabel getCuota() {
		return cuota;
	}

	public void setCuota(JLabel cuota) {
		this.cuota = cuota;
	}

	public JTextField getTxtTasa() {
		return txtTasa;
	}

	public void setTxtTasa(JTextField txtTasa) {
		this.txtTasa = txtTasa;
	}

	public JTextField getTxtAnualidad() {
		return txtAnualidad;
	}

	public void setTxtAnualidad(JTextField txtAnualidad) {
		this.txtAnualidad = txtAnualidad;
	}

	public JTextField getTxtCuota() {
		return txtCuota;
	}

	public void setTxtCuota(JTextField txtCuota) {
		this.txtCuota = txtCuota;
	}

	public JButton getButCalculo() {
		return butCalculo;
	}

	public void setButCalculo(JButton butCalculo) {
		this.butCalculo = butCalculo;
	}
	
	
}
