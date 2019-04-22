package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Entrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel periodo;
	private JLabel interes;
	private JLabel inversion;
	private JTextField peri;
	private JTextField inte;
	private JTextField inver;
	private JButton butDatos;
	public static final String datos = "CALCULAR";
	
	public Entrada(){
		
		setLayout(new GridLayout(4,2));
		TitledBorder border = BorderFactory.createTitledBorder("datos de entrada");
		border.setTitleColor(Color.black);
		setBorder(border);
		periodo = new JLabel("Período: ");
		peri = new JTextField("");
		interes = new JLabel("interes: ");
		inte = new JTextField("");
		inversion = new JLabel("inversión: ");
		inver = new JTextField("");
		butDatos = new JButton("Calcular");
		butDatos.setActionCommand(datos);	
		add(periodo);
		add(peri);
		add(interes);
		add(inte);
		add(inversion);
		add(inver);
		add(new JLabel(""));
		add(butDatos);
		
	}

	public JTextField getPeri() {
		return peri;
	}

	public JTextField getInte() {
		return inte;
	}

	public JTextField getInver() {
		return inver;
	}

	public JButton getButDatos() {
		return butDatos;
	}
	
	public void cambiarEstadoCampos(boolean bul){
		peri.setEditable(bul);
		inte.setEnabled(bul);
		inver.setEnabled(bul);
		butDatos.setEnabled(bul);
	}
	
	public void reiniciarValores(){
		
		peri.setText(null);
		inte.setText(null);
		inver.setText(null);
	}
}
