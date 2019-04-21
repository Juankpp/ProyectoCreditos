package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	private JLabel labCuotas;
	private JLabel labInteres;
	private JLabel labMonto;
	private JTextField txtCuotas;
	private JTextField txtInteres;
	private JTextField txtMonto;
	private JButton butMostrar;
	
	public static final String CALCULAR = "calcular";
	public PanelEntrada() {
		setLayout(new GridLayout(5,2));
		TitledBorder border = BorderFactory.createTitledBorder("Información de crédito: ");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		labCuotas = new JLabel("Ingrese el número de cuotas:");
		txtCuotas = new JTextField("");
		
		
		labInteres = new JLabel("Ingrese el interes del crédito:");
		txtInteres = new JTextField("");
		
		
		labMonto = new JLabel("Ingrese el monto a financiar:");
		txtMonto = new JTextField("");
		
		butMostrar = new JButton("Calcular");
		butMostrar.setActionCommand(CALCULAR);
		
		
		add(labCuotas);
		add(txtCuotas);
		
		add(labInteres);
		add(txtInteres);
		
		add(labMonto);
		add(txtMonto);
		
		add(new JLabel(""));
		add(new JLabel(""));
		
		add(new JLabel(""));
		add(butMostrar);
		
		
	}
	
	
}