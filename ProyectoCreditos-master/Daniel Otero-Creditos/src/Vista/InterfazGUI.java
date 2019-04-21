package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Controlador.Controlador;

public class InterfazGUI extends JFrame{
	
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultado;
	private PruebaTabla pruebaTabla;
	public InterfazGUI(Controlador control, String[][] pCredito) {
		setSize(700,600);
		setResizable(false);
		setTitle("Credito");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		//panelEntrada = new PanelEntrada();
		//add(panelEntrada,BorderLayout.NORTH);
		
		//panelResultado = new PanelResultados();
		//add(panelResultado,BorderLayout.WEST);
		
		pruebaTabla = new PruebaTabla(pCredito);
		add(pruebaTabla,BorderLayout.NORTH);
		
	}

}