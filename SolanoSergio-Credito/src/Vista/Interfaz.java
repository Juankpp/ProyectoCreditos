package Vista;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controlador.Controlador;

public class Interfaz extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Entrada entrada;
	private Calculo calculos;

	public Interfaz(Controlador control){
		
		setSize(600,500);
		setResizable(false);
		setTitle("Crédito");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		entrada = new Entrada();
		add(entrada, BorderLayout.NORTH);
		entrada.getButDatos().addActionListener(control);
		
		calculos = new Calculo();
		add(calculos,BorderLayout.CENTER);
		calculos.getButRegresar().addActionListener(control);
		calculos.getMostrarTabla().addActionListener(control);

		
	}
	
	public Entrada getEntrada(){
		return entrada;
	}
	
	public Calculo getCalculos(){
		
		return calculos;
	}
	
	public void generarCalculos(String pValores){
		
		calculos.setValores(pValores);
	}
	
	public void escribirTabla(String calculo){
		
		JOptionPane.showMessageDialog(null, calculo, "Tabla de Amortización: ", JOptionPane.INFORMATION_MESSAGE);	
	}
}