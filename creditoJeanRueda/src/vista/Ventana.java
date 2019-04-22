package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import controlador.Controlador;


public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelEntrada pe;
	private PanelResultados pr;
	
	public Ventana(Controlador control) {
		setLayout(new BorderLayout());
		setTitle("Calculadora de Credito");
		setSize(350, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pe = new PanelEntrada();
		pr = new PanelResultados();
		
		add(pe, BorderLayout.NORTH);
		add(pr,BorderLayout.CENTER);
		
		pe.getBtCalcular().addActionListener(control);
		
	}

	public PanelEntrada getPe() {
		return pe;
	}

	public void setPe(PanelEntrada pe) {
		this.pe = pe;
	}

	public PanelResultados getPr() {
		return pr;
	}

	public void setPr(PanelResultados pr) {
		this.pr = pr;
	}
	
	

}
