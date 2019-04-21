package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labTasa;
	private JLabel labAnualidad;
	private JLabel labValor;
	
	private JTextField txtTasa;
	private JTextField txtAnualidad;
	private JTextField txtValor;
	
	public PanelResultados() {
		
		setLayout(new GridLayout(3,2));
		TitledBorder border = BorderFactory.createTitledBorder("Calculo de crédito: ");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		labTasa = new JLabel("Tasa efectiva:");
		txtTasa = new JTextField("0");
		
		labAnualidad = new JLabel("Valor anualidad:");
		txtAnualidad = new JTextField("0");
		
		labValor = new JLabel("Valor cuotas:");
		txtValor = new JTextField("0");
		
		add(labTasa);
		add(txtTasa);
		
		
		add(labAnualidad);
		add(txtAnualidad);
		
		
		add(labValor);
		add(txtValor);
		
		
	}
	
	

}