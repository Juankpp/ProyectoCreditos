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
	private static final long serialVersionUID=1L;
	private JLabel LabEntrada;
	private JTextField txtnumero;
	private JLabel LabEntrada2;
	private JTextField txtnumero2;
	private JButton butConvertir;
	private JButton butMostrarTabla;
	private JLabel LabEntrada3;
	private JTextField txtnumero3;
	public static final String CALCULAR="Calcular";
	public static final String MOSTRAR="Mostrar";
	public PanelEntrada()
	{
		setLayout(new GridLayout(2, 2));
		TitledBorder border=BorderFactory.createTitledBorder("datos de entrada");
		border.setTitleColor(Color.black);
		setBorder(border);
		LabEntrada= new JLabel("Ingrese la tasa de interes");
		LabEntrada2=new JLabel("Ingrese la Inversion");
		LabEntrada3=new JLabel("Ingrese el periodo");
		txtnumero= new JTextField("");
		txtnumero2= new JTextField("");
		txtnumero3= new JTextField("");
		txtnumero.setForeground(Color.black);
		txtnumero.setBackground(Color.white);
		txtnumero2.setForeground(Color.BLACK);
		txtnumero2.setBackground(Color.WHITE);
		txtnumero3.setForeground(Color.BLACK);
		txtnumero3.setBackground(Color.WHITE);
		butConvertir= new JButton("Calcular");
		butConvertir.setActionCommand(CALCULAR);
		butMostrarTabla= new  JButton("Mostrar");
		butMostrarTabla.setActionCommand(MOSTRAR);
		add(LabEntrada);
		add(txtnumero);
		add(LabEntrada2);
		add(txtnumero2);
		add(LabEntrada3);
		add(txtnumero3);
		
		
		
		add(butConvertir);
		add(butConvertir);
	}
	public JButton getButConvertir() {
		return butConvertir;
	}
	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}
	public JLabel getLabEntrada() {
		return LabEntrada;
	}
	public void setLabEntrada(JLabel labEntrada) {
		LabEntrada = labEntrada;
	}
	public JTextField getTxtnumero() {
		return txtnumero;
	}
	public void setTxtnumero(JTextField txtnumero) {
		this.txtnumero = txtnumero;
	}
	public JLabel getLabEntrada2() {
		return LabEntrada2;
	}
	public void setLabEntrada2(JLabel labEntrada2) {
		LabEntrada2 = labEntrada2;
	}
	public JTextField getTxtnumero2() {
		return txtnumero2;
	}
	public void setTxtnumero2(JTextField txtnumero2) {
		this.txtnumero2 = txtnumero2;
	}
	public JLabel getLabEntrada3() {
		return LabEntrada3;
	}
	public void setLabEntrada3(JLabel labEntrada3) {
		LabEntrada3 = labEntrada3;
	}
	public JTextField getTxtnumero3() {
		return txtnumero3;
	}
	public void setTxtnumero3(JTextField txtnumero3) {
		this.txtnumero3 = txtnumero3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static String getConvertir() {
		return CALCULAR;
	}
}
