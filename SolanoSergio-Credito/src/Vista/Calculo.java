package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Calculo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel periodo;
	private JLabel valorPeriodo;
	private JLabel interes;
	private JLabel valorInteres;
	private JLabel inversion;
	private JLabel valorInversion;
	private JLabel tasaEfectiva;
	private JLabel valorTasaEfectiva;
	private JLabel anualidad;
	private JLabel valorAnualidad;
	private JLabel cuota;
	private JLabel valorCuota;
	private JButton butRegresar;
	private JButton butMostrarTabla;
	public final static String regresar = "REGRESAR";
	public final static String calcular = "MOSTRAR TABLA";
	
	
	public Calculo(){
		
		setLayout(new GridLayout(8,2));
		TitledBorder border = BorderFactory.createTitledBorder("Calculos del crédito");
		border.setTitleColor(Color.black);
		setBorder(border);
		periodo = new JLabel("Período: ");
		valorPeriodo = new JLabel("------");
		interes = new JLabel("Interes: ");
		valorInteres = new JLabel("------");
		inversion = new JLabel("inversión: ");
		valorInversion = new JLabel("------");
		tasaEfectiva = new JLabel("Tasa Efectiva: ");
		valorTasaEfectiva = new JLabel("------");
		anualidad = new JLabel("Anualidad: ");
		valorAnualidad = new JLabel("------");
		cuota = new JLabel("cuota: ");
		valorCuota = new JLabel("------");
		butRegresar = new JButton("Regresar");
		butRegresar.setActionCommand(regresar);
		butRegresar.setEnabled(false);
		butMostrarTabla = new JButton("Mostrar Tabla");
		butMostrarTabla.setActionCommand(calcular);
		butMostrarTabla.setEnabled(false);
		add(periodo);
		add(valorPeriodo);
		add(interes);
		add(valorInteres);
		add(inversion);
		add(valorInversion);
		add(tasaEfectiva);
		add(valorTasaEfectiva);
		add(anualidad);
		add(valorAnualidad);
		add(cuota);
		add(valorCuota);
		add(butMostrarTabla);
		add(butRegresar);
		
	}
	
	public void setValores(String pVal){
		
		String[] val = pVal.split(" ");
		valorPeriodo.setText(val[0]);
		valorInteres.setText(val[1]);
		valorInversion.setText(val[2]);
		valorTasaEfectiva.setText(val[3]);
		valorAnualidad.setText(val[4]);
		valorCuota.setText(val[5]);
	}
	
	public JButton getButRegresar(){
		
		return butRegresar;
	}
	
	public JButton getMostrarTabla(){
		
		return butMostrarTabla;
	}
	
	public void cambiarEstadoBoton(boolean pBul){
		
		butRegresar.setEnabled(pBul);
		butMostrarTabla.setEnabled(pBul);
	}
	
	public void regresarResultados(){
		
		valorPeriodo.setText("------");
		valorInteres.setText("------");
		valorInversion.setText("------");
		valorTasaEfectiva.setText("------");
		valorAnualidad.setText("------");
		valorCuota.setText("------");
	}
	
	public void cambiarEstadoBotonTabla(boolean bul){
		
		butMostrarTabla.setEnabled(bul);
	}

}
