package Vista;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Interfaz {

	public Interfaz() 
	{

		
	}

	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el periodo","PERIODO",JOptionPane.INFORMATION_MESSAGE));
	}

	
	public String pedirDato2() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el interes","INTERES",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirDato3() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese la inversion","INVERSION",JOptionPane.INFORMATION_MESSAGE));
	}

	public void escribirDato1(String dato) 
	{
	
		JOptionPane.showMessageDialog(null,"TASA: " + dato, "TASA", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato3(String dato) 
	{
	
		JOptionPane.showMessageDialog(null,"ANUALIDAD: " + dato, "ANUALIDAD", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDato4(String dato) 
	{
	
		JOptionPane.showMessageDialog(null,"CUOTA: " + dato, "CUOTA", JOptionPane.INFORMATION_MESSAGE);
	}
	
    public void escribitDato2(String dato) {
		    JFrame f = new JFrame("TABLA");
		    JPanel Panel = new JPanel();
		    Panel.setLayout(new GridLayout(1 , 1));
		    f.getContentPane().add(Panel);
		    JTextArea ta = new JTextArea(dato, 20, 20);
		    ta.setLineWrap(true);
		    ta.setWrapStyleWord(true);
		    Panel.add(new JScrollPane(ta));
		    f.pack();
		    f.setVisible(true);
		  }
 

}
