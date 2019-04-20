package vista;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Interfaz
{
	private JFrame frame;
	private JScrollPane scroll;
	private JTable tabla;
//	private JTextArea area;
	
	public Interfaz()
	{
		frame = new JFrame();
//		area = new JTextArea();
	}
	
	public void getMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje,"Datos de salida", 1);
	}
	
	public void getMensajeErroneo(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje, "Error", 0);
	}
	
	public String capturarDato(String mensaje)
	{
		String pro = JOptionPane.showInputDialog(null, mensaje, "Datos de entrada",3);
		return pro;
	}
	
	public void mostrarTabla(String[][] valores, String[] nombres)
	{
		frame.setLayout(new FlowLayout());
		frame.setSize(470, 470);
		frame.setTitle("CUOTA CONSTANTE EN PESOS");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		tabla = new JTable(valores, nombres);
		scroll = new JScrollPane(tabla);
		scroll.setSize(800,750);
		frame.add(scroll);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	
/* Otra Manera de hacerlo	
	
	public void mostrarTabla(String tabla)
	{
		frame.setSize(800, 750);
		frame.setTitle("CUOTA CONSTANTE EN PESOS");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		area.setText(tabla);
		scroll = new JScrollPane(area);
		frame.add(scroll);
		frame.setVisible(true);
		
	} */
}